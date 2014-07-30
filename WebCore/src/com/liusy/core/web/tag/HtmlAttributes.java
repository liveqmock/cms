package com.liusy.core.web.tag;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.jsp.JspException;

import org.apache.commons.beanutils.PropertyUtils;

public class HtmlAttributes {

   protected String name        = null;
   protected String title       = null;
   protected String property    = null;
   protected String width       = null;
   protected String style       = null;
   protected String styleClass  = null;
   protected String styleid     = null;
   protected String height      = null;
   protected String align       = null;
   protected String valign      = null;
   protected String accesskey   = null;
   protected String tabindex    = null;
   protected String alt         = null;
   protected String altKey      = null;
   protected String bundle      = null;
   protected String id          = null;
   protected String nowrap      = null;
   protected String cellpadding = null;
   protected String cellspacing = null;
   protected String indexed     = null;
   protected String disabled    = null;
   protected String readonly    = null;

   protected String onmouseover = null;
   protected String onmouseout  = null;
   protected String onclick     = null;
   protected String ondblclick  = null;
   protected String onmousemove = null;
   protected String onmousedown = null;
   protected String onmouseup   = null;
   protected String onkeydown   = null;
   protected String onkeyup     = null;
   protected String onkeypress  = null;
   protected String onselect    = null;
   protected String onchange    = null;
   protected String onblur      = null;
   protected String onfocus     = null;

   public String getWidth() {
      return width;
   }

   public void setWidth(String x) {
      width = x;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String x) {
      title = x;
   }

   public String getProperty() {
      return property;
   }

   public void setProperty(String x) {
      property = x;
   }

   public String getName() {
      return name;
   }

   public void setName(String x) {
      name = x;
   }

   public String getHeight() {
      return height;
   }

   public void setHeight(String x) {
      height = x;
   }

   public String getStyleClass() {
      return styleClass;
   }

   public void setStyleClass(String x) {
      styleClass = x;
   }

   public String getStyle() {
      return style;
   }

   public void setStyle(String x) {
      style = x;
   }

   public String getStyleId() {
      return styleid;
   }

   public void setStyleId(String x) {
      styleid = x;
   }

   public String getAlign() {
      return align;
   }

   public void setAlign(String x) {
      align = x;
   }

   public String getValign() {
      return valign;
   }

   public void setValign(String x) {
      valign = x;
   }

   public String getAlt() {
      return alt;
   }

   public void setAlt(String x) {
      alt = x;
   }

   public String getAltKey() {
      return altKey;
   }

   public void setAltKey(String x) {
      altKey = x;
   }

   public String getAccessKey() {
      return accesskey;
   }

   public void setAccessKey(String x) {
      accesskey = x;
   }

   public String getTabIndex() {
      return tabindex;
   }

   public void setTabIndex(String x) {
      tabindex = x;
   }

   public String getBundle() {
      return bundle;
   }

   public void setBundle(String x) {
      bundle = x;
   }

   public String getId() {
      return id;
   }

   public void setId(String x) {
      id = x;
   }

   public String getIndexed() {
      return indexed;
   }

   public void setIndexed(String b) {
      indexed = b;
   }

   public String getDisabled() {
      return disabled;
   }

   public void setDisabled(String b) {
      disabled = b;
   }

   public String getReadonly() {
      return readonly;
   }

   public void setReadonly(String b) {
      readonly = b;
   }

   public String getOnMouseOver() {
      return onmouseover;
   }

   public void setOnMouseOver(String x) {
      onmouseover = x;
   }

   public String getOnMouseOut() {
      return onmouseout;
   }

   public void setOnMouseOut(String x) {
      onmouseout = x;
   }

   public String getOnClick() {
      return onclick;
   }

   public void setOnClick(String x) {
      onclick = x;
   }

   public String getOnDblClick() {
      return ondblclick;
   }

   public void setOnDblClick(String x) {
      ondblclick = x;
   }

   public String getOnMouseMove() {
      return onmousemove;
   }

   public void setOnMouseMove(String x) {
      onmousemove = x;
   }

   public String getOnMouseUp() {
      return onmouseup;
   }

   public void setOnMouseUp(String x) {
      onmouseup = x;
   }

   public String getOnMouseDown() {
      return onmousedown;
   }

   public void setOnMouseDown(String x) {
      onmousedown = x;
   }

   public String getOnKeyUp() {
      return onkeyup;
   }

   public void setOnKeyUp(String x) {
      onkeyup = x;
   }

   public String getOnKeyDown() {
      return onkeydown;
   }

   public void setOnKeyDown(String x) {
      onkeydown = x;
   }

   public String getOnKeyPress() {
      return onkeypress;
   }

   public void setOnKeyPress(String x) {
      onkeypress = x;
   }

   public String getOnSelect() {
      return onselect;
   }

   public void setOnSelect(String x) {
      onselect = x;
   }

   public String getOnChange() {
      return onchange;
   }

   public void setOnChange(String x) {
      onchange = x;
   }

   public String getOnBlur() {
      return onblur;
   }

   public void setOnBlur(String x) {
      onblur = x;
   }

   public String getOnFocus() {
      return onfocus;
   }

   public void setOnFocus(String x) {
      onfocus = x;
   }

