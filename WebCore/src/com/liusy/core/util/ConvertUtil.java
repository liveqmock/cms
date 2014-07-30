package com.liusy.core.util;

import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <p>
 * Title: 数据管理中心
 * </p>
 * <p>
 * Description:对象互拷
 * </p>
 * <p>
 * Copyright: Copyright (c) 2009-2011
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author liusy
 * @version 1.2
 */
public class ConvertUtil {
   /**
    * 复制model层对象到web层对象
    * 
    * @param target
    *           目的对象
    * @param src
    *           源对象
    * @throws Exception
    */
   public static void convertToWeb(Object target, Object src) throws Exception {
      if (target == null || src == null) return;

      Map<String, Method> map = getAllSetMethodNames(target);

      Method methods[] = src.getClass().getMethods();
      for (int i = 0; i < methods.length; i++) {
         String method = methods[i].getName();
         if (method.startsWith("get") && !"getClass".equals(method)) {
            Method setMethod = map.get(method.replaceFirst("get", "set"));
            if (setMethod != null) {
               Object value = methods[i].invoke(src, (Object[]) null);
               if (value != null) {
                  setMethod.invoke(target, new Object[] { value.toString() });
               }
               else {
                  setMethod.invoke(target, new Object[] { "" });
               }
            }
         }
      }
   }

   public static void objectToMap(Map target, Object src) throws Exception {
      if (src == null || target == null) return;

      Method methods[] = src.getClass().getMethods();
      for (int i = 0; i < methods.length; i++) {
         String method = methods[i].getName();
         if (method.startsWith("get") && !"getClass".equals(method)) {
            Class type = methods[i].getReturnType();
            String key = method.replaceFirst("get", "");
            key = key.substring(0, 1).toLowerCase() + key.substring(1);
            Object value = methods[i].invoke(src, (Object[]) null);
            if (value == null) target.put(key, "");
            else {
               target.put(key, formatParamenter(type, value));
            }
         }
      }
   }

