package com.liusy.cms.model;

import java.io.Serializable;

public class CatalogItem implements Serializable{
	 private static final long serialVersionUID = 1L;

	   // primary key  
	   private java.lang.Integer id;   //  

	   // fields

	   private java.lang.Integer catalogId;   //  

	   private java.lang.String subject;   //  

	   private java.lang.String img;   //  
	   
	   private java.lang.Integer type;   //0:主数据，引用数据  
	   
	   private java.lang.Integer status;   // 
	   
	   private java.lang.String centent;   //  

	   private java.lang.String createUser;   //  

	   private java.util.Date createTime;   //  
	   
	   private java.lang.String updateUser;   //  

	   private java.util.Date updateTime;   //  

	   private java.lang.String remark;   // 
	   
	   private java.lang.Integer sort;   // 
	   
	   

	public java.lang.Integer getStatus() {
		return status;
	}

	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}

	public java.lang.Integer getType() {
		return type;
	}

	public void setType(java.lang.Integer type) {
		this.type = type;
	}

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(java.lang.Integer catalogId) {
		this.catalogId = catalogId;
	}

	public java.lang.String getSubject() {
		return subject;
	}

	public void setSubject(java.lang.String subject) {
		this.subject = subject;
	}

	public java.lang.String getImg() {
		return img;
	}

	public void setImg(java.lang.String img) {
		this.img = img;
	}

	public java.lang.String getCentent() {
		return centent;
	}

	public void setCentent(java.lang.String centent) {
		this.centent = centent;
	}

	public java.lang.String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(java.lang.String createUser) {
		this.createUser = createUser;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.lang.String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(java.lang.String updateUser) {
		this.updateUser = updateUser;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
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


}
