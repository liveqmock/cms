package com.liusy.core.util;

public class IDCard { 
   final static int[] wi = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2,1}; 
   final static int[] vi = {1,0,'X',9,8,7,6,5,4,3,2}; 
   
   public static void main(String[] args){
      System.out.println(verify("")) ;
   }

   private IDCard() { 
   } 
   /**
    * 验证身份证合法性
    * @param idcard
    * @return
    */
   public static boolean verify(String idcard) { 
      if (idcard.length() == 15) {  
         idcard = upTo18(idcard);   
      } 
      
      if (idcard.length() != 18) {  
         return false;  
      }
      
      String verify = idcard.substring(17, 18); 
      
      return verify.equals(getVerify(idcard)) ;    
   } 

   /**
    * 升级一代身份证 15到18
    * @param fifteencardid
    * @return
    */
   public static String upTo18(String fifteencardid) { 
      String eightcardid = fifteencardid.substring(0,6);       
      eightcardid = eightcardid + "19";      
      eightcardid = eightcardid + fifteencardid.substring(6,15);     
      eightcardid = eightcardid + getVerify(eightcardid);      
      return eightcardid; 
   } 
   
   //get verify      
   private static String getVerify(String eightcardid) {    
      int remaining = 0;      
      if (eightcardid.length() == 18) {   
         eightcardid = eightcardid.substring(0, 17);  
      } 
      int[] ai = new int[18]; 
      if (eightcardid.length() == 17) {      
         int sum = 0;                  
         for (int i = 0; i < 17; i++) {      
            String k = eightcardid.substring(i, i + 1);        
            ai[i] = Integer.parseInt(k);           
            sum = sum + wi[i] * ai[i];       
         }                 
         remaining = sum % 11;   
      }
      return remaining == 2 ? "X" : String.valueOf(vi[remaining]); 
   }
} 