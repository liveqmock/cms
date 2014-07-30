package com.liusy.core.common;

import java.util.List;
/**
 * <p> Title: 代码集vo </p>
 * 
 * <p> Description: 用户表示一个代码集 </p>
 * 
 * <p> Copyright: Copyright (c) 2009 </p>
 * 
 * <p> Company: </p>
 * 
 * @author liusy
 * @version 1.0
 */

public class CodeSet {

   protected String codeSetId; // 代码集主键
   protected String codeSetNo; // 代码集编号
   protected String name; // 代码集名称
   protected List<Code> codes; // 代码集合

   public CodeSet() {
      this.codeSetId = null;
      this.name = null;
   }

   public String getCodeSetId() {
      return codeSetId;
   }

   public void setCodeSetId(String codeSetId) {
      this.codeSetId = codeSetId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCodeSetNo() {
      return codeSetNo;
   }

   public void setCodeSetNo(String codeSetNo) {
      this.codeSetNo = codeSetNo;
   }

   public List<Code> getCodes() {
      return codes;
   }

   public void setCodes(List<Code> codes) {
      this.codes = codes;
   }
}
