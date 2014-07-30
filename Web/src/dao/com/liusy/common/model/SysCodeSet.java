package com.liusy.common.model;

import java.io.Serializable;

/**
 * This is an object that contains data related to the SYS_CODESET table.
 *
 * @hibernate.class
 *  table="SYS_CODESET"
 */

public class SysCodeSet implements Serializable {
    private static final long serialVersionUID = 1L;

   // primary key  
   private java.lang.Integer id;   //  

   // properties

   private java.lang.String csType;   // 代码集类型(一般、树型)

   private java.lang.String csStatus;   // 代码集状态(启用、停用)

   private java.lang.String enName;   // 代码集英文名称

   private java.lang.String cnName;   // 代码集中文名称

   private java.lang.String remark;   //  


   // Constructors
   public SysCodeSet() {
   }

   /**
    * The unique identifier of this class.
    * Return the value associated with the column: ID
    *  
    */
   public java.lang.Integer getId() { 
      return this.id; 
   }
   /**
    * The unique identifier of this class.
    * Set the value related to the column: ID
    * @param id is the 'ID' value
    */
   public void setId(java.lang.Integer id) { 
      this.id = id; 
   }

   /**
    * Return the value associated with the column: CS_TYPE
    * Description:代码集类型(一般、树型)
    */
   public java.lang.String getCsType() { 
      return this.csType; 
   }
   /**
    * Set the value related to the column: CS_TYPE
    * @param csType is the 'CS_TYPE' value
    */
   public void setCsType(java.lang.String csType) { 
      this.csType = csType; 
   }

   /**
    * Return the value associated with the column: CS_STATUS
    * Description:代码集状态(启用、停用)
    */
   public java.lang.String getCsStatus() { 
      return this.csStatus; 
   }
   /**
    * Set the value related to the column: CS_STATUS
    * @param csStatus is the 'CS_STATUS' value
    */
   public void setCsStatus(java.lang.String csStatus) { 
      this.csStatus = csStatus; 
   }

   /**
    * Return the value associated with the column: EN_NAME
    * Description:代码集英文名称
    */
   public java.lang.String getEnName() { 
      return this.enName; 
   }
   /**
    * Set the value related to the column: EN_NAME
    * @param enName is the 'EN_NAME' value
    */
   public void setEnName(java.lang.String enName) { 
      this.enName = enName; 
   }

   /**
    * Return the value associated with the column: CN_NAME
    * Description:代码集中文名称
    */
   public java.lang.String getCnName() { 
      return this.cnName; 
   }
   /**
    * Set the value related to the column: CN_NAME
    * @param cnName is the 'CN_NAME' value
    */
   public void setCnName(java.lang.String cnName) { 
      this.cnName = cnName; 
   }

   /**
    * Return the value associated with the column: REMARK
    * Description: 
    */
   public java.lang.String getRemark() { 
      return this.remark; 
   }
   /**
    * Set the value related to the column: REMARK
    * @param remark is the 'REMARK' value
    */
   public void setRemark(java.lang.String remark) { 
      this.remark = remark; 
   }


   public static String REF_CLASS = "SysCodeSet";
   public static String PROP_CS_TYPE = "csType";
   public static String PROP_CS_STATUS = "csStatus";
   public static String PROP_EN_NAME = "enName";
   public static String PROP_CN_NAME = "cnName";
   public static String PROP_REMARK = "remark";
   public static String PROP_ID = "id";

   public static String REF_TABLE = "SYS_CODESET";
   public static String COL_CS_TYPE = "CS_TYPE";
   public static String COL_CS_STATUS = "CS_STATUS";
   public static String COL_EN_NAME = "EN_NAME";
   public static String COL_CN_NAME = "CN_NAME";
   public static String COL_REMARK = "REMARK";
   public static String COL_ID = "ID";
   
   public boolean equals(Object obj) {
      if (null == obj) return false;
      if (!(obj instanceof com.liusy.common.model.SysCodeSet)) return false;
      else {
         com.liusy.common.model.SysCodeSet o = (com.liusy.common.model.SysCodeSet) obj;
         if (null == this.getId() || null == o.getId()) return false;
         else return (this.getId().equals(o.getId()));
      }
   }

   public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[SysCodeSet:");
		buffer.append(" id:").append(id);
		buffer.append(" csType:").append(dealNull(csType));
		buffer.append(" csStatus:").append(dealNull(csStatus));
		buffer.append(" enName:").append(dealNull(enName));
		buffer.append(" cnName:").append(dealNull(cnName));
		buffer.append(" remark:").append(dealNull(remark));
		buffer.append("]");
		return buffer.toString();
   }

   public String toJson() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("{");
		buffer.append("\"id\":\"").append(id).append("\"");
		buffer.append(",\"csType\":\"").append(dealNull(csType)).append("\"");
		buffer.append(",\"csStatus\":\"").append(dealNull(csStatus)).append("\"");
		buffer.append(",\"enName\":\"").append(dealNull(enName)).append("\"");
		buffer.append(",\"cnName\":\"").append(dealNull(cnName)).append("\"");
		buffer.append(",\"remark\":\"").append(dealNull(remark)).append("\"");
		buffer.append("}");
		return buffer.toString();
   }

	private String dealNull(Object str) {
		if(str==null) return ""; else return str.toString();
	}
}
