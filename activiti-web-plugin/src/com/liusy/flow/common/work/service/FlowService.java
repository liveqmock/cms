package com.liusy.flow.common.work.service;

import com.liusy.flow.common.work.bean.ApprovalOpinionBean;

public interface FlowService {
	
	
	/**
	 * 在流程启动后执行
	 */
	public void flowStartNodeAfter(String processInstanceId);
	/**
	 * 在流程过程中任务完成后执行
	 */
	public void flowRunNodeAfter(ApprovalOpinionBean aob);
	/**
	 * 在流程过结束后执行
	 */
	public void flowEndNodeAfter(ApprovalOpinionBean aob);
	
	

}
