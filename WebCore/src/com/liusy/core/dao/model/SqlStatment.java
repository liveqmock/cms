package com.liusy.core.dao.model;

import java.util.ArrayList;
import java.util.List;

public class SqlStatment {
   private String           id;
   private String           countColumn;
   private String           orderBy;
   private String           sql;
   private List<Parameters> parameters = new ArrayList<Parameters>();

   public List<Parameters> getParameters() {
      return parameters;
   }

   public void setParameters(List<Parameters> parameters) {
      this.parameters = parameters;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getCountColumn() {
      return countColumn;
   }

   public void setCountColumn(String countColumn) {
      this.countColumn = countColumn;
   }

   public String getSql() {
      return sql;
   }

   public void setSql(String sql) {
      this.sql = sql;
   }

   public String getOrderBy() {
      return orderBy;
   }

   public void setOrderBy(String orderBy) {
      this.orderBy = orderBy;
   }

}
