package com.liusy.core.web.tag;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;

import org.apache.commons.digester.Digester;

import com.liusy.core.util.Const;
import com.liusy.core.web.tag.menu.Menu;

public class MenuTag extends BaseTag {
   private static final long serialVersionUID = 1L;

   private String title;
   private String id;
   private String code;
   private String img;

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public int doStartTag() throws JspException {
      return EVAL_BODY_BUFFERED;
   }

   public String getImg() {
      return img;
   }

   public void setImg(String img) {
      this.img = img;
   }

   public int doEndTag() throws JspException {

      StringBuffer sb = new StringBuffer("");

      try {
         BodyContent bodyContent = getBodyContent();
         String menuXML = "<menu>" + bodyContent.getString() + "</menu>";
         Menu menu = parse(menuXML);

         menu.setId(id);
         menu.setTitle(title);
         menu.setCode(code);
         menu.setImg(img);
         // 查找用户权限
         Map<String, String> rights = (Map<String, String>) TagUtils.lookup(pageContext, Const.SESSION, "privileges", "session");
         if (rights == null) rights = new HashMap<String, String>();
         menu.setRights(rights.keySet());

         menu.generateMenu(sb);
         TagUtils.write(pageContext, sb.toString());
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      return EVAL_PAGE;
   }

   private Menu parse(String str) {
      Menu menu = new Menu();
      Digester digester = new Digester();

      digester.setValidating(false);
      digester.addObjectCreate("menu", "com.liusy.core.web.tag.menu.Menu");
      digester.addSetProperties("menu");
      digester.addObjectCreate("menu/item", "com.liusy.core.web.tag.menu.MenuItem");
      digester.addSetProperties("menu/item");
      digester.addSetNext("menu/item", "addItem", "com.liusy.core.web.tag.menu.MenuItem");
      StringReader sr = new StringReader(str);
      try {
         menu = (Menu) digester.parse(sr);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return menu;
   }

}
