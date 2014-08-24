package com.liusy.flow.common.work.bean;

public class BaseFlowBean {

	public static final String WAITWORK_FLOWINSTANCEID = "waitWorkFlowInstanceId";
	public static final String WAITWORK_FLOWTASKID = "waitWorkFlowTaskId";
	public static final String WAITWORK_FLOWTASKNAME = "waitWorkFlowTaskName";
	
	private String waitWorkFlowInstanceId;
	private String waitWorkFlowTaskId;
	private String  waitWorkFlowTaskName;

	public BaseFlowBean() {
		super();
	}

	public String getWaitWorkFlowInstanceId() {
		return waitWorkFlowInstanceId;
	}

	public void setWaitWorkFlowInstanceId(String waitWorkFlowInstanceId) {
		this.waitWorkFlowInstanceId = waitWorkFlowInstanceId;
	}

	public String getWaitWorkFlowTaskId() {
		return waitWorkFlowTaskId;
	}

	public void setWaitWorkFlowTaskId(String waitWorkFlowTaskId) {
		this.waitWorkFlowTaskId = waitWorkFlowTaskId;
	}

	public String getWaitWorkFlowTaskName() {
		return waitWorkFlowTaskName;
	}

	public void setWaitWorkFlowTaskName(String waitWorkFlowTaskName) {
		this.waitWorkFlowTaskName = waitWorkFlowTaskName;
	}
	
	

}