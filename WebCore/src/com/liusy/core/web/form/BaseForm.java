package com.liusy.core.web.form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liusy.core.common.Code;

/**
 * <p>Title: 数据管理中心</p>
 * 
 * <p>Description:Struts Form基类</p>
 * 
 * <p>Copyright: Copyright (c) 2009-2011</p>
 * 
 * <p>Company: </p>
 * 
 * @author liusy
 * @version 1.2
 */
public class BaseForm {
   private static final long serialVersionUID = 1L;

   private String action;

   private String status;

   private String errorMessage = "";

   private Map<String, List<Code>> codeSets;

   private Map<String, String> record;

   public Map<String, String> getRecord() {
      if (record == null) record = new HashMap<String, String>();
      return record;
   }

   public void setRecord(Map<String, String> record) {
      this.record = record;
   }
   
   public String getAction() {
      return action;
   }

   public void setAction(String action) {
      this.action = action;
   }

   public Map<String, List<Code>> getCodeSets() {
      if (codeSets == null) codeSets = new HashMap<String, List<Code>>();
      return codeSets;
   }

   public void setCodeSets(Map<String, List<Code>> codeSets) {
      this.codeSets = codeSets;
   }

   public String getErrorMessage() {
      return errorMessage;
   }

   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

}
