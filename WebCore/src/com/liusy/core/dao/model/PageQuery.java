package com.liusy.core.dao.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageQuery {

   protected String                    pageSize;      // 每页记录数

   protected String                    pageNumber;    // 当前页号

   protected String                    recordCount;   // 总记录数

   protected String                    pageCount;     // 总页数

   protected String                    order;         // 排序字段

   protected String                    orderDirection; // 正序/倒序

   protected Map<String, String>       parameters;    // 用户提交的其他查询条件等参数

   private List<Object>                values;

   protected List<Map<String, Object>> recordSet;     // 查询结果集

   protected String                    querySql;      // 完整的Sql语句

   public static String                ASC  = "asc";

   public static String                DESC = "desc";

   public PageQuery() {
      pageNumber = "1";
      pageSize = "0";
   }

   public void setResultField(String[] fieldArray) {

   }

   public String getOrderColumnName() {
      if (order == null) return null;
      int index;
      try {
         index = Integer.parseInt(order);
      } catch (Exception e) {
         return null;
      }
      return getColumnName(index);
   }

   public String getColumnName(int index) {
      String[] cs = getTheColumn(index);
      if (cs == null) return null;
      return cs[0].trim();
   }

   public String getColumnAlias(int index) {
      String[] cs = getTheColumn(index);
      if (cs == null) return null;
      if (cs.length < 2) return null;
      return cs[1].trim();
   }

   private String[] getTheColumn(int index) {
      if (querySql == null || querySql.length() == 0) return null;
      String str = querySql.toLowerCase();
      if (!str.startsWith("select") || str.indexOf(" from ") < 0) return null;
      String selStr = str.substring(6, str.indexOf(" from "));
      if (selStr.length() == 0) return null;
      String[] cols = selStr.trim().split(",");
      if (index < 0 || index > cols.length) return null;
      String colStr = cols[index].trim();
      if (colStr.indexOf(" as ") < 0) return null;
      return colStr.split("as");
   }

   public Map<String, String> getParameters() {
      if (parameters == null) parameters = new HashMap<String, String>();
      return parameters;
   }

   public void setParameters(Map<String, String> parameters) {
      this.parameters = parameters;
   }

   public String getPageCount() {
      return pageCount;
   }

   public void setPageCount(String pageCount) {
      this.pageCount = pageCount;
   }

   public String getPageNumber() {
      return pageNumber;
   }

   public void setPageNumber(String pageNumber) {
      this.pageNumber = pageNumber;
   }

   public String getPageSize() {
      return pageSize;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   public String getRecordCount() {
      return recordCount;
   }

   public void setRecordCount(String recordCount) {
      this.recordCount = recordCount;
   }

   public List<Map<String, Object>> getRecordSet() {
      return recordSet;
   }

   public void setRecordSet(List<Map<String, Object>> recordSet) {
      this.recordSet = recordSet;
   }

   public String getOrder() {
      return order;
   }

   public void setOrder(String order) {
      this.order = order;
   }

   public String getOrderDirection() {
      return orderDirection;
   }

   public void setOrderDirection(String orderDirection) {
      this.orderDirection = orderDirection;
   }

   public String getQuerySql() {
      return querySql;
   }

   public void setQuerySql(String querySql) {
      this.querySql = querySql;
   }

   public List<Object> getValues() {
      if (values == null) values = new ArrayList<Object>();
      return values;
   }

   public void setValues(List<Object> values) {
      this.values = values;
   }

}
