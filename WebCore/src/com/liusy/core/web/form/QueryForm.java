package com.liusy.core.web.form;

import com.liusy.core.dao.model.PageQuery;

/**
 * <p>
 * Title: 数据管理中心
 * </p>
 * <p>
 * Description:Struts Form 查询表单派生类
 * </p>
 * <p>
 * Copyright: Copyright (c) 2009-2011
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author liusy
 * @version 1.2
 */
public class QueryForm extends BaseForm {

   private static final long   serialVersionUID = 1L;

   private PageQuery           query;

   private String[]            itemIds;

   public String[] getItemIds() {
      return itemIds;
   }

   public void setItemIds(String[] itemIds) {
      this.itemIds = itemIds;
   }

   public PageQuery getQuery() {
      if (query == null) query = new PageQuery();
      return query;
   }

   public void setQuery(PageQuery query) {
      this.query = query;
   }
}
