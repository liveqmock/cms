package com.liusy.core.dao.impl;

import com.liusy.core.dao.SqlGenerator;


public class OracleSqlGenerator extends CommonSqlGenerator implements SqlGenerator {

   public String generatePageSql(String querySql, int pageNo, int pageSize) {
      String strSQL = querySql.trim();

      StringBuffer pagingSelect = new StringBuffer("select * from (select t.*,rownum as rn from(");
      pagingSelect.append(strSQL).append(") t where rownum<=");

      int fromNums = (pageNo - 1) * pageSize;
      int toNums = fromNums + pageSize;

      pagingSelect.append(toNums).append(") where rn > ").append(fromNums);

      return pagingSelect.toString();
   }
}