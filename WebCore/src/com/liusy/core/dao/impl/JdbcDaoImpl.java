package com.liusy.core.dao.impl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.liusy.core.dao.JdbcDao;
import com.liusy.core.dao.SqlFactory;
import com.liusy.core.dao.SqlGenerator;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.dao.model.Parameters;
import com.liusy.core.dao.model.SqlStatment;
import com.liusy.core.exception.DAOException;

/**
 * <p>
 * Title: 数据管理中心
 * </p>
 * 
 * <p>
 * Description:JDBC DAO访问基类
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2009-2011
 * </p>
 * 
 * <p>
 * Company:
 * </p>
 * 
 * @author liusy
 * @version 1.2
 */
public class JdbcDaoImpl extends JdbcDaoSupport implements JdbcDao {

   private SqlGenerator sqlGenerator;

   public SqlGenerator getSqlGenerator() {
      return sqlGenerator;
   }

   public void setSqlGenerator(SqlGenerator sqlGenerator) {
      this.sqlGenerator = sqlGenerator;
   }

   private SqlFactory sqlFactory;

   public SqlFactory getSqlFactory() {
      return sqlFactory;
   }

   public void setSqlFactory(SqlFactory sqlFactory) {
      this.sqlFactory = sqlFactory;
   }

   public PageQuery queryBySql(PageQuery page) throws DAOException {
      List<Map<String, Object>> list = null;

      String sqlstr = page.getQuerySql();
      // if (logger.isInfoEnabled()) logger.info((new
      // StringBuilder()).append("querySQL: ").append(sqlstr).toString());

      // 计算总记录数的sql语句
      String sumSQL = sqlGenerator.generateCountSql(sqlstr, "");
      if (Integer.parseInt(page.getPageSize()) > 0) {

         if (page.getOrder() != null && !"".equals(page.getOrder()))
            sqlstr += " order by " + page.getOrderColumnName() + " " + page.getOrderDirection();
         // 分页的sql语句
         String pageSQL = sqlGenerator.generatePageSql(sqlstr, page);

         if (logger.isInfoEnabled()) {
            // logger.info((new
            // StringBuilder()).append("sumSQL: ").append(sumSQL).toString());
//            logger.info((new StringBuilder()).append("pageSQL: ").append(pageSQL).toString());
         }
         int total = (Integer) this.getJdbcTemplate().query(sumSQL, new ResultSetExtractor() {
            public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
               rs.next();
               return new Integer(rs.getInt(1));
            }
         });
         page.setRecordCount(String.valueOf(total));
         if (total > 0) {
            int pages = total / Integer.parseInt(page.getPageSize());
            if (total % Integer.parseInt(page.getPageSize()) != 0) pages++;
            int pageNumber = Integer.parseInt(page.getPageNumber());
            // 页面数大于最大页面数设为最大
            if (pageNumber > pages) page.setPageNumber(String.valueOf(pages));
            page.setPageCount(String.valueOf(pages));
            list = queryBySql(pageSQL);
         }
         else {
            list = new ArrayList<Map<String, Object>>();
            page.setPageCount("0");
         }
      }
      else {
         list = queryBySql(sqlstr);

         page.setRecordCount(String.valueOf(list.size()));
         page.setPageCount("1");

      }
      page.setRecordSet(list);
      return page;
   }

   // 采用字符串替代的方法，替换结果集中的参数,。
   private String setParameterValues(SqlStatment statment, Map<String, String> parameterValues) {
      String sql = statment.getSql();
      for (int i = 0; i < statment.getParameters().size(); i++) {
         Parameters p = statment.getParameters().get(i);
         if (parameterValues.containsKey(p.getId())) {
            String pv = parameterValues.get(p.getId());
            if (pv != null && pv.length() > 0) {
               pv = p.getPrefix() + " " + pv + " " + p.getSuffix();
               sql = sql.replaceAll("\\{#" + p.getId() + "\\}", pv);
            }
            else sql = sql.replaceAll("\\{#" + p.getId() + "\\}", "");// 如果未赋值，参数忽略
         }
         else sql = sql.replaceAll("\\{#" + p.getId() + "\\}", "");// 如果未赋值，参数忽略
      }
      return sql;
   }

   private PageQuery queryBySql(SqlStatment statment, PageQuery page) throws DAOException {
      List<Map<String, Object>> list = null;
      String querySQL = setParameterValues(statment, page.getParameters());
      page.setQuerySql(querySQL);
      // if (logger.isInfoEnabled()) logger.info((new
      // StringBuilder()).append("querySQL: ").append(querySQL).toString());

      // 计算总记录数的sql语句
      String sumSQL = sqlGenerator.generateCountSql(querySQL, statment.getCountColumn());
      if (Integer.parseInt(page.getPageSize()) > 0) {

         if (page.getOrder() != null && !"".equals(page.getOrder())) querySQL += " order by " + page.getOrderColumnName() + " "
               + page.getOrderDirection();
         else if (statment.getOrderBy().length() > 0) {
            querySQL += " order by " + statment.getOrderBy();
         }
         // 分页的sql语句
         String pageSQL = sqlGenerator.generatePageSql(querySQL, page);

         if (logger.isInfoEnabled()) {
            // logger.info((new
            // StringBuilder()).append("sumSQL: ").append(sumSQL).toString());
            logger.info((new StringBuilder()).append("pageSQL: ").append(pageSQL).toString());
         }
         int total;
         if (page.getValues().size() > 0) {
            total = (Integer) getJdbcTemplate().query(sumSQL, page.getValues().toArray(), new ResultSetExtractor() {
               public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                  rs.next();
                  return new Integer(rs.getInt(1));
               }
            });
         }
         else {
            total = (Integer) getJdbcTemplate().query(sumSQL, new ResultSetExtractor() {
               public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                  rs.next();
                  return new Integer(rs.getInt(1));
               }
            });
         }
         page.setRecordCount(String.valueOf(total));
         if (total > 0) {
            int pages = total / Integer.parseInt(page.getPageSize());
            if (total % Integer.parseInt(page.getPageSize()) != 0) pages++;
            int pageNumber = Integer.parseInt(page.getPageNumber());
            // 页面数大于最大页面数设为最大
            if (pageNumber > pages) page.setPageNumber(String.valueOf(pages));
            page.setPageCount(String.valueOf(pages));
            if (page.getValues().size() > 0) list = queryBySql(pageSQL, page.getValues().toArray());
            else list = queryBySql(pageSQL);
         }
         else {
            // 查询结果为空
            list = new ArrayList<Map<String, Object>>();
            page.setPageCount("0");
         }
      }
      else {
         // page.getPageSize()=0,查询结果不分页
         if (page.getValues().size() > 0) list = queryBySql(querySQL, page.getValues().toArray());
         else list = queryBySql(querySQL);

         page.setRecordCount(String.valueOf(list.size()));
         page.setPageCount("1");

      }
      page.setRecordSet(list);
      return page;
   }

   public int queryIntBySql(String sqlStr) throws DAOException {
      return getJdbcTemplate().queryForInt(sqlStr);
   }

   public int queryIntBySql(String sqlStr, Object[] parameterValues) throws DAOException {
      return getJdbcTemplate().queryForInt(sqlStr, parameterValues);
   }

   public int queryIntBySql(String sqlStr, Object[] parameterValues, int[] types) throws DAOException {
      return getJdbcTemplate().queryForInt(sqlStr, parameterValues, types);
   }

   // 暂时不支持
   public int queryIntBySql(String sqlStr, Map<String, Object> parameterValues) throws DAOException {

      return -1;
   }

   public int queryIntBySqlId(String sqlId) throws DAOException {
      String sql = sqlFactory.get(sqlId);
      if (sql == null) {
         throw new DAOException("找不到SQL语句,SQL编号:" + sqlId);
      }
      else return queryIntBySql(sql);
   }

   public int queryIntBySqlId(String sqlId, Object[] parameterValues) throws DAOException {
      String sql = sqlFactory.get(sqlId);
      if (sql == null) {
         throw new DAOException("找不到SQL语句,SQL编号:" + sqlId);
      }
      else return queryIntBySql(sql, parameterValues);
   }

   public int queryIntBySqlId(String sqlId, Map<String, Object> parameterValues) throws DAOException {
      String sql = sqlFactory.get(sqlId);
      if (sql == null) {
         throw new DAOException("找不到SQL语句,SQL编号:" + sqlId);
      }
      else return queryIntBySql(sql, parameterValues);
   }

   public List<Map<String, Object>> queryBySql(String sqlstr, Object[] parameterValues, int[] types) throws DAOException {
      return (List<Map<String, Object>>) getJdbcTemplate().queryForList(sqlstr, parameterValues, types);
   }

   public List<Map<String, Object>> queryBySql(String sqlstr, Object value) throws DAOException {
      Object[] obj = { value };
      return queryBySql(sqlstr, obj);
   }

   public List<Map<String, Object>> queryBySql(String sqlstr, Object[] parameterValues) throws DAOException {
      return (List<Map<String, Object>>) getJdbcTemplate().queryForList(sqlstr, parameterValues);
   }

   public List<Map<String, Object>> queryBySql(String sqlstr) throws DAOException {
      return (List<Map<String, Object>>) getJdbcTemplate().queryForList(sqlstr);
   }

   public PageQuery queryBySqlId(String sqlId, PageQuery pageQuery) throws DAOException {
      SqlStatment statment = sqlFactory.getStatment(sqlId);
      if (statment == null) {
         throw new DAOException("找不到SQL语句,SQL编号:" + sqlId);
      }
      else return queryBySql(statment, pageQuery);
   }

   public List<Map<String, Object>> queryBySqlId(String sqlId) throws DAOException {
      String sql = sqlFactory.get(sqlId);
      if (sql == null) {
         throw new DAOException("找不到SQL语句,SQL编号:" + sqlId);
      }
      else return queryBySql(sql);
   }

   public List<Map<String, Object>> queryBySqlId(String sqlId, Object value) throws DAOException {
      String sql = sqlFactory.get(sqlId);
      Object[] obj = { value };
      return sql == null ? null : queryBySql(sql, obj);
   }

   public List<Map<String, Object>> queryBySqlId(String sqlId, Object[] parameterValues) throws DAOException {
      String sql = sqlFactory.get(sqlId);
      return sql == null ? null : queryBySql(sql, parameterValues);
   }

   class Rse implements ResultSetExtractor {
      public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
         List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
         ResultSetMetaData rsmd = rs.getMetaData();
         int count = rsmd.getColumnCount();
         String[] columnName = new String[count];
         String[] typeName = new String[count];
         for (int k = 0; k < count; k++) {
            columnName[k] = rsmd.getColumnName(k + 1).toLowerCase();
            typeName[k] = rsmd.getColumnTypeName(k + 1);
         }

         while (rs.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            for (int i = 0; i < count; i++) {
               Object obj = rs.getObject(i + 1);
               if (rs.wasNull()) map.put(columnName[i], null);
               else map.put(columnName[i], obj);
            }
            list.add(map);
         }
         return list;
      }
   }

   public String getSql(String sqlId) throws DAOException {
      String sql = sqlFactory.get(sqlId);
      if (sql == null) {
         throw new DAOException("找不到SQL语句,SQL编号:" + sqlId);
      }
      else return sql;
   }
}