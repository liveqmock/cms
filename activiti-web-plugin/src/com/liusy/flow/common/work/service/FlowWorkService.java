package com.liusy.flow.common.work.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstanceQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.TaskQuery;

import com.liusy.flow.common.work.bean.ApprovalOpinionBean;
import com.liusy.flow.common.work.bean.BaseFlowBean;
import com.liusy.flow.common.work.bean.FlowWorkBean;
import com.liusy.flow.common.work.util.FlowDataContent;

public interface FlowWorkService {

	public abstract Map<String, FlowService> getMapFlowService();

	public abstract void setMapFlowService(
			Map<String, FlowService> mapFlowService);

	public abstract RuntimeService getRuntimeService();

	public abstract void setRuntimeService(RuntimeService runtimeService);

	public abstract RepositoryService getRepositoryService();

	public abstract void setRepositoryService(
			RepositoryService repositoryService);

	public abstract TaskService getTaskService();

	public abstract void setTaskService(TaskService taskService);

	public abstract HistoryService getHistoryService();

	public abstract void setHistoryService(HistoryService historyService);

	public abstract ManagementService getManagementService();

	public abstract void setManagementService(
			ManagementService managementService);

	public abstract ProcessEngine getProcessEngine();

	public abstract void setProcessEngine(ProcessEngine processEngine);

	/**
	 * 得到流程图
	 * 
	 * @param taskId
	 * @return
	 * @throws Exception
	 */
	public abstract InputStream getImageStream(String taskId) throws Exception;

	/**
	 * 
	 * 启动流程
	 * 
	 * @param flowDefinitionKey  启动流程
	 * @param businessKey	业务关联
	 * @param flowService	流程完成执行过程中回调
	 * @param flowWorkBean	代办显示内容
	 * @param variable	流程中使用的变量
	 * @throws Exception 
	 */
	public abstract void startFlow(String flowDefinitionKey,
			String businessKey, FlowService flowService,
			BaseFlowBean flowWorkBean, Map<String, Object> variable)
			throws Exception;

	/**
	 *  处理任务<br><br>
	 *  得到后退的节点com.liusy.flow.common.work.service.impl.FlowWorkService#getInNodes<br>
	 *    
	 *  得到前进的节点 com.liusy.flow.common.work.service.impl.FlowWorkService#getOutNodes <br>
	 * 
	 * @param taskId
	 * @param 根据 nodeId，进行退回或前进操作  从
	 * @param variable 
	 * @param type  通过、驳回、挂起、结束
	 * @param userName 用户名
	 * @param remark 意见
	 */
	public abstract void taskHandle(String taskId,String nodeId,
			Map<String, Object> variable, int type, String userName,
			String remark);

	/**
	 *   根据流程任务ID获取执行过的所有任务节点的列表   必须指定流程实例才精确     考虑如何获取指定流程定义中的所有节点
	 * @param taskId    任务Id
	 * @return  List<ApprovalOpinionBean>
	 */
	public abstract List<ApprovalOpinionBean> getAllExecuteTaskNodeListByTaskId(String taskId);
	
	/**
	 *   根据流程实列ID获取执行过的所有任务节点的列表
	 * @param processInstanceId    流程实例Id
	 * @return   List<ApprovalOpinionBean>
	 */
	public abstract List<ApprovalOpinionBean> getAllExecuteTaskNodeListByFlowInstanceId(String processInstanceId);
	
	

	/**
	 * 附加操作：查询流程实例列表
	 */
	public abstract void findProcessInstanceList();

	/** 
	 * 获取未签收的任务查询对象 
	 * 
	 * 此类任务针对于把Task分配给一个角色时，例如部门领导，因为部门领导角色可以指定多个人所以需要先签收再办理，术语：抢占式
	 * 
	 * @param userId    用户登陆帐号
	 */
	public abstract TaskQuery createUnsignedTaskQuery(String userId,
			FlowWorkBean flowWorkBean);

	/**
	 * 未认领的任务（认领后进入未处理状态）
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findUnsignedTask(String userId,
			FlowWorkBean flowWorkBea) throws Exception;

	/**
	 * 未认领的任务（认领后进入未处理状态）
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findUnsignedTask(String userId,
			FlowWorkBean flowWorkBea, int pageSize, int pageNumber)
			throws Exception;

	/** 
	 * 获取正在处理的任务查询对象 
	 * 
	 * 此类任务数据类源有两种:1、签收后的，签收后就应该为办理中状态2、节点指定的是具体到一个人，而不是角色
	 * 
	 * @param userId   用户登陆帐号 
	 */
	public abstract TaskQuery createTodoTaskQuery(String userId,
			FlowWorkBean flowWorkBean);

	/**
	 * 未处理的任务
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findTodoTask(String userId,
			FlowWorkBean flowWorkBea) throws Exception;

	/**
	 * 未处理的任务
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findTodoTask(String userId,
			FlowWorkBean flowWorkBea, int pageSize, int pageNumber)
			throws Exception;

	/** 
	 * 获取未经完成的流程实例查询对象 
	 * 
	 * 就是没有结束的流程，所有参与过的人都应该可以看到这个实例， 从表ACT_RU_EXECUTION中查询数据。
	 * 
	 * @param userId    用户登陆帐号 
	 */
	public abstract ProcessInstanceQuery createUnFinishedProcessInstanceQuery(
			String userId, FlowWorkBean flowWorkBean);

	/**
	 * 已处理的任务，处于活动状态的任务
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findUnfinishedActiveFlow(String userId,
			FlowWorkBean flowWorkBea) throws Exception;

	/**
	 * 已处理的任务，处于活动状态的任务
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findUnfinishedActiveFlow(String userId,
			FlowWorkBean flowWorkBea, int pageSize, int pageNumber)
			throws Exception;

	/** 
	 * 获取已经完成的流程实例查询对象 
	 * 
	 * 已经结束的流程实例。 从表ACT_HI_PROCINST中查询数据。
	 * 
	 * @param userId    用户登陆帐号 
	 */
	public abstract HistoricProcessInstanceQuery createFinishedProcessInstanceQuery(
			String userId, FlowWorkBean flowWorkBean);

	/**
	 * 流程已经结束的任务
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findFinishedFlow(String userId,
			FlowWorkBean flowWorkBea) throws Exception;

	/**
	 * 流程已经结束的任务
	 * 
	 * @param userId  当前登陆帐号
	 * @param flowWorkBea  查询条件，暂时只对“任务类型”、“任务主题”、“任务申请人”、“申请部门”有效果
	 * @return
	 * @throws Exception
	 */
	public abstract FlowDataContent findFinishedFlow(String userId,
			FlowWorkBean flowWorkBea, int pageSize, int pageNumber)
			throws Exception;

	public abstract ProcessInstance getFlowInstance(String businessKey, String flowDefinitionKeys);

	public abstract void claimTask(String taskId, String userId);

	public abstract Map<String,String> getInNodes(String taskId);

	public abstract Map<String,String> getOutNodes(String taskId);

	public abstract void activateFlow(String flowInstanceId);

	public abstract void suspendFlow(String flowInstanceId);


	
	
}
