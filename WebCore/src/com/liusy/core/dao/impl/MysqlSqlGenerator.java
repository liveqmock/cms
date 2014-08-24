package com.liusy.core.dao.impl;

import com.liusy.core.dao.SqlGenerator;


public class MysqlSqlGenerator extends CommonSqlGenerator implements SqlGenerator {

   public String generatePageSql(String querySql, int pageNo, int pageSize) {
      String strSQL = querySql.trim();

      StringBuffer pagingSelect = new StringBuffer();
      
      int fromNums = (pageNo - 1) * pageSize;
      //int toNums = fromNums + pageSize;
      
	  pagingSelect.append("select * from (");
	  pagingSelect.append(strSQL).append(") t LIMIT  ").append(fromNums).append(",").append(pageSize);

      return pagingSelect.toString();
   }
}