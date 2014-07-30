package com.liusy.core.util;

/**
 * <p> Title: 数据管理中心 </p>
 * 
 * <p> Description:常量类 </p>
 * 
 * <p> Copyright: Copyright (c) 2009-2011 </p>
 * 
 * <p> Company: </p>
 * 
 * @author liusy
 * @version 1.0
 */
public class Const {

   // 分页参数
   public static String DEFAULT_PAGE_SIZE = "10";
   public static String MAX_PAGE_SIZE = "500";
   public static String MIN_PAGE_SIZE = "2";

   // 系统登录SESSION参数
   public static String SESSION = "USERSESSION";
   public static String LOGIN_DEACTIVE = "0";
   public static String LOGIN_ACTIVE = "1";
   public static String LOGIN_VERFIYCODE = "VERFIYCODE";

   // 字段类型
   public static int FIELD_TYPE_STRING = 0;

   public static int FIELD_TYPE_INT = 1;

   public static int FIELD_TYPE_INTEGER = 2;

   public static int FIELD_TYPE_DOUBLE = 3;

   public static int FIELD_TYPE_DATE = 4;

   public static int FIELD_TYPE_BOOLEAN = 5;

   // 数据元类型
   public static String META_TYPE_STRING = "01";
   public static String META_TYPE_DATE = "02";
   public static String META_TYPE_NUMERIC = "03";
   public static String META_TYPE_PICTRUE = "04";
   // 查询操作符
   public static String FILTER_OPER_BETWEEN = "BT";
   public static String FILTER_OPER_LIKE = "LK";
   public static String FILTER_OPER_EQUAL = "=";
   public static String FILTER_OPER_NOTEQUAL = "!=";
   public static String FILTER_OPER_GT = ">";
   public static String FILTER_OPER_GTANDEQL = ">=";
   public static String FILTER_OPER_LT = "<";
   public static String FILTER_OPER_LTANDEQL = "<=";
   public static String FILTER_OPER_IN = "in";
   public static String FILTER_OPER_HAVING = "having";
   // 参数有效标记
   public static String TAG_ENABLE = "1";
   public static String TAG_DISABLE = "0";

   // 系统代码是否
   public static int CODE_YES = 1;
   public static int CODE_NO = 0;

}
