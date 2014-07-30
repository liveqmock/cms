package com.liusy.core.service.impl;

import java.util.Map;

import com.liusy.core.dao.JdbcDao;
import com.liusy.core.service.BaseService;

public class BaseServiceImpl implements BaseService{

   protected JdbcDao jdbcDao;
   
   public JdbcDao getJdbcDao() {
      return jdbcDao;
   }

   public void setJdbcDao(JdbcDao jdbcDao) {
      this.jdbcDao = jdbcDao;
   }

   private Map<String, String> sqls;

   public Map<String, String> getSqls() {
      return sqls;
   }

   public void setSqls(Map<String, String> sqls) {
      this.sqls = sqls;
   }
}
