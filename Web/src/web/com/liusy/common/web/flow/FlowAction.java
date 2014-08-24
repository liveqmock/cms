package com.liusy.common.web.flow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.liusy.core.common.Code;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.util.ConvertUtil;
import com.liusy.core.web.action.BaseAction;
import com.liusy.flow.common.work.bean.FlowWorkBean;
import com.liusy.flow.common.work.service.FlowWorkService;
import com.liusy.flow.common.work.util.FlowDataContent;


@Controller
@Scope("prototype")
@Namespace("/flow")
@Action("flow")
@ParentPackage("default")
@Results({
		@Result(name = "JSON", type = "json", params = {"ignoreHierarchy","false"}),
		@Result(name = "LIST", location = "/jsp/system/flow/flow_list.jsp"),
		@Result(name = "claimTask", location = "/jsp/system/flow/flow_grid.jsp"),
		@Result(name = "waitTask", location = "/jsp/system/flow/flow_grid.jsp"),
		@Result(name = "finishTask", location = "/jsp/system/flow/flow_grid.jsp"),
		@Result(name = "unfinishTask", location = "/jsp/system/flow/flow_grid.jsp"),
		@Result(name = "taskEdit", location = "/jsp/system/flow/flow_add.jsp"),
		@Result(name = "taskView", location = "/jsp/system/flow/flow_add.jsp"),})
public class FlowAction extends BaseAction  {

	
	private final Log         log = LogFactory.getLog(FlowAction.class);
	
	
	@Autowired
	private FlowWorkService flowWorkService;
	
	@Override
	public String doExecute() throws Exception {
		String forward = "";
	      String action = form.getAction();

	      if (action == null) action = LIST;
	      if (log.isDebugEnabled()) log.debug("action:" + action);
	      
	      if(this.getForm().getQuery().getPageSize().equals("0"))
    		  this.getForm().getQuery().setPageSize("10");	  
	      
	      
	      try {
	    	  if (LIST.equalsIgnoreCase(action)) forward = taskList(); // tab
	    	 else if ("claimTask".equalsIgnoreCase(action)) forward = claimTask(); // 需要认领的任务
	         else if ("waitTask".equalsIgnoreCase(action)) forward = waitTask();// 已经认领任务与需要处理的任务
	         else if ("finishTask".equalsIgnoreCase(action)) forward = finishTask();// 参与过，流程已经结束的任务
	         else if ("unfinishTask".equalsIgnoreCase(action)) forward = unfinishTask();// 参与过，流程未结束的任务
	         else if ("svaeHandlerTask".equalsIgnoreCase(action)) forward = svaeHandlerTask();// 审批
	         else if ("svaeClaimTask".equalsIgnoreCase(action)) forward = svaeClaimTask();// 认领
	         else if ("taskView".equalsIgnoreCase(action)) forward = taskView();// 查看
	         else if ("taskEdit".equalsIgnoreCase(action)) forward = taskEdit();// 查看
	         else forward = ERROR;
	      } catch (Exception e) {// 其他系统出错
	         e.printStackTrace();
	         request.put("errMsg", e.getMessage());
	         forward = ERROR;
	      }
	      return forward;
	}


	
	/**
	 * tab页
	 * 
	 * @return
	 */
	private String taskList()
	{
		 if (log.isDebugEnabled()) log.debug("Entering 'taskList' mathod");
		 return this.LIST;
	}
	
	
	
	/**
	 * 认领的任务
	 * 
	 * @return
	 */
	private String claimTask()
	{
		 if (log.isDebugEnabled()) log.debug("Entering 'claimTask' mathod");
	      try {
	    	  
	    	  FlowDataContent fdc = flowWorkService.findUnsignedTask(this.currentUser.getAccountName(), null,Integer.parseInt(this.getForm().getQuery().getPageSize()),Integer.parseInt(this.getForm().getQuery().getPageNumber()));
	    	  ConvertPageQuery(this.getForm().getQuery(),fdc);
	    	  
	      } catch (Exception e) {
	         e.printStackTrace(); 
	         request.put("errMsg", e.getMessage());
	         return ERROR;
	      }
	      return "claimTask";
	}
	
	
	/**
	 * 处理的任务
	 * 
	 * @return
	 */
	private String waitTask()
	{
		 if (log.isDebugEnabled()) log.debug("Entering 'waitTask' mathod");
		    try {
		 
		    	  FlowDataContent fdc = flowWorkService.findTodoTask(this.currentUser.getAccountName(), null,Integer.parseInt(this.getForm().getQuery().getPageSize()),Integer.parseInt(this.getForm().getQuery().getPageNumber()));
		    	  ConvertPageQuery(this.getForm().getQuery(),fdc);
		    	  
		      } catch (Exception e) {
		         e.printStackTrace();
		         request.put("errMsg", e.getMessage());
		         return ERROR;
		      }
	      return "waitTask";
	}
	
	
	/**
	 * 已经完成还在活动的任务
	 * 
	 * @return
	 */
	private String finishTask()
	{
		 if (log.isDebugEnabled()) log.debug("Entering 'finishTask' mathod");
		 try {

	    	  FlowDataContent fdc = flowWorkService.findFinishedFlow(this.currentUser.getAccountName(), null,Integer.parseInt(this.getForm().getQuery().getPageSize()),Integer.parseInt(this.getForm().getQuery().getPageNumber()));
	    	  ConvertPageQuery(this.getForm().getQuery(),fdc);
	    	  
	      } catch (Exception e) {
	         e.printStackTrace();
	         request.put("errMsg", e.getMessage());
	         return ERROR;
	      }
	      return "finishTask";
	}
	
	
	
