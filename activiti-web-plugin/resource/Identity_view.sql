drop table   act_id_info;
  
CREATE VIEW act_id_info
AS
SELECT
  '' as `ID_`,
   '' as  `REV_`,
    '' as `USER_ID_`,
    '' as `TYPE_`,
    '' as `KEY_`,
    '' as `VALUE_`,
   '' as  `PASSWORD_`,
   '' as  `PARENT_ID_`
FROM
  sys_user;



drop table   act_id_membership;
CREATE VIEW act_id_membership
AS
  SELECT
   USER_ACCOUNT as user_id_,
   ROLE_code as group_id_
  FROM sys_user su,sys_user_role sur,sys_role sr where su.id=sur.user_id and sr.id=sur.role_id;


drop table   act_id_user;
CREATE VIEW act_id_user
AS
  SELECT
   USER_ACCOUNT AS ID_,
   ACCOUNT_TYPE as REV_ ,
   '' as FIRST_,
   USER_NAME as LAST_,
   '' as EMAIL_,
   USER_PASSWORD as PWD_,
  'org/activiti/explorer/images/gonzo.jpg' as PICTURE_ID_
  FROM sys_user;



drop table   act_id_group;
CREATE VIEW act_id_group
AS
  SELECT
  ROLE_code  as `ID_`,
   ROLE_STATUS as `REV_`,
  ROLE_NAME as `NAME_`,
 ROLE_TYPE as `TYPE_`
  FROM sys_role;