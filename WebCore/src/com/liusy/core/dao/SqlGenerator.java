package com.liusy.core.dao;

import com.liusy.core.dao.model.PageQuery;


/**
 * <p> Title: 数据管理中心 </p> <p> Description:基类:Sql生成器接口 </p> <p> Copyright:
 * Copyright (c) 2009-2011 </p> <p> Company:Golead </p>
 * 
 * @author liusy
 * @version 1.2
 */
public interface SqlGenerator {

   public String generateCountSql(String querySql);

   public String generateCountSql(String querySql,String countColumn);

   public String generatePageSql(String querySql, int pageNo, int pageSize);

   public String generatePageSql(String querySql, PageQuery pageQuery);

   public String generatePageSql(PageQuery pageQuery);

   public String generateSqlBySelectId(String sqlId, PageQuery queryString);

}