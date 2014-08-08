package com.liusy.flow.common.work.bean;

public class ApprovalOpinionBean extends BaseFlowBean{

	public final static int TASKHANDLETYPE_PASS = 1;
	public final static int TASKHANDLETYPE_REJECT = 0;
	
	
	
	
	private String id;//唯一辨识
	private String userId;//审批就帐号
	private String userName;//审批人
	private int handType;//批意见//通过，驳回，挂起，结束等
	private String comments;//意见
	private String startDate;//开始时间
	private String endDate;//开始时间
	
	
	
	
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getHandType() {
		return handType;
	}
	public void setHandType(int handType) {
		this.handType = handType;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
