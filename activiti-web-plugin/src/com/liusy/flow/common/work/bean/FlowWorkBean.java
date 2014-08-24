package com.liusy.flow.common.work.bean;


/**
 * 待办表单
 * 
 * @author liusy 2014-07-30
 *
 */
public class FlowWorkBean extends BaseFlowBean {

	/**
	 * //待办唯一id//启动流程时可为空
	 */
	public final static String  WAITWORK_ID ="waitWorkId";
	/**
	 * //业务就主键
	 */
	public final static String  WAITWORK_KEY ="waitWorkKey";
	/**
	 * //业务主题
	 */
	public final static String  WAITWORK_SUBJECT ="waitWorkSubject";
	/**
	 * 业务类型
	 */
	public final static String  WAITWORK_TYPE ="waitWorkType";
	public final static String  WAITWORK_STATUS ="waitWorkStatus";
	public final static String  WAITWORK_DATE ="waitWorkDate";
	/**
	 * 系统用户唯一Id，申请人帐号,
	 */
	public final static String  WAITWORK_USERID ="waitWorkUserId";
	/**
	 * //用户显示名  申请人显示名
	 */
	public final static String  WAITWORK_USERNAME ="waitWorkUserName";
	/**
	 * //用户部门 申请人部门
	 */
	public final static String  WAITWORK_DEPARTMENT ="waitWorkDepartment";
	/**
	 * //其它说明
	 */
	public final static String  WAITWORK_REMARK ="waitWorkRemark";
	/**
	 * //业务明细表单请求路径//*.action?id=
	 */
	public final static String  WAITWORK_FORMURL ="waitWorkFormUrl";
	/**
	 * //严重程度0-100
	 */
	public final static String  WAITWORK_LEVEL ="waitWorkLevel";
	
	
	
	
	
	private String waitWorkId;//待办唯一id//启动流程时可为空
	
	private String waitWorkKey;//业务就主键
	private String waitWorkSubject;//业务主题
	private String waitWorkType;//业务类型
	private String waitWorkStatus;//已办。未办
	private String waitWorkDate;//业务申请时间
	private String waitWorkUserId;//系统用户唯一Id，申请人帐号,
	private String waitWorkUserName;//用户显示名  申请人显示名
	private String waitWorkDepartment;//用户部门 申请人部门
	private String waitWorkRemark;//其它说明
	
	private int waitWorkLevel;//严重程度0-100
	
	private String waitWorkFormUrl;//业务明细表单请求路径//*.action?id=
	
	
	
	
	public int getWaitWorkLevel() {
		return waitWorkLevel;
	}

	public void setWaitWorkLevel(int waitWorkLevel) {
		this.waitWorkLevel = waitWorkLevel;
	}

	public String getWaitWorkUserId() {
		return waitWorkUserId;
	}

	public void setWaitWorkUserId(String waitWorkUserId) {
		this.waitWorkUserId = waitWorkUserId;
	}

	public String getWaitWorkUserName() {
		return waitWorkUserName;
	}

	public void setWaitWorkUserName(String waitWorkUserName) {
		this.waitWorkUserName = waitWorkUserName;
	}

	public String getWaitWorkDepartment() {
		return waitWorkDepartment;
	}

	public void setWaitWorkDepartment(String waitWorkDepartment) {
		this.waitWorkDepartment = waitWorkDepartment;
	}


	public String getWaitWorkId() {
		return waitWorkId;
	}

	public void setWaitWorkId(String waitWorkId) {
		this.waitWorkId = waitWorkId;
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
