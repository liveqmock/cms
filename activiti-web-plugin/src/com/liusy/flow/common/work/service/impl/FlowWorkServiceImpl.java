package com.liusy.flow.common.work.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.engine.HistoryService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricProcessInstanceQuery;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmActivity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.apache.commons.lang.time.DateFormatUtils;

import com.liusy.core.util.ConvertUtil;
import com.liusy.flow.common.work.bean.ApprovalOpinionBean;
import com.liusy.flow.common.work.bean.BaseFlowBean;
import com.liusy.flow.common.work.bean.FlowWorkBean;
import com.liusy.flow.common.work.exception.FlowHandelException;
import com.liusy.flow.common.work.service.FlowService;
import com.liusy.flow.common.work.service.FlowWorkService;
import com.liusy.flow.common.work.util.FlowDataContent;

public class FlowWorkServiceImpl implements FlowWorkService{

	private RuntimeService runtimeService;
	private RepositoryService repositoryService;
	private TaskService taskService;
	private HistoryService historyService;
	private ManagementService managementService;
	private ProcessEngine processEngine;
	
	
	
	private Map<String,FlowService> mapFlowService;
	

	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getMapFlowService()
	 */
	@Override
	public Map<String, FlowService> getMapFlowService() {
		return mapFlowService;
	}
 


	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#setMapFlowService(java.util.Map)
	 */
	@Override
	public void setMapFlowService(Map<String, FlowService> mapFlowService) {
		this.mapFlowService = mapFlowService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getRuntimeService()
	 */
	@Override
	public RuntimeService getRuntimeService() {
		return runtimeService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#setRuntimeService(org.activiti.engine.RuntimeService)
	 */
	@Override
	public void setRuntimeService(RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getRepositoryService()
	 */
	@Override
	public RepositoryService getRepositoryService() {
		return repositoryService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#setRepositoryService(org.activiti.engine.RepositoryService)
	 */
	@Override
	public void setRepositoryService(RepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getTaskService()
	 */
	@Override
	public TaskService getTaskService() {
		return taskService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#setTaskService(org.activiti.engine.TaskService)
	 */
	@Override
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getHistoryService()
	 */
	@Override
	public HistoryService getHistoryService() {
		return historyService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#setHistoryService(org.activiti.engine.HistoryService)
	 */
	@Override
	public void setHistoryService(HistoryService historyService) {
		this.historyService = historyService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getManagementService()
	 */
	@Override
	public ManagementService getManagementService() {
		return managementService;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#setManagementService(org.activiti.engine.ManagementService)
	 */
	@Override
	public void setManagementService(ManagementService managementService) {
		this.managementService = managementService;
	}

	
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getProcessEngine()
	 */
	@Override
	public ProcessEngine getProcessEngine() {
		return processEngine;
	}



	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#setProcessEngine(org.activiti.engine.ProcessEngine)
	 */
	@Override
	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}


	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getImageStream(java.lang.String)
	 */
	@Override
	public InputStream getImageStream(String taskId) throws Exception{
				Task task= taskService.createTaskQuery().taskId(taskId).singleResult();
				//ProcessInstance pi =runtimeService.createProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).singleResult();
				  BpmnModel bpmnModel = repositoryService.getBpmnModel(task.getProcessDefinitionId());
				  List<String> activeActivityIds = runtimeService.getActiveActivityIds(task.getExecutionId());
				  
				  // 不使用spring请使用下面的两行代码
				  //    ProcessEngineImpl defaultProcessEngine = (ProcessEngineImpl) ProcessEngines.getDefaultProcessEngine();
				  //    Context.setProcessEngineConfiguration(defaultProcessEngine.getProcessEngineConfiguration());
				  // 使用spring注入引擎请使用下面的这行代码
				  //Context.setProcessEngineConfiguration(processEngine.getProcessEngineConfiguration());
				  
				  InputStream imageStream = processEngine.getProcessEngineConfiguration().getProcessDiagramGenerator().generateDiagram(bpmnModel, "png", activeActivityIds);
				  // 输出资源内容到相应对象
//				  byte[] b = new byte[1024];
//				  int len;
//				  while ((len = imageStream.read(b, 0, 1024)) != -1) {
//				    response.getOutputStream().write(b, 0, len);
//				  }
				  
 
				//1.6版本
				//processEngine.getProcessEngineConfiguration().getProcessDiagramGenerator()
//				    .generateDiagram(bpmnModel, "png", 
//				                     processEngine.getProcessEngineConfiguration().getActivityFontName(),
//				                     processEngine.getProcessEngineConfiguration().getLabelFontName(), 
//				                     processEngine.getProcessEngineConfiguration().getClassLoader(),1.0);


				  return imageStream;
		}

	
	
	
	
	
	


	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#startFlow(java.lang.String, java.lang.String, com.liusy.flow.common.work.service.FlowService, com.liusy.flow.common.work.bean.FlowWorkBean, java.util.Map)
	 */
	@Override
	public void startFlow(String flowDefinitionKey,String businessKey,FlowService flowService,BaseFlowBean flowWorkBean,Map<String,Object> variable) throws Exception
	{
		
		if(null==flowWorkBean)
			  throw new FlowHandelException("启动流程flowDefinitionKey［"+flowDefinitionKey+"］的 flowWorkBean 不能为 null");
		if(null==variable)
			  throw new FlowHandelException("启动流程flowDefinitionKey［"+flowDefinitionKey+"］的 variable 不能为 null");
		
		ConvertUtil.objectToMap(variable,flowWorkBean);
		ProcessInstance pi = runtimeService.startProcessInstanceByKey(flowDefinitionKey,businessKey,variable);
		mapFlowService.put(pi.getProcessInstanceId(), flowService);
		flowService.flowStartNodeAfter(pi.getProcessInstanceId());
	
	}
	
	/**
	 * 得到流程实例ID
	 * 
	 * @param businessKey 业务主键
	 * @param flowDefinitionKeys 流程唯一主键
	 * @return ProcessInstance
	 */
	@Override
	public ProcessInstance getFlowInstance(String businessKey,String flowDefinitionKeys)
	{
		return runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(businessKey, flowDefinitionKeys).singleResult();
	}

	/**
	 *  认领任务
	 *  
	 * @param taskId
	 * @param userId
	 */
	@Override
	public void claimTask(String taskId,String userId)
	{
		taskService.claim(taskId, userId);
	}
	
	
	
	
	@Override
	public void suspendFlow(String flowInstanceId)
	{
		runtimeService.suspendProcessInstanceById(flowInstanceId);
	}
	
	@Override
	public void activateFlow(String flowInstanceId)
	{
		runtimeService.activateProcessInstanceById(flowInstanceId);
	}
	
	
	
	
	/**
	 *   得到前进的可选节点
	 *   
	 * @param taskId 
	 * @return Map<String,String> <name,id>
	 */
	@Override
	public Map<String,String> getOutNodes(String taskId)
	{
		  Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		 //ProcessDefinition  pd = repositoryService.createProcessDefinitionQuery().processDefinitionId(task.getProcessDefinitionId()).singleResult();
		ProcessDefinitionEntity def = (ProcessDefinitionEntity) ((RepositoryServiceImpl)repositoryService).getDeployedProcessDefinition(task.getProcessDefinitionId());  
		List<ActivityImpl> activitiList = def.getActivities();
		
		String excId = task.getExecutionId();  
		ExecutionEntity execution = (ExecutionEntity) runtimeService.createExecutionQuery().executionId(excId).singleResult();  
		String activitiId = execution.getActivityId();  
		PvmActivity ac= null;
		List<PvmTransition> outTransitions = null;
		Map<String,String> map = new HashMap<String, String>();
		for (ActivityImpl activityImpl : activitiList) {
			if (activitiId.equals(activityImpl.getId())) {
				//System.out.println("当前任务：" + activityImpl.getProperty("name")); // 输出某个节点的某种属性
				// 前进，，，出去的所有线路
				outTransitions = activityImpl.getOutgoingTransitions();
				for (PvmTransition tr : outTransitions) {
					ac = tr.getDestination(); // 获取线路的终点节点
					map.put( ac.getProperty("name").toString(),ac.getId());
					//System.out.println("下一步的节点：" + ac.getProperty("name"));
				}
				break;
			}
		}
		return map;
	}
	
	/**
	 *   得到后退的可选节点
	 *   
	 * @param taskId 
	 * @return Map<String,String> <name,id>
	 */
	@Override
	public Map<String,String> getInNodes(String taskId)
	{
		  Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		 //ProcessDefinition  pd = repositoryService.createProcessDefinitionQuery().processDefinitionId(task.getProcessDefinitionId()).singleResult();
		ProcessDefinitionEntity def = (ProcessDefinitionEntity) ((RepositoryServiceImpl)repositoryService).getDeployedProcessDefinition(task.getProcessDefinitionId());  
		List<ActivityImpl> activitiList = def.getActivities();
		
		String excId = task.getExecutionId();  
		ExecutionEntity execution = (ExecutionEntity) runtimeService.createExecutionQuery().executionId(excId).singleResult();  
		String activitiId = execution.getActivityId();  
		PvmActivity ac= null;
		List<PvmTransition> outTransitions = null;
		Map<String,String> map = new HashMap<String, String>();
		for (ActivityImpl activityImpl : activitiList) {
			if (activitiId.equals(activityImpl.getId())) {
				//System.out.println("当前任务：" + activityImpl.getProperty("name")); // 输出某个节点的某种属性
				// 前进，，，出去的所有线路
				outTransitions = activityImpl.getIncomingTransitions();
				for (PvmTransition tr : outTransitions) {
					ac = tr.getSource(); // 获取线路的终点节点
					map.put( ac.getProperty("name").toString(),ac.getId());
					//System.out.println("下一步的节点：" + ac.getProperty("name"));
				}
				break;
			}
		}
		return map;
	}
	
	
	
	private void commitFlow(String taskId,String userId,String nodeId)
	{
		  Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		 //ProcessDefinition  pd = repositoryService.createProcessDefinitionQuery().processDefinitionId(task.getProcessDefinitionId()).singleResult();
		ProcessDefinitionEntity def = (ProcessDefinitionEntity) ((RepositoryServiceImpl)repositoryService).getDeployedProcessDefinition(task.getProcessDefinitionId());  
		List<ActivityImpl> activitiList = def.getActivities();
		//申请人撤回任务
		if(historyService.createHistoricTaskInstanceQuery().processInstanceId(task.getProcessInstanceId()).count()==0)
		{
			Object userId_=task.getProcessVariables().get(FlowWorkBean.WAITWORK_USERID);
			if(null!=userId_ && userId_.equals(userId))
			{
				runtimeService.deleteProcessInstance(task.getProcessInstanceId(), "申请人："+userId+"撤回任务！,"+task.getProcessVariables().get(FlowWorkBean.WAITWORK_TYPE)+","+task.getProcessVariables().get(FlowWorkBean.WAITWORK_SUBJECT)+","+task.getProcessVariables().get(FlowWorkBean.WAITWORK_KEY));
			}
		}
		else{
			
			//已经审批后，可根据已经审批的节点与当前节点比较，得到source节点，再退回
		}
		String excId = task.getExecutionId();  
		ExecutionEntity execution = (ExecutionEntity) runtimeService.createExecutionQuery().executionId(excId).singleResult();

		for (ActivityImpl activityImpl : activitiList) {
			if (nodeId.equals(activityImpl.getId())) {
				execution.setActivity(activityImpl);
				break;
			}
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#taskHandle(java.lang.String, java.util.Map, int, java.lang.String, java.lang.String)
	 */
	@Override
	public void taskHandle(String taskId,String nodeId,Map<String, Object> variable, int type,String userName,String remark)
	{
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		String startDate = DateFormatUtils.format(task.getCreateTime(), "yyyy-MM-dd HH:mm:ss");
		String endDate = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
		
		taskService.addComment(taskId, task.getProcessInstanceId(), task.getProcessInstanceId()+";"+task.getId()+";"+type+";"+task.getAssignee()+";"+userName+";"+(remark.replace(";", "；"))+";"+startDate+";"+endDate);
		taskService.setVariables(taskId, variable);
		//taskService.complete(taskId,variable);
		//根据 nodeId，进行退回或前进操作
		commitFlow(taskId,nodeId,task.getAssignee());
		
		ApprovalOpinionBean aob = new ApprovalOpinionBean();
	   	 aob.setWaitWorkFlowInstanceId(task.getProcessInstanceId());
	   	 aob.setWaitWorkFlowTaskId(task.getId());
	   	 aob.setHandType(type);
	   	 aob.setUserId(task.getAssignee());
	   	 aob.setUserName(userName);
	   	 aob.setComments(remark.replace(";", "；"));
	   	 aob.setStartDate(startDate);
	   	 aob.setEndDate(endDate);
		if(null==runtimeService.createProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).singleResult())
			mapFlowService.get(task.getProcessInstanceId()).flowEndNodeAfter(aob);
		else
			mapFlowService.get(task.getProcessInstanceId()).flowRunNodeAfter(aob);
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getAllExecuteTaskNodeListByTaskId(java.lang.String)
	 */
    @Override
	public List<ApprovalOpinionBean> getAllExecuteTaskNodeListByTaskId(String taskId){
         Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
         return getAllExecuteTaskNodeListByFlowInstanceId(task.getProcessInstanceId());
    }
    
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#getAllExecuteTaskNodeListByFlowInstanceId(java.lang.String)
	 */
    @Override
	public List<ApprovalOpinionBean> getAllExecuteTaskNodeListByFlowInstanceId(String processInstanceId){
    	
    		List<Comment> conmentsList = new ArrayList<Comment>();
//         List<HistoricTaskInstance> list = historyService.createHistoricTaskInstanceQuery().processInstanceId(processInstanceId).list();
//         
//         for (HistoricTaskInstance historicTaskInstance : list) {
//             List<Comment> comments = taskService.getTaskComments(historicTaskInstance.getId());
//             conmentsList.addAll(comments);
//		}
    	 conmentsList =taskService.getProcessInstanceComments(processInstanceId);
         List<ApprovalOpinionBean> aobList  = new ArrayList<ApprovalOpinionBean>();
         ApprovalOpinionBean aob = null;
         String [] commentArray= null;
         for (Comment comment : conmentsList) {
        	 aob = new ApprovalOpinionBean();
        	 commentArray= comment.getFullMessage().split(";");
        	 aob.setWaitWorkFlowInstanceId(commentArray[0]);
        	 aob.setWaitWorkFlowTaskId(commentArray[1]);
        	 aob.setHandType(Integer.parseInt(commentArray[2]));
        	 aob.setUserId(commentArray[3]);
        	 aob.setUserName(commentArray[4]);
        	 aob.setComments(commentArray[5]);
        	 aob.setStartDate(commentArray[6]);
        	 aob.setEndDate(commentArray[7]);
        	 aobList.add(aob);
		}
     
        //taskService.getIdentityLinksForTask(taskId) //获取ACT_RU_IDENTITYLINK中的信息
         
         return aobList;
    }
    
    
    /* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findProcessInstanceList()
	 */
    @Override
	public void findProcessInstanceList(){
        RuntimeService runtimeService = processEngine.getRuntimeService() ; 
        List<ProcessInstance> list = runtimeService.createProcessInstanceQuery().list() ;
        for(ProcessInstance e:list){
            System.out.println(e.getId()+","+e.getProcessInstanceId()+",该实例对应的流程定义"+e.getProcessDefinitionId()+",业务外键："+e.getBusinessKey());
        }
    }
	
	
	
    
    
    
    
    
    
	
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#createUnsignedTaskQuery(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */ 
	@Override
	public TaskQuery createUnsignedTaskQuery(String userId,FlowWorkBean flowWorkBean) { 
	    TaskQuery taskCandidateUserQuery = taskService.createTaskQuery().taskCandidateUser(userId); 
	    if(null!=flowWorkBean.getWaitWorkType() &&!"".equals(flowWorkBean.getWaitWorkType()))
	    	taskCandidateUserQuery.processVariableValueEquals(FlowWorkBean.WAITWORK_TYPE, flowWorkBean.getWaitWorkType());
	    if(null!=flowWorkBean.getWaitWorkSubject() &&!"".equals(flowWorkBean.getWaitWorkSubject()))
	    	taskCandidateUserQuery.processVariableValueLike(FlowWorkBean.WAITWORK_SUBJECT, flowWorkBean.getWaitWorkSubject());
	    if(null!=flowWorkBean.getWaitWorkUserName() &&!"".equals(flowWorkBean.getWaitWorkUserName()))
	    	taskCandidateUserQuery.processVariableValueLike(FlowWorkBean.WAITWORK_USERNAME, flowWorkBean.getWaitWorkUserName());
	    if(null!=flowWorkBean.getWaitWorkDepartment() &&!"".equals(flowWorkBean.getWaitWorkDepartment()))
	    	taskCandidateUserQuery.processVariableValueLike(FlowWorkBean.WAITWORK_DEPARTMENT, flowWorkBean.getWaitWorkDepartment());
	    return taskCandidateUserQuery; 
	} 
	
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findUnsignedTask(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */
	@Override
	public  FlowDataContent findUnsignedTask(String userId,FlowWorkBean flowWorkBea) throws Exception
	{
		TaskQuery taskCandidateUserQuery = createTodoTaskQuery(userId,flowWorkBea);
		List<Task> list= taskCandidateUserQuery.list();
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentTodoTask(list),taskCandidateUserQuery.count(),taskCandidateUserQuery.count(),1);
		return fdc;
	}
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findUnsignedTask(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean, int, int)
	 */
	@Override
	public  FlowDataContent findUnsignedTask(String userId,FlowWorkBean flowWorkBea,int pageSize,int pageNumber) throws Exception
	{
		TaskQuery taskCandidateUserQuery = createTodoTaskQuery(userId,flowWorkBea);
		List<Task> list= taskCandidateUserQuery.listPage(pageSize*pageNumber, pageSize*(++pageNumber));
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentTodoTask(list),taskCandidateUserQuery.count(),pageSize,pageNumber);
		return fdc;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#createTodoTaskQuery(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */ 
	@Override
	public TaskQuery createTodoTaskQuery(String userId,FlowWorkBean flowWorkBean) { 
	    TaskQuery taskAssigneeQuery = taskService.createTaskQuery().taskAssignee(userId); 
	    if(null!=flowWorkBean.getWaitWorkType() &&!"".equals(flowWorkBean.getWaitWorkType()))
	    	taskAssigneeQuery.processVariableValueEquals(FlowWorkBean.WAITWORK_TYPE, flowWorkBean.getWaitWorkType());
	    if(null!=flowWorkBean.getWaitWorkSubject() &&!"".equals(flowWorkBean.getWaitWorkSubject()))
	    	taskAssigneeQuery.processVariableValueLike(FlowWorkBean.WAITWORK_SUBJECT, flowWorkBean.getWaitWorkSubject());
	    if(null!=flowWorkBean.getWaitWorkUserName() &&!"".equals(flowWorkBean.getWaitWorkUserName()))
	    	taskAssigneeQuery.processVariableValueLike(FlowWorkBean.WAITWORK_USERNAME, flowWorkBean.getWaitWorkUserName());
	    if(null!=flowWorkBean.getWaitWorkDepartment() &&!"".equals(flowWorkBean.getWaitWorkDepartment()))
	    	taskAssigneeQuery.processVariableValueLike(FlowWorkBean.WAITWORK_DEPARTMENT, flowWorkBean.getWaitWorkDepartment());
	    return taskAssigneeQuery;
	} 

	
	
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findTodoTask(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */
	@Override
	public  FlowDataContent findTodoTask(String userId,FlowWorkBean flowWorkBea) throws Exception
	{
		TaskQuery taskAssigneeQuery  = createTodoTaskQuery(userId,flowWorkBea);
		List<Task> list= taskAssigneeQuery.list();
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentTodoTask(list),taskAssigneeQuery.count(),taskAssigneeQuery.count(),1);
		return fdc;
	}
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findTodoTask(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean, int, int)
	 */
	@Override
	public  FlowDataContent findTodoTask(String userId,FlowWorkBean flowWorkBea,int pageSize,int pageNumber) throws Exception
	{
		TaskQuery taskAssigneeQuery  = createTodoTaskQuery(userId,flowWorkBea);
		List<Task> list= taskAssigneeQuery.listPage(pageSize*pageNumber, pageSize*(++pageNumber));
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentTodoTask(list),taskAssigneeQuery.count(),pageSize,pageNumber);
		return fdc;
	}
	
	private List<FlowWorkBean> ConvertFlowDataContentTodoTask(List<Task> list) throws Exception
	{
		List<FlowWorkBean> listFlowWorkBean = new ArrayList<FlowWorkBean>(); 
		Map<String,Object> mapVariables = null;
		FlowWorkBean flowWorkBean = null;
		for (Task historicProcessInstance : list) {
			mapVariables =historicProcessInstance.getProcessVariables();
			flowWorkBean = new FlowWorkBean();
			ConvertUtil.convertToModel(flowWorkBean, mapVariables);
			flowWorkBean.setWaitWorkFlowTaskId(historicProcessInstance.getId());
			flowWorkBean.setWaitWorkFlowInstanceId(historicProcessInstance.getProcessInstanceId());
			listFlowWorkBean.add(flowWorkBean);
		}
		return listFlowWorkBean;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#createUnFinishedProcessInstanceQuery(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */ 
	@Override
	public ProcessInstanceQuery createUnFinishedProcessInstanceQuery(String userId,FlowWorkBean flowWorkBean) {
	    ProcessInstanceQuery unfinishedQuery = runtimeService.createProcessInstanceQuery().involvedUser(userId).active();
	    if(null!=flowWorkBean.getWaitWorkType() &&!"".equals(flowWorkBean.getWaitWorkType()))
	    	unfinishedQuery.variableValueEquals(FlowWorkBean.WAITWORK_TYPE, flowWorkBean.getWaitWorkType());
	    if(null!=flowWorkBean.getWaitWorkSubject() &&!"".equals(flowWorkBean.getWaitWorkSubject()))
	    	unfinishedQuery.variableValueLike(FlowWorkBean.WAITWORK_SUBJECT, flowWorkBean.getWaitWorkSubject());
	    if(null!=flowWorkBean.getWaitWorkUserName() &&!"".equals(flowWorkBean.getWaitWorkUserName()))
	    	unfinishedQuery.variableValueLike(FlowWorkBean.WAITWORK_USERNAME, flowWorkBean.getWaitWorkUserName());
	    if(null!=flowWorkBean.getWaitWorkDepartment() &&!"".equals(flowWorkBean.getWaitWorkDepartment()))
	    	unfinishedQuery.variableValueLike(FlowWorkBean.WAITWORK_DEPARTMENT, flowWorkBean.getWaitWorkDepartment());
	    return unfinishedQuery;
	} 
	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findUnfinishedActiveFlow(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */
	@Override
	public  FlowDataContent findUnfinishedActiveFlow(String userId,FlowWorkBean flowWorkBea) throws Exception
	{
		ProcessInstanceQuery unfinishedQuery = createUnFinishedProcessInstanceQuery(userId,flowWorkBea);
		List<ProcessInstance> list= unfinishedQuery.list();
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentActiveFlow(list),unfinishedQuery.count(),unfinishedQuery.count(),1);
		return fdc;
	}
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findUnfinishedActiveFlow(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean, int, int)
	 */
	@Override
	public  FlowDataContent findUnfinishedActiveFlow(String userId,FlowWorkBean flowWorkBea,int pageSize,int pageNumber) throws Exception
	{
		ProcessInstanceQuery unfinishedQuery = createUnFinishedProcessInstanceQuery(userId,flowWorkBea);
		List<ProcessInstance> list= unfinishedQuery.listPage(pageSize*pageNumber, pageSize*(++pageNumber));
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentActiveFlow(list),unfinishedQuery.count(),pageSize,pageNumber);
		return fdc;
	}
	
	private List<FlowWorkBean> ConvertFlowDataContentActiveFlow(List<ProcessInstance> list) throws Exception
	{
		List<FlowWorkBean> listFlowWorkBean = new ArrayList<FlowWorkBean>(); 
		Map<String,Object> mapVariables = null;
		FlowWorkBean flowWorkBean = null;
		for (ProcessInstance historicProcessInstance : list) {
			mapVariables =historicProcessInstance.getProcessVariables();
			flowWorkBean = new FlowWorkBean();
			ConvertUtil.convertToModel(flowWorkBean, mapVariables);
			flowWorkBean.setWaitWorkFlowInstanceId(historicProcessInstance.getProcessInstanceId());
			listFlowWorkBean.add(flowWorkBean);
		}
		return listFlowWorkBean;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#createFinishedProcessInstanceQuery(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */ 
	@Override
	public HistoricProcessInstanceQuery createFinishedProcessInstanceQuery(String userId,FlowWorkBean flowWorkBean) { 
	    HistoricProcessInstanceQuery finishedQuery = historyService.createHistoricProcessInstanceQuery().involvedUser(userId).finished();
	    if(null!=flowWorkBean.getWaitWorkType() &&!"".equals(flowWorkBean.getWaitWorkType()))
	    	finishedQuery.variableValueEquals(FlowWorkBean.WAITWORK_TYPE, flowWorkBean.getWaitWorkType());
	    if(null!=flowWorkBean.getWaitWorkSubject() &&!"".equals(flowWorkBean.getWaitWorkSubject()))
	    	finishedQuery.variableValueLike(FlowWorkBean.WAITWORK_SUBJECT, flowWorkBean.getWaitWorkSubject());
	    if(null!=flowWorkBean.getWaitWorkUserName() &&!"".equals(flowWorkBean.getWaitWorkUserName()))
	    	finishedQuery.variableValueLike(FlowWorkBean.WAITWORK_USERNAME, flowWorkBean.getWaitWorkUserName());
	    if(null!=flowWorkBean.getWaitWorkDepartment() &&!"".equals(flowWorkBean.getWaitWorkDepartment()))
	    	finishedQuery.variableValueLike(FlowWorkBean.WAITWORK_DEPARTMENT, flowWorkBean.getWaitWorkDepartment());
	    return finishedQuery;
	} 

	
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findFinishedFlow(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean)
	 */
	@Override
	public  FlowDataContent findFinishedFlow(String userId,FlowWorkBean flowWorkBea) throws Exception
	{
		HistoricProcessInstanceQuery hpiq = createFinishedProcessInstanceQuery(userId,flowWorkBea);
		List<HistoricProcessInstance> list= hpiq.desc().list();
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentHistoric(list),hpiq.count(),hpiq.count(),1);
		return fdc;
	}
	/* (non-Javadoc)
	 * @see com.liusy.flow.common.work.service.impl.FlowWorkService#findFinishedFlow(java.lang.String, com.liusy.flow.common.work.bean.FlowWorkBean, int, int)
	 */
	@Override
	public FlowDataContent findFinishedFlow(String userId,FlowWorkBean flowWorkBea,int pageSize,int pageNumber) throws Exception
	{
		HistoricProcessInstanceQuery hpiq = createFinishedProcessInstanceQuery(userId,flowWorkBea);
		List<HistoricProcessInstance> list= hpiq.desc().listPage(pageSize*pageNumber, pageSize*(++pageNumber));
		FlowDataContent fdc = new FlowDataContent(ConvertFlowDataContentHistoric(list),hpiq.count(),pageSize,pageNumber);
		return fdc;
	}
	
	private List<FlowWorkBean> ConvertFlowDataContentHistoric(List<HistoricProcessInstance> list) throws Exception
	{
		List<FlowWorkBean> listFlowWorkBean = new ArrayList<FlowWorkBean>(); 
		Map<String,Object> mapVariables = null;
		FlowWorkBean flowWorkBean = null;
		for (HistoricProcessInstance historicProcessInstance : list) {
			mapVariables =historicProcessInstance.getProcessVariables();
			flowWorkBean = new FlowWorkBean();
			ConvertUtil.convertToModel(flowWorkBean, mapVariables);
			flowWorkBean.setWaitWorkFlowInstanceId(historicProcessInstance.getId());
			listFlowWorkBean.add(flowWorkBean);
		}
		return listFlowWorkBean;
	}

}
