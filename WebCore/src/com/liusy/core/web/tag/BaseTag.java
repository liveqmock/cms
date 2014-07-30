package com.liusy.core.web.tag;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.commons.beanutils.PropertyUtils;

public class BaseTag extends BodyTagSupport {
   private static final long serialVersionUID = 1L;

   protected String          height           = null;
   protected String          width            = null;
   protected String          styleClass       = null;
   protected String          style            = null;
   protected String          styleid          = null;
   protected String          align            = null;
   protected String          valign           = null;
   protected String          name             = null;
   protected String          title            = null;
   protected String          property         = null;
   protected String          accesskey        = null;
   protected String          tabindex         = null;
   protected String          alt              = null;
   protected String          altKey           = null;
   protected String          bundle           = null;
   protected String          cellPadding      = null;
   protected String          cellSpacing      = null;

   protected String          disabled         = null;
   protected String          readonly         = null;

   // Events
   protected String          onmouseover      = null;
   protected String          onmouseout       = null;
   protected String          onclick          = null;
   protected String          ondblclick       = null;
   protected String          onmousemove      = null;
   protected String          onmousedown      = null;
   protected String          onmouseup        = null;
   protected String          onkeydown        = null;
   protected String          onkeyup          = null;
   protected String          onkeypress       = null;
   protected String          onselect         = null;
   protected String          onchange         = null;
   protected String          onblur           = null;
   protected String          onfocus          = null;

   public void setHeight(String x) {
      this.height = x;
   }

   public void setStyleClass(String x) {
      this.styleClass = x;
   }

   public void setStyle(String x) {
      this.style = x;
   }

   public void setStyleId(String x) {
      this.styleid = x;
   }

   public void setAlign(String x) {
      this.align = x;
   }

   public void setValign(String x) {
      this.valign = x;
   }

   public void setName(String x) {
      this.name = x;
   }

   public void setTitle(String x) {
      this.title = x;
   }

   public void setProperty(String x) {
      this.property = x;
   }

   public void setWidth(String x) {
      this.width = x;
   }

   public void setAccesskey(String x) {
      this.accesskey = x;
   }

   public void setTabindex(String x) {
      this.tabindex = x;
   }

   public void setAlt(String x) {
      this.alt = x;
   }

   public void setAltKey(String x) {
      this.altKey = x;
   }

   public void setBundle(String x) {
      this.bundle = x;
   }

   public void setDisabled(String x) {
      this.disabled = x;
   }

   public void setReadonly(String x) {
      this.readonly = x;
   }

   public void setOnMouseOver(String x) {
      this.onmouseover = x;
   }

   public void setOnMouseOut(String x) {
      this.onmouseout = x;
   }

   public void setOnClick(String x) {
      this.onclick = x;
   }

   public void setOnDblClick(String x) {
      this.ondblclick = x;
   }

   public void setOnMouseMove(String x) {
      this.onmousemove = x;
   }

   public void setOnMouseDown(String x) {
      this.onmousedown = x;
   }

   public void setOnMouseUp(String x) {
      this.onmouseup = x;
   }

   public void setOnKeyDown(String x) {
      this.onkeydown = x;
   }

   public void setOnKeyUp(String x) {
      this.onkeyup = x;
   }

   public void setOnKeyPress(String x) {
      this.onkeypress = x;
   }

   public void setOnSelect(String x) {
      this.onselect = x;
   }

   public void setOnChange(String x) {
      this.onchange = x;
   }

   public void setOnBlur(String x) {
      this.onblur = x;
   }

   public void setOnFocus(String x) {
      this.onfocus = x;
   }

   public String getName() {
      return this.name;
   }

   public void putProperties(HtmlAttributes base) {
      base.setAccessKey(accesskey);
      base.setAlign(align);
      base.setAlt(alt);
      base.setAltKey(altKey);
      base.setBundle(bundle);
      base.setDisabled(disabled);
      base.setHeight(height);
      base.setName(name);
      base.setProperty(property);
      base.setReadonly(readonly);
      base.setStyle(style);
      base.setStyleClass(styleClass);
      base.setStyleId(styleid);
      base.setTitle(title);
      base.setTabIndex(tabindex);
      base.setValign(valign);
      base.setWidth(width);

      base.setOnDblClick(ondblclick);
      base.setOnBlur(onblur);
      base.setOnChange(onchange);
      base.setOnClick(onclick);
      base.setOnFocus(onfocus);
      base.setOnKeyDown(onkeydown);
      base.setOnKeyPress(onkeypress);
      base.setOnKeyUp(onkeyup);
      base.setOnMouseDown(onmousedown);
      base.setOnMouseMove(onmousemove);
      base.setOnMouseOut(onmouseout);
      base.setOnMouseOver(onmouseover);
      base.setOnMouseUp(onmouseup);
      base.setOnSelect(onselect);
   }

   protected void saveException(Throwable exception) {
      TagUtils.saveException(pageContext, exception);
   }

   public void release() {
      super.release();

      name = null;
      title = null;
      property = null;
      width = null;
      height = null;
      style = null;
      styleClass = null;
      styleid = null;
      align = null;
      valign = null;
      accesskey = null;
      tabindex = null;
      alt = null;
      altKey = null;
      bundle = null;

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
               Map<String, String> map = (HashMap<String, String>) object;
               result = map.get(property);
            }
         } catch (Exception ex) {
            result = null;
         }
      }
      return result;
   }

   public String getCellPadding() {
      return cellPadding;
   }

   public void setCellPadding(String cellPadding) {
      this.cellPadding = cellPadding;
   }

   public String getCellSpacing() {
      return cellSpacing;
   }

   public void setCellSpacing(String cellSpacing) {
      this.cellSpacing = cellSpacing;
   }
}