	/**
	 * 已经完成已结束的任务
	 * 
	 * @return
	 */
	private String unfinishTask()
	{
		 if (log.isDebugEnabled()) log.debug("Entering 'unfinishTask' mathod");
		 try {
	    	
	    	  FlowDataContent fdc = flowWorkService.findUnfinishedActiveFlow(this.currentUser.getAccountName(), null,Integer.parseInt(this.getForm().getQuery().getPageSize()),Integer.parseInt(this.getForm().getQuery().getPageNumber()));
	    	  ConvertPageQuery(this.getForm().getQuery(),fdc);
	    	  
	      } catch (Exception e) {
	         e.printStackTrace();
	         request.put("errMsg", e.getMessage());
	         return ERROR;
	      }
	      return "unfinishTask";
	}
	
	
	
	private PageQuery  ConvertPageQuery(PageQuery pg,FlowDataContent fdc) throws Exception
	{
		pg.setRecordCount(String.valueOf(fdc.getRecordCount()));
		pg.setPageCount(String.valueOf(fdc.getRecordCount()/Integer.parseInt(this.getForm().getQuery().getPageSize())));
		pg.setRecordSet(Convert(fdc.getList()));
   	  	return pg;
	}
	
	private List<Map<String,Object>> Convert(List<FlowWorkBean> fwkList) throws Exception
	{
		Map<String,Object> map = null;
  	  	List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
  	  	for (FlowWorkBean fwb : fwkList) {
  	  		map = new HashMap<String,Object>();
			ConvertUtil.objectToMap(map, fwb);
			list.add(map);
		}
  	  	return list;
	}
	
	

	/**
	 * 认领任务
	 * 
	 * @return
	 */
	public String svaeClaimTask()
	{ 
		if (log.isDebugEnabled()) log.debug("Entering 'svaeClaimTask' mathod");
		flowWorkService.claimTask(this.getForm().getRecord().get("waitWorkFlowTaskId"),this.currentUser.getUserId());

		 return returnForward(RETURN_NORMAL);
	}
	
	/**
	 * 处理任务
	 * 
	 * @return
	 */
	public String taskEdit()
	{ 
		if (log.isDebugEnabled()) log.debug("Entering 'taskView' mathod");
		initForm();
		FlowWorkBean fwb = flowWorkService.findTask(this.getForm().getRecord().get("waitWorkFlowTaskId"));
		try {
			ConvertUtil.objectToMap(this.getModel().getRecord(), fwb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "taskEdit";
	}
	
	/**
	 * 查看任务,
	 * 
	 * @return
	 */
	public String taskView()
	{ 
		if (log.isDebugEnabled()) log.debug("Entering 'taskView' mathod");
		initForm();
		FlowWorkBean fwb = flowWorkService.findTask(this.getForm().getRecord().get("waitWorkFlowTaskId"));
		try {
			ConvertUtil.objectToMap(this.getModel().getRecord(), fwb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "taskView";
	}
	
	
	/**
	 * 处理任务,保存
	 * 
	 * @return
	 */
	public String svaeHandlerTask()
	{ 
		if (log.isDebugEnabled()) log.debug("Entering 'svaeHandlerTask' mathod");
		
		Map<String,Object> map = new HashMap<String,Object>();
		String type = this.getForm().getRecord().get("type");
		
		if(type.equals("1"))map.put("passed", "true");
		else map.put("passed", "false");
		
		flowWorkService.taskHandle(this.getForm().getRecord().get("waitWorkFlowTaskId"), map, Integer.parseInt(type), this.currentUser.getUserName(), this.getForm().getRecord().get("remark"));
		return returnForward(RETURN_NORMAL);
	}
	
	
	/**
	 * 初始化表单
	 */
	public void initForm()
	{
		this.getForm().getRecord().put("deptName", this.currentUser.getDeptName());
		this.getForm().getRecord().put("userName", this.currentUser.getUserName());
		   Code c = new Code();
		   c.setCodeName("通过");
		   c.setValue("1");
		   Code c1 = new Code();
		   c1.setCodeName("驳回");
		   c1.setValue("0");
		   List<Code> list = new ArrayList<Code>();
		   list.add(c);
		   list.add(c1);
		   setCode(this.getForm(), "type", list);
	}
	
}
