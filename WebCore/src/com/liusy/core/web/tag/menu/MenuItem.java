package com.liusy.core.web.tag.menu;

public class MenuItem {
   private String id;
   private String title;
   private String text;
   private String onclick;
   private String code;
   private String img;
   private String type;
   private String enabled;

   public String getEnabled() {
      return enabled;
   }

   public void setEnabled(String enabled) {
      this.enabled = enabled;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

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

   public String getOnclick() {
      return onclick;
   }

   public void setOnclick(String onclick) {
      this.onclick = onclick;
   }

   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getImg() {
      return img;
   }

   public void setImg(String img) {
      this.img = img;
   }
}