   public void loadSchema(Map<String, String> props, String objectName) {
      Map<String, String> attrs = filterProperties(props, objectName);
      if (attrs == null) return;
      Iterator names = attrs.keySet().iterator();
      while (names.hasNext()) {
         String key = (String) names.next();
         try {
            String val = (String) PropertyUtils.getProperty(this, key);
            if (val == null) PropertyUtils.setProperty(this, key, (String) attrs.get(key));
         } catch (Exception e) {
         }
      }
   }

   private Map<String, String> filterProperties(Map<String, String> props, String filter) {
      if (props == null) return null;
      if (filter == null) return props;
      Map<String, String> newmap = new HashMap<String, String>();
      Iterator it = props.keySet().iterator();
      while (it.hasNext()) {
         String key = (String) it.next();
         if (key.indexOf(filter + ".") == 0) {
            String attr = key.replaceFirst(filter + ".", "");
            if (attr.indexOf(".") == -1) {
               newmap.put(attr, props.get(key));
            }
         }
      }
      return newmap;
   }

   public String toHtml() {
      StringBuffer sb = new StringBuffer();

      generateAttr(sb, "name", name);
      generateAttr(sb, "title", title);
      generateAttr(sb, "width", width);
      generateAttr(sb, "style", style);
      generateAttr(sb, "class", styleClass);
      generateAttr(sb, "styleid", styleid);
      generateAttr(sb, "height", height);
      generateAttr(sb, "align", align);
      generateAttr(sb, "valign", valign);
      generateAttr(sb, "accesskey", accesskey);
      generateAttr(sb, "tabindex", tabindex);
      generateAttr(sb, "alt", alt);
      generateAttr(sb, "altKey", altKey);
      generateAttr(sb, "bundle", bundle);
      generateAttr(sb, "id", id);

      if (disabled != null && disabled.equalsIgnoreCase("true")) sb.append(" disabled ");
      if (readonly != null && readonly.equalsIgnoreCase("true")) sb.append(" readonly ");
      if (nowrap != null && nowrap.equalsIgnoreCase("true")) sb.append(" nowrap ");

      generateAttr(sb, "onmouseover", onmouseover);
      generateAttr(sb, "onmouseout", onmouseout);
      generateAttr(sb, "onclick", onclick);
      generateAttr(sb, "ondblclick", ondblclick);
      generateAttr(sb, "onmousemove", onmousemove);
      generateAttr(sb, "onmousedown", onmousedown);
      generateAttr(sb, "onmouseup", onmouseup);
      generateAttr(sb, "onkeydown", onkeydown);
      generateAttr(sb, "onkeyup", onkeyup);
      generateAttr(sb, "onkeypress", onkeypress);
      generateAttr(sb, "onselect", onselect);
      generateAttr(sb, "onchange", onchange);
      generateAttr(sb, "onblur", onblur);
      generateAttr(sb, "onfocus", onfocus);
      return sb.toString();
   }

   protected String getParameters(String value, Object obj) throws JspException {
      if (obj == null || value == null) return null;
      String res = value.replaceAll("\\{\\}", "");
      String para = "";
      String paravalue = "";
      int start = res.indexOf("{");
      int end = res.indexOf("}");
      if (start > 0 && end > 0 && end > start) {
         para = res.substring(start + 1, end);
         Object o = getProperty(obj, para);
         if (o == null)
            paravalue = "";
         else
            paravalue = o.toString();
         res = res.replaceFirst("\\{" + para + "\\}", paravalue);
         res = getParameters(res, obj);
      }
      return res;
   }

   protected String getProperty(Object obj, String property) {
      String result = null;
      Object object = null;
      try {
         result = PropertyUtils.getProperty(obj, property).toString();
      } catch (Exception ex) {
         result = null;
      }
      if (result == null) {
         try {
            object = PropertyUtils.getProperty(obj, "parameters");
            if (object instanceof HashMap) {
               HashMap map = (HashMap) object;
               result = (String) map.get(property);
            }
         } catch (Exception ex) {
            result = null;
         }
      }
      return result;
   }

   protected void generateAttr(StringBuffer sb, String name, String value, String secondvalue) {
      if (value == null)
         generateAttr(sb, name, secondvalue);
      else
         generateAttr(sb, name, value);
   }

   protected void generateAttr(StringBuffer sb, String name, String value) {
      if (name == null || value == null) return;
      sb.append(" " + name + "=\"" + value + "\"");
   }

   public HtmlAttributes() {
      name = null;
      property = null;
      width = null;
      height = null;
      style = null;
      styleClass = null;
      align = null;
      valign = null;
      accesskey = null;
      tabindex = null;
      alt = null;
      altKey = null;
      bundle = null;
      id = null;

      indexed = null;
      disabled = null;
      readonly = null;

      onmouseover = null;
      onmouseout = null;
      onclick = null;
      ondblclick = null;
      onmousemove = null;
      onmousedown = null;
      onmouseup = null;
      onkeydown = null;
      onkeyup = null;
      onkeypress = null;
      onselect = null;
      onchange = null;
      onblur = null;
      onfocus = null;

   }

   public String getNowrap() {
      return nowrap;
   }

   public void setNowrap(String nowrap) {
      this.nowrap = nowrap;
   }
}
