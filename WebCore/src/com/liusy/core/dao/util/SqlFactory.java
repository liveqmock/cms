package com.liusy.core.dao.util;

import java.util.HashMap;
import java.util.Map;

public class SqlFactory {

   private Map<String, String> sqls;

   public Map<String, String> getSqls() {
      return sqls;
   }

   public void setSqls(Map<String, String> sqls) {
      this.sqls = sqls;
   }

   public SqlFactory() {
      sqls = new HashMap<String, String>();
   }

   public String get(String sqlId) {
      return sqls.get(sqlId);
   }
}
