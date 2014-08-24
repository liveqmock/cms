package com.liusy.flow.common.work.util;

import java.util.ArrayList;
import java.util.List;

import com.liusy.flow.common.work.bean.FlowWorkBean;

public class FlowDataContent {
	
	
		private List<FlowWorkBean> list = new ArrayList<FlowWorkBean>();
	
		private long                    pageSize;      // 每页记录数

		private int                    pageNumber;    // 当前页号

		private long                    recordCount;   // 总记录数

		private int                    pageCount;     // 总页数
		
		
		public List<FlowWorkBean> getList() {
			return list;
		}


		public void setList(List<FlowWorkBean> list) {
			this.list = list;
		}


		public long getPageSize() {
			return pageSize;
		}


		public void setPageSize(long pageSize) {
			this.pageSize = pageSize;
		}


		public int getPageNumber() {
			return pageNumber;
		}


		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}


		public long getRecordCount() {
			return recordCount;
		}


		public void setRecordCount(long recordCount) {
			this.recordCount = recordCount;
		}


		public int getPageCount() {
			return pageCount;
		}


		public void setPageCount(int pageCount) {
			this.pageCount = pageCount;
		}


		public FlowDataContent(long pageSize,int pageNumber)
		{
			this.pageSize=pageSize;
			this.pageNumber = pageNumber;
			
		}
		
		
		public FlowDataContent()
		{
			
			this.pageSize=20;
			this.pageNumber = 1;
		}
		public FlowDataContent(List<FlowWorkBean> list,long recordCount,long pageSize,int pageNumber)
		{
			this.pageSize=pageSize;
			this.pageNumber = pageNumber;
			this.list = list;
			this.recordCount = recordCount;
		}
}
