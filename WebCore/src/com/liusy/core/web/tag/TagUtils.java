package com.liusy.core.web.tag;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

import org.apache.commons.beanutils.PropertyUtils;

public class TagUtils {

   // 在指定的scpoe范围内寻找pageContext中的某个属性。
   public static Object lookup(PageContext pageContext, String name, String property, String scope) throws JspException {
      String msg = "";
      Object bean = lookup(pageContext, name, scope);
      if (bean == null) {
         JspException e = null;
         if (scope == null) {
            msg = "Cannot find bean {0} in any scope.";
            e = new JspException(getMessage(msg, name));
         }
         else {
            msg = "Cannot find bean {0} in scope {1}.";
            e = new JspException(getMessage(msg, name, scope));
         }
         saveException(pageContext, e);
         throw e;
      }

      if (property == null) return bean;

      try {
         return PropertyUtils.getProperty(bean, property);
      }
      catch (IllegalAccessException e) {
         saveException(pageContext, e);
         msg = "Invalid access looking up property {0} of bean {1}.";
         throw new JspException(getMessage(msg, property, name));
      }
      catch (IllegalArgumentException e) {
         saveException(pageContext, e);
         msg = "Invalid argument looking up property {0} of bean {1}.";
         throw new JspException(getMessage(msg, property, name));
      }
      catch (InvocationTargetException e) {
         Throwable t = e.getTargetException();
         if (t == null) t = e;
         saveException(pageContext, t);
         msg = "Exception thrown by getter for property {0} of bean {1}.";
         throw new JspException(getMessage(msg, property, name));
      }
      catch (NoSuchMethodException e) {
         saveException(pageContext, e);
         msg = "No getter method for property {0} of bean {1}.";
         throw new JspException(getMessage(msg, property, name));
      }
   }

   public static void write(PageContext pageContext, String text) throws JspException {
      JspWriter writer = pageContext.getOut();

      try {
         writer.print(text);
      }
      catch (IOException e) {
         saveException(pageContext, e);
         throw new JspException("can not get pageContext.");
      }
   }

   // 将Array,collection,map等转换成Iterator。
   public static Iterator getIterator(Object collection) throws JspException {
      if (collection.getClass().isArray()) {
         collection = Arrays.asList((Object[]) collection);
      }
      if (collection instanceof Collection) {
         return (((Collection) collection).iterator());
      }
      else if (collection instanceof Iterator) {
         return ((Iterator) collection);
      }
      else if (collection instanceof Map) {
         return (((Map) collection).entrySet().iterator());
      }
      else {
         throw new JspException("Cannot create iterator for " + collection.toString() + ".");
      }
   }

   // 在指定的scpoe范围内寻找pageContext中的某个属性。
   public static Object lookup(PageContext pageContext, String name, String scopeName) throws JspException {
      if (scopeName == null) return pageContext.findAttribute(name);
      try {
         return pageContext.getAttribute(name, getScope(scopeName));
      }
      catch (JspException e) {
         saveException(pageContext, e);
         throw e;
      }
   }

   // 将字符串中的特殊字符转换成html认可的格式。
   public static String filter(String value) {
      if (value == null || value.length() == 0) return value;

      StringBuffer result = null;
      String filtered = null;
      for (int i = 0; i < value.length(); i++) {
         filtered = null;
         switch (value.charAt(i)) {
         case '<':
            filtered = "&lt;";
            break;
         case '>':
            filtered = "&gt;";
            break;
         case '&':
            filtered = "&amp;";
            break;
         case '"':
            filtered = "&quot;";
            break;
         case '\'':
            filtered = "&#39;";
            break;
         }
         if (result == null) {
            if (filtered != null) {
               result = new StringBuffer(value.length() + 50);
               if (i > 0) result.append(value.substring(0, i));
               result.append(filtered);
            }
         }
         else {
            if (filtered == null) result.append(value.charAt(i));
            else result.append(filtered);
         }
      }
      return result == null ? value : result.toString();
   }

