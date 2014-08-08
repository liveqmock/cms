package com.liusy.flow.common.work.exception;

public class FlowHandelException extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;

	public FlowHandelException() {
	}

	public FlowHandelException(String s) {
		super(s);
	}

	public FlowHandelException(Exception e) {
		super(e.getMessage());
	}

}
