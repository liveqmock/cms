package com.liusy.core.exception;

public class DAOException extends RuntimeException {
   private static final long serialVersionUID = 1L;

   public DAOException() {
   }

   public DAOException(String s) {
      super(s);
   }

   public DAOException(Exception e) {
      super(e.getMessage());
   }
}