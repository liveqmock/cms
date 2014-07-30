package com.liusy.cms.model;

import java.io.Serializable;

/**
 * This is an object that contains data related to the cms_catalog table.
 *
 * @hibernate.class
 *  table="cms_catalog"
 */

public class Catalog implements Serializable {
    private static final long serialVersionUID = 1L;

   // primary key  
   private java.lang.Integer id;   //  

   // properties

   private java.lang.String name;   //

   private java.lang.Integer parentId;   //

   private java.lang.String remark;   // 

   private java.lang.Integer sort;   // 

   private java.lang.String type;   //  subject标题、img:图片、ueditor富文本


   // Constructors
   public Catalog() {
   }


public java.lang.Integer getId() {
	return id;
}


public void setId(java.lang.Integer id) {
	this.id = id;
}


public java.lang.String getName() {
	return name;
}


public void setName(java.lang.String name) {
	this.name = name;
}


public java.lang.Integer getParentId() {
	return parentId;
}


public void setParentId(java.lang.Integer parentId) {
	this.parentId = parentId;
}


public java.lang.String getRemark() {
	return remark;
}


public void setRemark(java.lang.String remark) {
	this.remark = remark;
}


public java.lang.Integer getSort() {
	return sort;
}


public void setSort(java.lang.Integer sort) {
	this.sort = sort;
}


public java.lang.String getType() {
	return type;
}


public void setType(java.lang.String type) {
	this.type = type;
}

 
}