   // 按照不同的格式输出字符串,是对java.text.MessageFormat的包装。
   public static String getMessage(String key) {
      return getMessage(key, null);
   }

   public static String getMessage(String key, Object arg0) {
      return getMessage(key, new Object[] { arg0 });
   }

   public static String getMessage(String key, Object arg0, Object arg1) {
      return getMessage(key, new Object[] { arg0, arg1 });
   }

   public static String getMessage(String key, Object arg0, Object arg1, Object arg2) {
      return getMessage(key, new Object[] { arg0, arg1, arg2 });
   }

   public static String getMessage(String key, Object arg0, Object arg1, Object arg2, Object arg3) {
      return getMessage(key, new Object[] { arg0, arg1, arg2, arg3 });
   }

   public static String getMessage(String key, Object args[]) {
      Locale locale = defaultLocale;
      MessageFormat format = new MessageFormat(escape(key));
      format.setLocale(locale);
      return format.format(args);
   }

   // 将字符串中的一个单引号转成两个单引号。
   protected static String escape(String string) {
      if ((string == null) || (string.indexOf('\'') < 0)) return string;

      int n = string.length();
      StringBuffer sb = new StringBuffer(n);

      for (int i = 0; i < n; i++) {
         char ch = string.charAt(i);
         if (ch == '\'') sb.append('\'');
         sb.append(ch);
      }
      return sb.toString();
   }

   // 将出现的Exception放到PageContext中。
   public static void saveException(PageContext pageContext, Throwable exception) {
      pageContext.setAttribute(TagConsts.EXCEPTION_KEY, exception, PageContext.REQUEST_SCOPE);
   }

   // 确省的Locale。
   protected static Locale defaultLocale = Locale.getDefault();

   // 建立日志对象。
   // private static final Log log = LogFactory.getLog(TagUtils.class);

   // 根据scope名字返回PageContext中定义的scope变量。
   public static int getScope(String scopeName) throws JspException {
      Integer scope = (Integer) scopes.get(scopeName.toLowerCase());
      if (scope == null) { throw new JspException("Invalid bean scope " + scopeName + "."); }
      return scope.intValue();
   }

   public static String confusion(String str) {
      if (str == null) return null;
      if (model == TagConsts.MODEL_DEBUG) return str;
      else if (model == TagConsts.MODEL_RUNNING) return str.replace("\r\n", "").replace("   ", "");
      else return str;
   }

   public static boolean isType(String strType) {
      if (strType == null) return false;
      boolean res = false;
      if (strType.equalsIgnoreCase(TagConsts.TYPE_CHECKBOX) || strType.equalsIgnoreCase(TagConsts.TYPE_CALENDAR) || strType.equalsIgnoreCase(TagConsts.TYPE_FILE) || strType.equalsIgnoreCase(TagConsts.TYPE_FORM) || strType.equalsIgnoreCase(TagConsts.TYPE_HIDDEN) || strType.equalsIgnoreCase(TagConsts.TYPE_IMAGE) || strType.equalsIgnoreCase(TagConsts.TYPE_LABEL) || strType.equalsIgnoreCase(TagConsts.TYPE_LINK) || strType.equalsIgnoreCase(TagConsts.TYPE_MULTISELECT) || strType.equalsIgnoreCase(TagConsts.TYPE_RADIO) || strType.equalsIgnoreCase(TagConsts.TYPE_SELECT) || strType.equalsIgnoreCase(TagConsts.TYPE_TEXT) || strType.equalsIgnoreCase(TagConsts.TYPE_TEXTAREA)) {
         res = true;
      }
      return res;
   }

   // 一个HashMap用来存放scope。
   private static final Map<String,Integer> scopes = new HashMap<String,Integer>();
   static {
      scopes.put("page", new Integer(PageContext.PAGE_SCOPE));
      scopes.put("request", new Integer(PageContext.REQUEST_SCOPE));
      scopes.put("session", new Integer(PageContext.SESSION_SCOPE));
      scopes.put("application", new Integer(PageContext.APPLICATION_SCOPE));
   }

   private static int       model  = TagConsts.MODEL_DEBUG;
}
