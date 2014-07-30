package com.liusy.core.common;
/**
 * <p> Title: 代码vo </p>
 * 
 * <p> Description: 用户表示一个代码 </p>
 * 
 * <p> Copyright: Copyright (c) 2009 </p>
 * 
 * <p> Company: </p>
 * 
 * @author liusy
 * @version 1.0
 */
public class Code {

   private String codeName; // 代码名称

   private String value; // 代码值

   private String parentCodeId; // 父代码ID

   private String parentCodeValue; // 父代码名称

   public Code(String codeName, String value) {
      this.codeName = codeName;
      this.value = value;
      this.parentCodeId = null;
      this.parentCodeValue = null;
   }

   public Code(String codeName, String value, String pcodeid, String pvalue) {
      this.codeName = codeName;
      this.value = value;
      this.parentCodeId = pcodeid;
      this.parentCodeValue = pvalue;
   }

   public Code() {
      this.codeName = null;
      this.value = null;
   }

   public String getCodeName() {
      return codeName;
   }

   public void setCodeName(String codeName) {
      this.codeName = codeName;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getParentCodeValue() {
      return parentCodeValue;
   }

   public void setParentCodeValue(String parentCodeValue) {
      this.parentCodeValue = parentCodeValue;
   }

   public String getParentCodeId() {
      return parentCodeId;
   }

   public void setParentCodeId(String parentCodeId) {
      this.parentCodeId = parentCodeId;
   }

}
