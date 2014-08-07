package com.liusy.flow.common.work.service;

public interface FlowWorkService {

	/**
	 * 在流程启动后执行
	 */
	public void flowStartNodeAfter();
	/**
	 * 在流程过程中任务完成后执行
	 */
	public void flowRunNodeAfter();
	/**
	 * 在流程过结束后执行
	 */
	public void flowEndNodeAfter();
	
	
}
