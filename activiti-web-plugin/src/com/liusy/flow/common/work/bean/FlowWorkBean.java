package com.liusy.flow.common.work.bean;


/**
 * 待办实体
 * 
 * @author liusy 2014-07-30
 *
 */
public class FlowWorkBean {

	
	private String waitWorkid;//待办唯一id
	private String waitWorkKey;//业务就主键
	

	private String waitWorkSubject;//业务主题
	private String waitWorkType;//业务类型
	private String waitWorkStatus;//已办。未办
	private String waitWorkDate;//业务申请时间
	private String waitWorkRemark;//其它说明
	
	private String waitWorkFormUrl;//业务明细表单请求路径//*.action?id=
	
	
	
	
	public String getWaitWorkid() {
		return waitWorkid;
	}

	public void setWaitWorkid(String waitWorkid) {
		this.waitWorkid = waitWorkid;
	}

	public String getWaitWorkKey() {
		return waitWorkKey;
	}

	public void setWaitWorkKey(String waitWorkKey) {
		this.waitWorkKey = waitWorkKey;
	}

	public String getWaitWorkSubject() {
		return waitWorkSubject;
	}

	public void setWaitWorkSubject(String waitWorkSubject) {
		this.waitWorkSubject = waitWorkSubject;
	}

	public String getWaitWorkType() {
		return waitWorkType;
	}

	public void setWaitWorkType(String waitWorkType) {
		this.waitWorkType = waitWorkType;
	}

	public String getWaitWorkStatus() {
		return waitWorkStatus;
	}

	public void setWaitWorkStatus(String waitWorkStatus) {
		this.waitWorkStatus = waitWorkStatus;
	}

	public String getWaitWorkDate() {
		return waitWorkDate;
	}

	public void setWaitWorkDate(String waitWorkDate) {
		this.waitWorkDate = waitWorkDate;
	}

	public String getWaitWorkRemark() {
		return waitWorkRemark;
	}

	public void setWaitWorkRemark(String waitWorkRemark) {
		this.waitWorkRemark = waitWorkRemark;
	}

	public String getWaitWorkFormUrl() {
		return waitWorkFormUrl;
	}

	public void setWaitWorkFormUrl(String waitWorkFormUrl) {
		this.waitWorkFormUrl = waitWorkFormUrl;
	}
}