   public static void mapToObject(Object target, Map<String, String> src, boolean idInclude) throws Exception {
      if (src == null || target == null) return;

      Iterator<String> it = src.keySet().iterator();
      Method methods[] = target.getClass().getMethods();
      while (it.hasNext()) {
         String key = it.next();
         if (!idInclude && key.equals("id")) continue;
         String value = src.get(key);
         String methordName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);
         for (int i = 0; i < methods.length; i++) {
            if (methods[i].getName().equalsIgnoreCase(methordName)) {
               Class type = methods[i].getParameterTypes()[0];
               Object retValue = null;
               if (!type.getName().equalsIgnoreCase("java.lang.String") && value.equals("")) retValue = null;
               else retValue = parseParamenter(type, value);
               methods[i].invoke(target, new Object[] { retValue });
            }
         }
      }
   }

   private static String wordCase(String value) {

      return value.substring(0, 1).toUpperCase() + value.substring(1);
   }

   /**
    * 复制web层对象到model层对象
    * 
    * @param target
    *           目的对象
    * @param src
    *           源对象
    * @throws Exception
    */
   public static void convertToModel(Object target, Object src) throws Exception {
      if (target == null || src == null) return;
      if (!target.getClass().equals(src.getClass())) throw new Exception("类型不一致,本方法两个参数必须为同一类型");

      Map<String, Method> map = getAllSetMethodNames(target);

      Method methods[] = src.getClass().getMethods();
      for (int i = 0; i < methods.length; i++) {
         String method = methods[i].getName();
         if (method.startsWith("get") && !"getClass".equals(method)) {
            Method setMethod = map.get(method.replaceFirst("get", "set"));
            if (setMethod != null) {
               Object value = methods[i].invoke(src, (Object[]) null);
               if (value != null) {
                  // Class type = setMethod.getParameterTypes()[0];
                  // Object retValue = parseParamenter(type, value);
                  setMethod.invoke(target, new Object[] { value });
               }
            }
         }
      }
   }

   public static void convertToModelForUpdate(Object target, Object src) throws Exception {
      if (target == null || src == null) return;
      if (!target.getClass().equals(src.getClass())) throw new Exception("类型不一致,本方法两个参数必须为同一类型");
      Map<String, Method> map = getAllSetMethodNames(target);

      Method methods[] = src.getClass().getMethods();
      for (int i = 0; i < methods.length; i++) {
         String method = methods[i].getName();
         if (method.startsWith("get") && !"getClass".equals(method) && !"getId".equalsIgnoreCase(method)) {
            Method setMethod = map.get(method.replaceFirst("get", "set"));
            if (setMethod != null) {
               Object value = methods[i].invoke(src, (Object[]) null);
               if (value != null) {
                  // Class type = setMethod.getParameterTypes()[0];
                  // Object retValue = parseParamenter(type, value);
                  setMethod.invoke(target, new Object[] { value });
               }
            }
         }
      }
   }

   /**
    * 将一个Map中的数据复制到一个vo对象中,以map中key的值作为vo中的属性名对应复制。
    * vo对象中的属性，在map中找不到或者取出的值为null的将不做处理；
    * 取出的值为空字符串的，如果属性的类型为字符串的，直接赋值，如果是其他类型，赋null值。
    * 
    * @param target
    *           目标vo对象。
    * @param src
    *           源map对象。
    */
   public static void convertToModel(Object target, Map<String, String> src) throws Exception {
      if (target == null || src == null) return;

      Map<String, Method> map = getAllSetMethodNames(target);

      Iterator<String> set = src.keySet().iterator();
      while (set.hasNext()) {
         String method = set.next();
         Method setMethod = map.get("set" + wordCase(method));
         if (setMethod != null) {
            String value = src.get(method);
            if (value != null) {
               Class type = setMethod.getParameterTypes()[0];
               if (!type.getName().equalsIgnoreCase("java.lang.String") && value.equals("")) {
                  setMethod.invoke(target, new Object[] { null });
               }
               else {
                  Object retValue = parseParamenter(type, value);
                  setMethod.invoke(target, new Object[] { retValue });
               }
            }
         }
      }
   }

   /**
    * 将model对象转为缓存对象，去掉convertToModel的类型检查
    * 
    * @param target
    * @param src
    * @throws Exception
    */
   public static void convertToPool(Object target, Object src) throws Exception {
      if (target == null || src == null) return;

      Map<String, Method> map = getAllSetMethodNames(target);

      Method methods[] = src.getClass().getMethods();
      for (int i = 0; i < methods.length; i++) {
         String method = methods[i].getName();
         if (method.startsWith("get") && !"getClass".equals(method)) {
            Method setMethod = map.get(method.replaceFirst("get", "set"));
            if (setMethod != null) {
               Object value = methods[i].invoke(src, (Object[]) null);
               if (value != null) {
                  Class type = setMethod.getParameterTypes()[0];
                  Object retValue = parseParamenter(type, value);
                  setMethod.invoke(target, new Object[] { retValue });
               }
            }
         }
      }
   }

   private static Map<String, Method> getAllSetMethodNames(Object source) throws Exception {
      Method methods[] = source.getClass().getMethods();
      Map<String, Method> map = new HashMap<String, Method>();

      for (int i = 0; i < methods.length; i++) {
         String method = methods[i].getName();
         if (method.startsWith("set")) {
            map.put(method, methods[i]);
         }
      }
      return map;
   }

   private static String formatParamenter(Class type, Object objValue) throws Exception {
      String typeName = type.getName();
      String ret = "";

      if (type.isPrimitive()) {
         if ("int".equals(typeName)) type = Class.forName("java.lang.Integer");
         else if ("long".equals(typeName)) type = Class.forName("java.lang.Long");
         else if ("float".equals(typeName)) type = Class.forName("java.lang.Float");
         else if ("double".equals(typeName)) type = Class.forName("java.lang.Double");
         else if ("boolean".equals(typeName)) type = Class.forName("java.lang.Boolean");
         else if ("char".equals(typeName)) type = Class.forName("java.lang.Character");
         else if ("byte".equals(typeName)) type = Class.forName("java.lang.Byte");
      }

      if ("java.util.Date".equals(typeName) || "java.sql.Date".equals(typeName)) {
         String value = objValue.toString().trim();
         String ft = "yyyy-MM-dd";
         if (value.indexOf(":") > 0) ft += " hh:mm:ss";
         SimpleDateFormat format = new SimpleDateFormat(ft);
         ret = format.format((java.util.Date) objValue);
      }
      else if ("java.sql.Timestamp".equals(typeName)) {
         String ft = "yyyy-MM-dd hh:mm:ss.s";
         SimpleDateFormat format = new SimpleDateFormat(ft);
         ret = format.format((java.sql.Timestamp) objValue);
      }
      else if (typeName.startsWith("java.math.") || "java.lang.Integer".equals(typeName) || "java.lang.Long".equals(typeName)
            || "java.lang.Float".equals(typeName) || "java.lang.Double".equals(typeName)) {
         NumberFormat format = NumberFormat.getInstance();
         format.setMaximumIntegerDigits(20);
         format.setMinimumIntegerDigits(1);
         format.setGroupingUsed(false);
         ret = format.format(objValue);
      }
      else {
         ret = objValue.toString();
      }
      return ret;
   }

   private static Object parseParamenter(Class type, Object strValue) throws Exception {
      String typeName = type.getName();
      Object ret = null;
      if (type.isPrimitive()) {
         if ("int".equals(typeName)) type = Class.forName("java.lang.Integer");
         else if ("long".equals(typeName)) type = Class.forName("java.lang.Long");
         else if ("float".equals(typeName)) type = Class.forName("java.lang.Float");
         else if ("double".equals(typeName)) type = Class.forName("java.lang.Double");
         else if ("boolean".equals(typeName)) type = Class.forName("java.lang.Boolean");
         else if ("char".equals(typeName)) type = Class.forName("java.lang.Character");
         else if ("byte".equals(typeName)) type = Class.forName("java.lang.Byte");
      }

      if (typeName.startsWith("java.math.") || "java.util.Date".equals(typeName)) {
         // Constructor c = type.getConstructor(new Class[] {
         // "java.lang.String".getClass() });
         String value = strValue.toString().trim();
         if (value.indexOf(":") == -1) value += " 00:00:00";
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
         ret = format.parse(value);
         // ret = c.newInstance(new Object[] { value });
      }
      else if (typeName.equals("java.lang.String")) {
         ret = strValue.toString();
      }
      else {
         if (typeName.equals("java.sql.Timestamp") && strValue != null) {
            String value = strValue.toString().trim();
            int len = value.trim().length();
            if (len > 7 && len < 11) {
               value = value + " 00:00:00.0";
            }
            else if (len > 11 && value.indexOf(".") == -1) {
               value = value + ".0";
            }
            strValue = value;
         }
         else if (typeName.equals("java.sql.Date") && strValue != null) {
            String value = strValue.toString().trim();
            if (value.length() > 10) {
               value = value.substring(0, 10);
            }
            strValue = value;
         }
         Method method = type.getMethod("valueOf", new Class[] { "java.lang.String".getClass() });
         ret = method.invoke(type, new Object[] { strValue.toString() });
      }
      return ret;
   }

   public static String currentDate() {
      String ft = "yyyy-MM-dd";
      SimpleDateFormat format = new SimpleDateFormat(ft);
      return format.format(new java.util.Date());   
   }

   public static String currentDateTime() {
      String ft = "yyyy-MM-dd hh:mm:ss";
      SimpleDateFormat format = new SimpleDateFormat(ft);
      return format.format(new java.util.Date());   
   }
}
