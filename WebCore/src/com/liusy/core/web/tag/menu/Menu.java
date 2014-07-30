package com.liusy.core.web.tag.menu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Menu {
   private List<MenuItem> items;
   private String         title;
   private String         id;
   private Set<String>    rights;
   private String         code;
   private String         img;

   public void addItem(MenuItem item) {
      if (items == null) items = new ArrayList<MenuItem>();
      items.add(item);
   }

   public void generateMenu(StringBuffer sb) {
      StringBuffer sb1 = new StringBuffer("");
      int idx = 0;
      for (int i = 0; i < getItems().size(); i++) {
         MenuItem item = (MenuItem) items.get(i);
         String img = item.getImg() == null ? "" : item.getImg();
         String mType = item.getType() == null ? "" : item.getType();
         if (mType.equalsIgnoreCase("separator")) {
            sb1.append("<item id=\"" + item.getCode() + "\"  type=\"separator\"/>");
         }
         else {
            if (item.getCode()==null||"".equals(item.getCode())||rights.contains(item.getCode())) {
               sb1.append("<item id=\"" + item.getCode() + "\" text=\"" + item.getText() + "\" img=\"" + img + "\" ");
               if (item.getOnclick() != null && item.getOnclick().length() > 0) {
                  sb1.append(">");
                  sb1.append("<userdata name=\"onclick\"><![CDATA[" + item.getOnclick().replace("'", "\\'") + "]]></userdata>");
               }
               else {
                  sb1.append("enabled=\"false\" >");
               }
               sb1.append("</item>");
               idx++;
            }
         }
      }
      if (sb1.length() > 0) {
         String imgstr = img == null ? "" : " img=\"" + img + "\"";
         sb.append("menustr+='" + "<item id=\"" + code + "\" text=\"" + title + "\"" + imgstr + " >");
         sb.append(sb1);
         sb.append("</item>';");
      }
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public List<MenuItem> getItems() {
      if (items == null) items = new ArrayList<MenuItem>();
      return items;
   }

   public void setItems(List<MenuItem> items) {
      this.items = items;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Set<String> getRights() {
      if (rights == null) rights = new HashSet<String>();
      return rights;
   }

   public void setRights(Set<String> rights) {
      this.rights = rights;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getImg() {
      return img;
   }

   public void setImg(String img) {
      this.img = img;
   }

}
