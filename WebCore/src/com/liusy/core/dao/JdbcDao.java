package com.liusy.core.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.DAOException;

/**
 * <p>
 * Title:JDBC访问接口
 * </p>
 * 
 * <p>
 * Description:通用的JDBC访问接口
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2009-2011
 * </p>
 * 
 * <p>
 * Company:Golead
 * </p>
 * 
 * @author liusy
 * @version 1.0
 */
public interface JdbcDao {

   public PageQuery queryBySql(PageQuery page) throws DAOException;

   public PageQuery queryBySqlId(String sqlId, PageQuery page) throws DAOException;

   public List<Map<String, Object>> queryBySql(String sqlStr) throws DAOException;

   public List<Map<String, Object>> queryBySql(String sqlStr, Object value) throws DAOException;

   public List<Map<String, Object>> queryBySql(String sqlStr, Object[] parameterValues) throws DAOException;

//   public List<Map<String, Object>> queryBySql(String sqlStr, Object[] parameterValues, int[] types) throws DAOException;

   public List<Map<String, Object>> queryBySqlId(String sqlId) throws DAOException;

   public List<Map<String, Object>> queryBySqlId(String sqlId, Object value) throws DAOException;

   public List<Map<String, Object>> queryBySqlId(String sqlId, Object[] parameterValues) throws DAOException;

   public int queryIntBySql(String sqlStr) throws DAOException;

   public int queryIntBySql(String sqlStr, Object[] parameterValues) throws DAOException;

//   public int queryIntBySql(String sqlStr, Object[] parameterValues, int[] types) throws DAOException;

   public String getSql(String sqlId) throws DAOException;

   public int queryIntBySqlId(String sqlId) throws DAOException;

   public int queryIntBySqlId(String sqlId, Object[] parameterValues) throws DAOException;

   public JdbcTemplate getJdbcTemplate();
   
   public String DATE_FORMAT      = "yyyy-MM-dd";
   public String TIME_FORMAT      = "HH:mm:ss";
   public String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";

   public String ID_COLUMN        = "id";
   public String COUNT_COLUMN     = "cnt";
}