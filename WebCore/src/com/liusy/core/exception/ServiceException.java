package com.liusy.core.exception;

public class ServiceException extends RuntimeException {
   private static final long serialVersionUID = 1L;

   public ServiceException() {
   }

   public ServiceException(String s) {
      super(s);
   }

   public ServiceException(Exception e) {
      super(e.getMessage());
   }

}
