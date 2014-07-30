package com.liusy.core.web.form;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Title: 数据管理中心
 * </p>
 * <p>
 * Description:Struts Form基本表单派生类
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
public class InputForm extends BaseForm {
   private static final long   serialVersionUID = 1L;

   private Map<String, String> record;

   public Map<String, String> getRecord() {
      if (record == null) record = new HashMap<String, String>();
      return record;
   }

   public void setRecord(Map<String, String> record) {
      this.record = record;
   }

}
