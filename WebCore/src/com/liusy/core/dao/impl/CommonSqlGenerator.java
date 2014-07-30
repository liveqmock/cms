package com.liusy.core.dao.impl;

import com.liusy.core.dao.JdbcDao;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.dao.util.SqlFactory;

public abstract class CommonSqlGenerator {

   private SqlFactory sqlFactory;

   public String generatePageSql(String querySql, PageQuery pageQuery) {
      pageQuery.setQuerySql(querySql);
      return generatePageSql(pageQuery);
   }

   public String generatePageSql(PageQuery pageQuery) {
      return generatePageSql(pageQuery.getQuerySql(), Integer.parseInt(pageQuery.getPageNumber()), Integer.parseInt(pageQuery.getPageSize()));
   }

   public abstract String generatePageSql(String querySql, int pageNo, int pageSize);

   public String generateCountSql(String strSQL) {
      return generateCountSql(strSQL, null);
   }

   public String generateCountSql(String strSQL, String countColumn) {
      String cntSelect;
      if (countColumn == null||countColumn.trim().length()==0)
         cntSelect = "select count(*) as " + JdbcDao.COUNT_COLUMN + " ";
      else
         cntSelect = "select count(" + countColumn + ") as " + JdbcDao.COUNT_COLUMN + " ";
      String str = strSQL.trim().toLowerCase();
      int nFromPos = str.indexOf(" from ");
      int nOrderPos = str.lastIndexOf(" order by ");
      if (nOrderPos == -1) nOrderPos = str.length();

      StringBuffer strBuf = new StringBuffer();
      strBuf.append(cntSelect).append(strSQL.substring(nFromPos, nOrderPos));
      return strBuf.toString();
   }

   public String generateSqlBySelectId(String sqlId, PageQuery pageQuery) {
      String str = sqlFactory.get(sqlId);
      pageQuery.setQuerySql(str);

      return generatePageSql(pageQuery);
   }
}