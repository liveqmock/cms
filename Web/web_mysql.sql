-- MySQL dump 10.13  Distrib 5.5.21, for Win32 (x86)
--
-- Host: localhost    Database: cms
-- ------------------------------------------------------
-- Server version	5.5.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sys_code`
--

DROP TABLE IF EXISTS `sys_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_code` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TREE_LEVEL` int(11) DEFAULT NULL,
  `MODIFYBY` varchar(7) DEFAULT NULL,
  `ITEM_VALUE` varchar(32) DEFAULT NULL,
  `PARENT_VALUE` varchar(32) DEFAULT NULL,
  `CODE_STATUS` varchar(32) DEFAULT NULL,
  `MODIFYDATE` date DEFAULT NULL,
  `ORDER_NO` int(11) DEFAULT NULL,
  `CREATEDATE` date DEFAULT NULL,
  `CREATEBY` varchar(32) DEFAULT NULL,
  `PARENT_ITEM_ID` varchar(32) DEFAULT NULL,
  `ITEM_NAME` varchar(32) DEFAULT NULL,
  `TREE_CODE` longtext,
  `CS_ID` int(11) DEFAULT NULL,
  `REMARK` longtext,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4304 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_code`
--

LOCK TABLES `sys_code` WRITE;
/*!40000 ALTER TABLE `sys_code` DISABLE KEYS */;
INSERT INTO `sys_code` VALUES (1,0,'','0','','1',NULL,0,NULL,'','','暂停','',1,''),(2,0,'','1','','1',NULL,0,NULL,'','','启用','',1,''),(4,0,'','1','','1',NULL,0,NULL,'','','使用中','',2,''),(5,0,'admin','2','','1','2014-06-11',0,NULL,'','','禁用','',2,'ccc'),(6,0,'','3','','1',NULL,0,NULL,'','','注销','',2,''),(7,0,'','1','','1',NULL,0,NULL,'','','使用中','',3,''),(8,0,'','2','','1',NULL,0,NULL,'','','禁用','',3,''),(9,0,'','3','','1',NULL,0,NULL,'','','注销','',3,''),(10,0,'','0','','1',NULL,0,NULL,'','','否','',4,''),(11,0,'','1','','1',NULL,0,NULL,'','','是','',4,''),(12,0,'','1','','1',NULL,0,NULL,'','','GA','',5,''),(13,0,'','2','','1',NULL,0,NULL,'','','GB','',5,''),(14,0,'admin','99','','1','2009-10-28',0,NULL,'','','自定义','',5,''),(15,0,'','1','','1',NULL,0,NULL,'','','公共主题','',6,''),(16,0,'','2','','1',NULL,0,NULL,'','','分类主题','',6,''),(17,0,'','1','','1',NULL,0,NULL,'','','不排序','',7,''),(18,0,'','2','','1',NULL,0,NULL,'','','升序','',7,''),(19,0,'','3','','1',NULL,0,NULL,'','','降序','',7,''),(20,0,'','1','','1',NULL,0,NULL,'','','表','',8,''),(21,0,'admin','2','','1','2009-10-30',0,NULL,'','','接口','',8,''),(22,0,'','1','','1',NULL,0,NULL,'','','DEBUG','',9,''),(23,0,'','2','','1',NULL,0,NULL,'','','INFO','',9,''),(24,0,'','3','','1',NULL,0,NULL,'','','WARN','',9,''),(25,0,'','4','','1',NULL,0,NULL,'','','ERROR','',9,''),(26,0,'','5','','1',NULL,0,NULL,'','','FATAL','',9,''),(27,0,'admin','1','','1','2009-12-10',0,NULL,'','','模块','',10,''),(28,0,'','2','','1',NULL,0,NULL,'','','分页面','',10,''),(29,0,'admin','3','','1','2009-10-29',0,NULL,'','','组件','',10,''),(31,0,'','0','','1',NULL,0,NULL,'','','暂停','',11,''),(32,0,'','1','','1',NULL,0,NULL,'','','启用','',11,''),(34,0,'','1','','1',NULL,0,NULL,'','','已生效','',12,''),(35,0,'','2','','1',NULL,0,NULL,'','','添加未审核','',12,''),(36,0,'','3','','1',NULL,0,NULL,'','','删除未审核','',12,''),(37,0,'','4','','1',NULL,0,NULL,'','','添加未通过','',12,''),(38,0,'','5','','1',NULL,0,NULL,'','','删除未通过','',12,''),(39,0,'admin','1','','1','2009-11-27',0,NULL,'','','厅级','',13,''),(40,0,'','2','','1',NULL,0,NULL,'','','局级','',13,''),(41,0,'','3','','1',NULL,0,NULL,'','','处级','',13,''),(42,0,'','4','','1',NULL,0,NULL,'','','科级','',13,''),(43,0,'','9','','1',NULL,0,NULL,'','','一般干部','',13,''),(44,0,'','A','','1',NULL,0,NULL,'','','A','',14,''),(45,0,'admin','B','','1','2009-12-10',0,NULL,'','','B','',14,'sdc'),(46,0,'admin','C','','1','2009-12-10',0,NULL,'','','C','',14,''),(47,0,'admin','D','','1','2009-10-30',0,NULL,'','','D','',14,''),(48,0,'admin','=','','1','2010-05-06',0,NULL,'','','等于','',15,''),(49,0,'admin','>','','1','2010-05-06',0,NULL,'','','大于','',15,''),(50,0,'admin','>=','','1','2010-05-06',0,NULL,'','','大于等于','',15,''),(51,0,'admin','<','','1','2010-05-06',0,NULL,'','','小于','',15,''),(52,0,'admin','<=','','1','2010-05-06',0,NULL,'','','小于等于','',15,''),(53,0,'admin','!=','','1','2010-05-06',0,NULL,'','','不等于','',15,''),(54,0,'admin','LK','','1','2010-05-06',0,NULL,'','','匹配','',15,''),(55,0,'admin','BT','','1','2010-05-06',0,NULL,'','','区间','',15,''),(56,0,'','01','','1',NULL,0,NULL,'','','字符型','',16,''),(57,0,'','02','','1',NULL,0,NULL,'','','日期型','',16,''),(58,0,'','03','','1',NULL,0,NULL,'','','数值型','',16,''),(59,0,'','0','','1',NULL,0,NULL,'','','暂停','',17,''),(60,0,'','1','','1',NULL,0,NULL,'','','启用','',17,''),(61,0,'','2','','1',NULL,0,NULL,'','','通讯记录分析','',18,''),(62,0,'','3','','1',NULL,0,NULL,'','','住宿记录分析','',18,''),(63,0,'','4','','1',NULL,0,NULL,'','','出入境记录分析','',18,''),(64,0,'','1','','1',NULL,0,NULL,'','','飞行记录分析','',18,''),(65,0,'','5','','1',NULL,0,NULL,'','','综合关联分析','',18,''),(70,0,'','1','','1',NULL,0,NULL,'','','主题简单查','',20,''),(71,0,'','2','','1',NULL,0,NULL,'','','主题批量查','',20,''),(72,0,'','3','','1',NULL,0,NULL,'','','单表简单查','',20,''),(73,0,'','4','','1',NULL,0,NULL,'','','单表批量查','',20,''),(74,0,'','5','','1',NULL,0,NULL,'','','单表高级查','',20,''),(75,0,'','6','','1',NULL,0,NULL,'','','单表复杂高级查','',20,''),(76,0,'','0','','1',NULL,0,NULL,'','','自动对比','',22,''),(77,0,'','1','','1',NULL,0,NULL,'','','手动对比','',22,''),(78,0,'','2','','1',NULL,0,NULL,'','','每日','',23,''),(79,0,'','1','','1',NULL,0,NULL,'','','每周','',23,''),(80,0,'','0','','1',NULL,0,NULL,'','','每月','',23,''),(81,0,'','1','','1',NULL,0,NULL,'','','启用','',24,''),(82,0,'','0','','1',NULL,0,NULL,'','','禁用','',24,''),(1136,0,'','1','','1',NULL,0,'2009-10-29','admin','','启用','',19,''),(1137,0,'admin','0','','1','2009-10-29',0,'2009-10-29','admin','','禁用','',19,''),(2221,0,'','0','','1',NULL,0,'2010-01-26','admin','','申请','',21,''),(2222,0,'admin','1','','1','2010-03-29',0,'2010-01-26','admin','','科长待审','',21,''),(2223,0,'admin','2','','1','2010-03-29',0,'2010-01-26','admin','','处长待审','',21,''),(2224,0,'','3','','1',NULL,0,'2010-01-26','admin','','结束','',21,''),(2225,0,'admin','4','','1','2010-05-27',0,'2010-01-26','admin','','待查询员查询','',21,''),(2226,0,'admin','5','','1','2010-03-20',0,NULL,'admin','','已办结','',21,''),(2821,0,'','2010','','1',NULL,0,'2010-03-18','admin','','2010','',25,''),(2822,0,'','2011','','1',NULL,0,'2010-03-18','admin','','2011','',25,''),(2823,0,'','2012','','1',NULL,0,'2010-03-18','admin','','2012','',25,''),(2824,0,'admin','01','','1','2010-03-20',0,'2010-03-18','admin','','01','',26,''),(2825,0,'admin','02','','1','2010-03-20',0,'2010-03-18','admin','','02','',26,''),(2826,0,'admin','03','','1','2010-03-20',0,'2010-03-18','admin','','03','',26,''),(2827,0,'admin','04','','1','2010-03-20',0,'2010-03-18','admin','','04','',26,''),(2828,0,'admin','05','','1','2010-03-20',0,'2010-03-18','admin','','05','',26,''),(2829,0,'admin','06','','1','2010-03-20',0,'2010-03-18','admin','','06','',26,''),(2830,0,'admin','07','','1','2010-03-20',0,'2010-03-18','admin','','07','',26,''),(2831,0,'admin','08','','1','2010-03-20',0,'2010-03-18','admin','','08','',26,''),(2832,0,'admin','09','','1','2010-03-20',0,'2010-03-18','admin','','09','',26,''),(2833,0,'','10','','1',NULL,0,'2010-03-18','admin','','10','',26,''),(2834,0,'','11','','1',NULL,0,'2010-03-18','admin','','11','',26,''),(2835,0,'','12','','1',NULL,0,'2010-03-18','admin','','12','',26,''),(2981,0,'','1','','1',NULL,0,'2010-03-24','admin','','一般','',28,''),(2982,0,'','2','','1',NULL,0,'2010-03-24','admin','','紧急','',28,''),(2983,0,'','1','','1',NULL,0,'2010-03-24','admin','','拘留','',27,''),(2984,0,'','2','','1',NULL,0,'2010-03-24','admin','','边控','',27,''),(2985,0,'','3','','1',NULL,0,'2010-03-24','admin','','立案','',27,''),(2986,0,'','4','','1',NULL,0,'2010-03-24','admin','','证实','',27,''),(2987,0,'','5','','1',NULL,0,'2010-03-24','admin','','破案','',27,''),(2988,0,'','6','','1',NULL,0,'2010-03-24','admin','','线索','',27,''),(2989,0,'','7','','1',NULL,0,'2010-03-24','admin','','关系','',27,''),(2990,0,'','8','','1',NULL,0,'2010-03-24','admin','','掌握动态','',27,''),(2991,0,'','9','','1',NULL,0,'2010-03-24','admin','','自发线索','',27,''),(3001,0,'','1','','1',NULL,0,'2010-03-25','admin','','申请表','',29,''),(3002,0,'','2','','1',NULL,0,'2010-03-25','admin','','出入境','',29,''),(3003,0,'','3','','1',NULL,0,'2010-03-25','admin','','台胞证','',29,''),(3004,0,'','4','','1',NULL,0,'2010-03-25','admin','','民航订票','',29,''),(3005,0,'','5','','1',NULL,0,'2010-03-25','admin','','民航离港','',29,''),(3006,0,'','6','','1',NULL,0,'2010-03-25','admin','','住宿登记','',29,''),(3007,0,'','7','','1',NULL,0,'2010-03-25','admin','','户籍资料','',29,''),(3008,0,'','8','','1',NULL,0,'2010-03-25','admin','','工商资料','',29,''),(3167,0,'admin','6','','1','2010-03-29',0,'2010-03-29','admin','','环节待办','',21,''),(3168,0,'','7','','1',NULL,0,'2010-03-29','admin','','环节已办','',21,''),(3241,0,'','04','','1',NULL,0,'2010-04-03','admin','','图片型','',16,''),(3300,0,'','1','','1',NULL,0,NULL,'','','正在运行','',30,''),(3301,0,'','2','','1',NULL,0,NULL,'','','正在等待运行','',30,''),(3302,0,'','3','','1',NULL,0,NULL,'','','结束','',30,''),(3303,0,'','4','','1',NULL,0,NULL,'','','暂停','',30,''),(3304,0,'','5','','1',NULL,0,NULL,'','','失败','',30,''),(3305,0,'','3','','1',NULL,0,NULL,'','','仅一次','',23,''),(3333,0,'','1','','',NULL,0,NULL,'','','每周','',23,''),(3521,0,'admin','9','','1','2010-04-22',0,'2010-04-22','admin','','房产','',29,'该项必须处长审批'),(3522,0,'','1','','1',NULL,0,'2010-04-22','admin','','台湾涉嫌','',31,''),(3523,0,'','2','','1',NULL,0,'2010-04-22','admin','','外国涉嫌','',31,''),(3524,0,'','3','','1',NULL,0,'2010-04-22','admin','','敌对势力','',31,''),(3525,0,'','4','','1',NULL,0,'2010-04-22','admin','','反动媒体','',31,''),(3526,0,'','5','','1',NULL,0,'2010-04-22','admin','','民族分裂','',31,''),(3527,0,'','6','','1',NULL,0,'2010-04-22','admin','','恐怖组织','',31,''),(3528,0,'','7','','1',NULL,0,'2010-04-22','admin','','法轮功','',31,''),(3529,0,'','8','','1',NULL,0,'2010-04-22','admin','','宗教','',31,''),(3530,0,'','9','','1',NULL,0,'2010-04-22','admin','','打假','',31,''),(3531,0,'','10','','1',NULL,0,'2010-04-22','admin','','调研','',31,''),(3532,0,'','11','','1',NULL,0,'2010-04-22','admin','','邮路三防','',31,''),(3533,0,'','12','','1',NULL,0,'2010-04-22','admin','','外线','',31,''),(3534,0,'','13','','1',NULL,0,'2010-04-22','admin','','贩毒','',31,''),(3535,0,'','14','','1',NULL,0,'2010-04-22','admin','','国保','',31,''),(3536,0,'','15','','1',NULL,0,'2010-04-22','admin','','反黑','',31,''),(3537,0,'','16','','1',NULL,0,'2010-04-22','admin','','走私','',31,''),(3538,0,'','17','','1',NULL,0,'2010-04-22','admin','','经侦','',31,''),(3539,0,'','18','','1',NULL,0,'2010-04-22','admin','','网侦','',31,''),(3540,0,'','19','','1',NULL,0,'2010-04-22','admin','','其他','',31,''),(3541,0,'','10','','1',NULL,0,'2010-04-22','admin','','其他','',27,''),(4303,0,'','10000','','1',NULL,0,'2010-06-17','admin','','导出条数','',32,'');
/*!40000 ALTER TABLE `sys_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_codeset`
--

DROP TABLE IF EXISTS `sys_codeset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_codeset` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CS_TYPE` varchar(32) DEFAULT NULL,
  `CS_STATUS` varchar(2) DEFAULT NULL,
  `EN_NAME` varchar(32) DEFAULT NULL,
  `CN_NAME` varchar(32) DEFAULT NULL,
  `REMARK` longtext,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_codeset`
--

LOCK TABLES `sys_codeset` WRITE;
/*!40000 ALTER TABLE `sys_codeset` DISABLE KEYS */;
INSERT INTO `sys_codeset` VALUES (1,NULL,'1','USER_STATUS','人员状态',''),(2,NULL,'1','DEPT_STATUS','部门状态',''),(3,NULL,'1','ORG_STATUS','机构状态',''),(4,NULL,'1','YES_OR_NO','是否',''),(5,NULL,'1','DIC_TYPE','标准代码类型',''),(6,NULL,'1','SUB_TYPE','主题类型',''),(7,NULL,'1','DEFAULT_SORT','默认排序方式',''),(8,NULL,'1','DT_TYPE','资源表类型',''),(9,NULL,'1','LOG_LEVEL','日志级别',''),(10,NULL,'1','RES_TYPE','资源类型',''),(11,NULL,'1','ROLE_STATUS','角色状态',''),(12,NULL,'1','ALLOC_STATUS','分配状态',''),(13,NULL,'1','ADMIN_LEVEL','行政级别',''),(14,NULL,'1','SECURITY_LEVEL','安全等级',''),(15,NULL,'1','FILTER_OPER','数据库过滤条件',''),(16,NULL,'1','DATAMETA_TYPE','数据元类型',''),(17,NULL,'1','SPACE_STATUS','个人空间状态',''),(18,NULL,'1','ANALYSIS_TYPE','查询分析类型',''),(19,NULL,'1','CODE_STATUS','系统代码状态',''),(20,NULL,'1','PERSONALQUERY_TYPE','个人空间查询保存类型',''),(21,NULL,'1','PROCESS_APPLICATION_STATUS','业务审批状态',''),(22,NULL,'','COMAPRE_TYPE','对比分析方式',''),(23,NULL,'','COMPARE_CYCLE','对比周期',''),(24,NULL,'1','COMPARE_STATUS','对比状态',''),(25,NULL,'1','DATE_YEAR','日期年',''),(26,NULL,'1','DATE_MONTH','日期月',''),(27,NULL,'1','INFO_EFFECT','信息作用',''),(28,NULL,'1','EXIGENCE_LEVEL','紧急程度',''),(29,NULL,'1','SEARCH_CONTENT','查询内容',''),(30,NULL,'','COMPARE_RUN_STATUS','对比运行状态',''),(31,NULL,'1','CASE_PROPERTY','案件性质',''),(32,NULL,'1','PERSONAL_EXPORT_COUNT','个人空间导出数量','');
/*!40000 ALTER TABLE `sys_codeset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_dept`
--

DROP TABLE IF EXISTS `sys_dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_dept` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPT_NAME` varchar(64) DEFAULT NULL,
  `DEPT_ABBR` varchar(16) DEFAULT NULL,
  `TREE_LEVEL` int(11) DEFAULT NULL,
  `DEPT_CODE` varchar(64) DEFAULT NULL,
  `DEPT_STATUS` varchar(2) DEFAULT NULL,
  `UP_DEPT_ID` varchar(36) DEFAULT NULL,
  `ORG_ID` int(11) DEFAULT NULL,
  `LEADER_USER_ID` int(11) DEFAULT NULL,
  `TREE_CODE` varchar(32) DEFAULT NULL,
  `REMARK` longtext,
  `ORDER_NO` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4086 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_dept`
--

LOCK TABLES `sys_dept` WRITE;
/*!40000 ALTER TABLE `sys_dept` DISABLE KEYS */;
INSERT INTO `sys_dept` VALUES (1,'二一局','一局',1,'001','1 ','',1,0,'001','',1),(2,'信息处','信息处',2,'001001','1 ','1',1,0,'001001','',1),(3,'信息一处','信息一处',0,'0001','','2',1,0,'','',1),(4,'二局','二局',1,'002','1 ','',1,0,'002','',2),(5,'三局','三局',1,'003','1 ','',1,0,'003','',3),(6,'四局','四局',1,'004','1 ','',1,0,'004','',4),(7,'一处','一处',2,'002001','1 ','4',1,0,'002001','',1),(8,'一科','一科',3,'002001001','1 ','7',1,0,'002001001','',1),(4084,'十一处','十一处',0,'11','','',2,0,'','',11),(4085,'信息科','信息科',0,'12','','4084',2,0,'','',12);
/*!40000 ALTER TABLE `sys_dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_org`
--

DROP TABLE IF EXISTS `sys_org`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_org` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TREE_LEVEL` int(11) DEFAULT NULL,
  `ORG_STATUS` varchar(2) DEFAULT NULL,
  `UP_ORG_ID` int(11) DEFAULT NULL,
  `ORG_CODE` varchar(64) DEFAULT NULL,
  `ORG_NAME` varchar(128) DEFAULT NULL,
  `TREE_CODE` varchar(32) DEFAULT NULL,
  `ORG_ABBR` varchar(16) DEFAULT NULL,
  `REMARK` longtext,
  `ORDER_NO` int(11) DEFAULT NULL,
  `ORG_TYPE` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_org`
--

LOCK TABLES `sys_org` WRITE;
/*!40000 ALTER TABLE `sys_org` DISABLE KEYS */;
INSERT INTO `sys_org` VALUES (1,1,'1 ',NULL,'001','广东省信息技术研究所','001','省所','',0,''),(2,2,'',1,'001001','广州市信息技术研究所','001001','广州所','',0,'');
/*!40000 ALTER TABLE `sys_org` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_resource`
--

DROP TABLE IF EXISTS `sys_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_resource` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `RES_NAME` varchar(64) DEFAULT NULL,
  `RES_TYPE` varchar(1) DEFAULT NULL,
  `ACTION_URL` longtext,
  `POWER_ID` int(11) DEFAULT NULL,
  `RES_CODE` varchar(32) DEFAULT NULL,
  `REMARK` longtext,
  `ORDER_NO` int(11) DEFAULT NULL,
  `PARENT_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_resource`
--

LOCK TABLES `sys_resource` WRITE;
/*!40000 ALTER TABLE `sys_resource` DISABLE KEYS */;
INSERT INTO `sys_resource` VALUES (1,'系统管理','1','',1,'A99','',1,0),(3,'综合查询','1','',1,'A03','',3,0),(4,'组织机构管理','1','system/sysOrg.do',1,'A9901','',1,1),(5,'角色权限管理','1','system/sysRole.do?action=list',1,'A9902','',2,1),(6,'用户管理','1','system/sysUser.do?action=list',1,'A9903','',3,1),(7,'资源目录管理','1','system/ResourceTable.do?action=MAIN',1,'A9904','',4,1),(8,'主题管理','1','querycfg/subjectCfg.do',1,'A9905','',5,1),(9,'固定查询','1','',1,'A04','',4,0),(11,'业务审批','1','',1,'A06','',6,0),(12,'对比查询','1','',1,'A07','',7,0),(13,'元数据管理','1','',1,'A08','',8,0),(14,'决策分析','1','',0,'A09','',9,0),(16,'系统代码管理','1','config/sysCode.do',1,'A9907','',7,1),(19,'主题查询','1','',1,'A0301','',1,3),(20,'分类查询','1','',1,'A0302','',2,3),(21,'表查询','1','',1,'A0303','',3,3),(22,'全文检索查询','1','',1,'A0304','',4,3),(23,'人物关联查询','1','',1,'A0305','',5,3),(24,'常用查询','1','',1,'A0401','',1,9),(25,'通讯记录分析','1','',1,'A0402','',2,9),(26,'宾馆住宿分析','1','',1,'A0403','',3,9),(27,'出入境分析','1','',1,'A0404','',4,9),(28,'民航飞行分析','1','',1,'A0405','',5,9),(29,'综合分析','1','',1,'A0406','',6,9),(30,'地市管理','1','',1,'A0801','',1,13),(31,'数据元管理','1','',1,'A0803','',3,13),(32,'数据指标管理','1','',1,'A0804','',4,13),(33,'业务代码管理','1','',1,'A0805','',5,13),(34,'增加（添加收藏页，保存个人空间，导出）','2','querycfg/commSubject.do?action=add',1,'A9905-01','',1,8),(35,'修改','2','querycfg/commSubject.do?action=modify',1,'A9905-02','',2,8),(36,'删除','2','querycfg/commSubject.do?action=delete',1,'A9905-03','',3,8),(37,'查询配置','2','querycfg/subjectSynthesisCfg.do',1,'A9905-04','',4,8),(38,'刷新','2','querycfg/commSubject.do',1,'A9905-05','',5,8),(39,'增加','2','',1,'A0801-01','',1,30),(40,'修改','2','',1,'A0801-02','',2,30),(41,'删除','2','',1,'A0801-03','',3,30),(42,'刷新','2','',1,'A0801-04','',4,30),(43,'增加','2','system/sysRole.do?action=add',1,'A9902-01','',1,5),(44,'修改','2','system/sysRole.do?action=edit',1,'A9902-02','',2,5),(45,'删除','2','system/sysRole.do?action=delete',1,'A9902-03','',3,5),(46,'暂停','2','system/sysRole.do?action=stop',1,'A9902-04','',4,5),(47,'启用','2','system/sysRole.do?action=start',1,'A9902-05','',5,5),(48,'分配权限','2','system/sysRole.do?action=rights',1,'A9902-06','',6,5),(49,'审核','2','system/sysRole.do?action=verify',1,'A9902-07','',7,5),(50,'增加','2','system/sysUser.do?action=add',1,'A9903-01','',1,6),(51,'修改','2','system/sysUser.do?action=edit',1,'A9903-02','',2,6),(52,'删除','2','system/sysUser.do?action=delete',1,'A9903-03','',3,6),(53,'重置密码','2','system/sysUser.do?action=PWD',1,'A9903-04','',4,6),(54,'暂停','2','system/sysUser.do?action=stop',1,'A9903-05','',5,6),(55,'启用','2','system/sysUser.do?action=start',1,'A9903-06','',6,6),(56,'分配权限','2','system/sysUser.do?action=rights',1,'A9903-07','',7,6),(57,'审核','2','system/sysUser.do?action=verify',1,'A9903-08','',8,6),(59,'备忘录','1','personal/memoClassAction.do',1,'A0503','',1,10),(61,'数据分类管理','1','',1,'A0802','',2,13),(62,'查询条件管理','1','personal/queryCondition.do',1,'A0502','',2,10),(66,'数据资料管理','1','',1,'A0501','',3,10),(68,'业务受理','1','',1,'A0603','',13,11),(69,'办理结果','1','',1,'A0602','',14,11),(70,'业务申请','1','',1,'A0601','',15,11),(71,'我的对比查询','2','compare/compareInfo.do',1,'A0701','',1,12),(72,'分配资源','2','',1,'A9903-12','',12,6),(73,'排班管理','2','',1,'A0604','',14,11),(74,'派单管理','2','',1,'A0605','',13,11),(75,'查看结果','2','',1,'A0703','',3,12),(76,'查询审计','1','',1,'A9908','',8,1),(77,'我的申请','1','',1,'A060101','',0,70),(78,'待办申请','1','',1,'A060102','',0,70),(79,'已办申请','1','',1,'A060103','',0,70),(80,'未办理','1','',1,'A060301','',0,68),(81,'已办结','1','',1,'A060302','',0,68),(90,'黑名单管理','1','',1,'A9909','',10,1),(91,'黑名单报警结果','1','',1,'A0704','',3,71);
/*!40000 ALTER TABLE `sys_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_resource_role`
--

DROP TABLE IF EXISTS `sys_resource_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_resource_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` int(11) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `RES_ID` int(11) DEFAULT NULL,
  `APP_TIME` date DEFAULT NULL,
  `APP_NOTE` longtext,
  `OPER` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3889 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_resource_role`
--

LOCK TABLES `sys_resource_role` WRITE;
/*!40000 ALTER TABLE `sys_resource_role` DISABLE KEYS */;
INSERT INTO `sys_resource_role` VALUES (100,3,'0',61,NULL,'',''),(111,3,'0',59,NULL,'',''),(112,3,'0',62,NULL,'',''),(122,3,'0',63,NULL,'',''),(123,3,'0',64,NULL,'',''),(124,3,'0',65,NULL,'',''),(125,3,'0',66,NULL,'',''),(128,3,'0',67,NULL,'',''),(129,3,'0',68,NULL,'',''),(130,3,'0',69,NULL,'',''),(131,3,'0',70,NULL,'',''),(132,3,'0',71,NULL,'',''),(1129,103,'0',7,NULL,'',''),(1131,103,'0',2,NULL,'',''),(1132,103,'0',8,NULL,'',''),(1135,103,'0',5,NULL,'',''),(1501,101,'1',7,NULL,'','1'),(1502,101,'1',6,NULL,'','1'),(1523,3,'0',3,NULL,'',''),(1542,3,'0',2,NULL,'',''),(1621,3,'0',17,NULL,'',''),(1623,3,'0',19,NULL,'',''),(1624,3,'0',20,NULL,'',''),(1625,3,'0',21,NULL,'',''),(1626,3,'0',22,NULL,'',''),(1627,3,'0',23,NULL,'',''),(1628,3,'0',5,NULL,'',''),(1629,3,'0',6,NULL,'',''),(1630,3,'0',7,NULL,'',''),(1631,3,'0',8,NULL,'',''),(1632,3,'0',16,NULL,'',''),(1633,3,'0',9,NULL,'',''),(1634,3,'0',24,NULL,'',''),(1635,3,'0',25,NULL,'',''),(1636,3,'0',26,NULL,'',''),(1637,3,'0',27,NULL,'',''),(1638,3,'0',28,NULL,'',''),(1639,3,'0',29,NULL,'',''),(1640,3,'0',13,NULL,'',''),(1641,3,'0',30,NULL,'',''),(1642,3,'0',31,NULL,'',''),(1643,3,'0',32,NULL,'',''),(1644,3,'0',33,NULL,'',''),(1667,110,'0',2,NULL,'',''),(1668,110,'0',17,NULL,'',''),(1669,110,'0',13,NULL,'',''),(1670,110,'0',30,NULL,'',''),(1671,110,'0',31,NULL,'',''),(1672,110,'0',32,NULL,'',''),(1673,110,'0',33,NULL,'',''),(1845,3,'0',39,NULL,'',''),(1846,3,'0',40,NULL,'',''),(1847,3,'0',41,NULL,'',''),(1848,3,'0',42,NULL,'',''),(1849,3,'0',43,NULL,'',''),(1850,3,'0',44,NULL,'',''),(1851,3,'0',45,NULL,'',''),(1852,3,'0',46,NULL,'',''),(1853,3,'0',47,NULL,'',''),(1854,3,'0',48,NULL,'',''),(1855,3,'0',49,NULL,'',''),(1856,3,'0',50,NULL,'',''),(1857,3,'0',51,NULL,'',''),(1858,3,'0',52,NULL,'',''),(1859,3,'0',53,NULL,'',''),(1860,3,'0',54,NULL,'',''),(1861,3,'0',55,NULL,'',''),(1862,3,'0',56,NULL,'',''),(1863,3,'0',57,NULL,'',''),(1864,3,'0',34,NULL,'',''),(1865,3,'0',35,NULL,'',''),(1866,3,'0',36,NULL,'',''),(1867,3,'0',37,NULL,'',''),(1868,3,'0',38,NULL,'',''),(1869,3,'0',15,NULL,'',''),(1881,3,'0',1,NULL,'',''),(1882,3,'0',4,NULL,'',''),(1883,3,'0',74,NULL,'',''),(1884,3,'0',73,NULL,'',''),(1885,3,'0',72,NULL,'',''),(3342,3341,'0',19,NULL,'',''),(3343,3341,'0',20,NULL,'',''),(3344,3341,'0',21,NULL,'',''),(3356,3341,'0',39,NULL,'',''),(3357,3341,'0',43,NULL,'',''),(3358,3341,'0',50,NULL,'',''),(3359,3341,'0',34,NULL,'',''),(3360,3,'0',75,NULL,'',''),(3361,3,'0',76,NULL,'',''),(3884,1321,'0',21,NULL,'',''),(3885,1321,'0',22,NULL,'',''),(3886,1321,'0',23,NULL,'',''),(3887,1321,'0',25,NULL,'',''),(3888,1321,'0',26,NULL,'','');
/*!40000 ALTER TABLE `sys_resource_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_resource_user`
--

DROP TABLE IF EXISTS `sys_resource_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_resource_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `STATUS` varchar(1) DEFAULT NULL,
  `RES_ID` int(11) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `APP_TIME` date DEFAULT NULL,
  `APP_NOTE` longtext,
  `OPER` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=180596 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_resource_user`
--

LOCK TABLES `sys_resource_user` WRITE;
/*!40000 ALTER TABLE `sys_resource_user` DISABLE KEYS */;
INSERT INTO `sys_resource_user` VALUES (123,'0',71,1403,NULL,'',''),(779,'1',8,15,NULL,'','3'),(781,'1',2,15,NULL,'','3'),(1581,'0',4,1403,NULL,'',''),(1582,'0',7,1403,NULL,'',''),(1583,'0',6,1403,NULL,'',''),(1584,'0',8,1403,NULL,'',''),(1602,'1',2,12,NULL,'','1'),(1683,'1',9,226,NULL,'','3'),(1684,'0',24,226,NULL,'',''),(1685,'0',25,226,NULL,'',''),(1686,'0',26,226,NULL,'',''),(1687,'0',27,226,NULL,'',''),(1688,'1',28,226,NULL,'','3'),(1689,'1',29,226,NULL,'','3'),(1691,'1',3,226,NULL,'','1'),(1692,'1',19,226,NULL,'','1'),(1693,'1',20,226,NULL,'','1'),(1694,'1',21,226,NULL,'','1'),(1695,'1',22,226,NULL,'','1'),(1696,'1',23,226,NULL,'','1'),(1802,'0',10,1403,NULL,'',''),(1803,'0',50,1403,NULL,'',''),(1804,'0',51,1403,NULL,'',''),(1805,'0',52,1403,NULL,'',''),(1806,'0',53,1403,NULL,'',''),(1807,'0',54,1403,NULL,'',''),(1808,'0',55,1403,NULL,'',''),(1809,'0',56,1403,NULL,'',''),(1810,'0',57,1403,NULL,'',''),(1811,'0',34,1403,NULL,'',''),(1812,'0',35,1403,NULL,'',''),(1813,'0',36,1403,NULL,'',''),(1814,'0',37,1403,NULL,'',''),(1815,'0',38,1403,NULL,'',''),(1816,'0',59,1403,NULL,'',''),(1818,'0',15,1403,NULL,'',''),(1901,'0',5,524,NULL,'',''),(1902,'0',43,524,NULL,'',''),(1903,'0',44,524,NULL,'',''),(1904,'0',45,524,NULL,'',''),(1905,'0',46,524,NULL,'',''),(1906,'0',47,524,NULL,'',''),(1907,'0',48,524,NULL,'',''),(1908,'0',49,524,NULL,'',''),(1918,'0',7,524,NULL,'',''),(1941,'0',13,1403,NULL,'',''),(1942,'0',30,1403,NULL,'',''),(1943,'0',39,1403,NULL,'',''),(1944,'0',40,1403,NULL,'',''),(1945,'0',41,1403,NULL,'',''),(1946,'0',42,1403,NULL,'',''),(1947,'0',31,1403,NULL,'',''),(1948,'0',32,1403,NULL,'',''),(1949,'0',33,1403,NULL,'',''),(1950,'0',61,1403,NULL,'',''),(2082,'0',3,1403,NULL,'',''),(2083,'0',19,1403,NULL,'',''),(2084,'0',20,1403,NULL,'',''),(2085,'0',21,1403,NULL,'',''),(2086,'0',22,1403,NULL,'',''),(2087,'0',23,1403,NULL,'',''),(2125,'0',62,1403,NULL,'',''),(2566,'0',70,2561,NULL,'',''),(2567,'0',69,2561,NULL,'',''),(2571,'0',70,2562,NULL,'',''),(2572,'0',69,2562,NULL,'',''),(2756,'0',2,2563,NULL,'',''),(2757,'0',17,2563,NULL,'',''),(3009,'0',0,1,NULL,'','0'),(3347,'0',3,3345,NULL,'',''),(3348,'0',19,3345,NULL,'',''),(3349,'0',20,3345,NULL,'',''),(3350,'0',21,3345,NULL,'',''),(3351,'0',22,3345,NULL,'',''),(3352,'0',23,3345,NULL,'',''),(3353,'0',75,1403,NULL,'',''),(3681,'0',19,2562,NULL,'',''),(3682,'0',20,2562,NULL,'',''),(3683,'0',21,2562,NULL,'',''),(3762,'0',66,1403,NULL,'',''),(3763,'0',12,1403,NULL,'',''),(3764,'0',72,1403,NULL,'',''),(4040,'0',77,2562,NULL,'',''),(4041,'0',78,2562,NULL,'',''),(4042,'0',79,2562,NULL,'',''),(4043,'0',78,2563,NULL,'',''),(4044,'0',77,2561,NULL,'',''),(4045,'0',78,2561,NULL,'',''),(4046,'0',79,2561,NULL,'',''),(4066,'0',68,2918,NULL,'',''),(4067,'0',80,2918,NULL,'',''),(4068,'0',81,2918,NULL,'',''),(4069,'0',73,2562,NULL,'',''),(4070,'0',74,2562,NULL,'',''),(4071,'0',73,2918,NULL,'',''),(4072,'0',74,2918,NULL,'',''),(4073,'0',73,2563,NULL,'',''),(4074,'0',74,2563,NULL,'',''),(4075,'0',73,2916,NULL,'',''),(4076,'0',74,2916,NULL,'',''),(4077,'0',68,2916,NULL,'',''),(4078,'0',80,2916,NULL,'',''),(4079,'0',81,2916,NULL,'',''),(4087,'0',11,4086,NULL,'',''),(4088,'0',70,4086,NULL,'',''),(4089,'0',77,4086,NULL,'',''),(4090,'0',78,4086,NULL,'',''),(4091,'0',79,4086,NULL,'',''),(4092,'0',69,4086,NULL,'',''),(4093,'0',68,4086,NULL,'',''),(4094,'0',80,4086,NULL,'',''),(4095,'0',81,4086,NULL,'',''),(4096,'0',73,4086,NULL,'',''),(4097,'0',74,4086,NULL,'',''),(4099,'0',11,4098,NULL,'',''),(4100,'0',70,4098,NULL,'',''),(4101,'0',77,4098,NULL,'',''),(4102,'0',78,4098,NULL,'',''),(4103,'0',79,4098,NULL,'',''),(4104,'0',69,4098,NULL,'',''),(4105,'0',68,4098,NULL,'',''),(4106,'0',80,4098,NULL,'',''),(4107,'0',81,4098,NULL,'',''),(4108,'0',73,4098,NULL,'',''),(4109,'0',74,4098,NULL,'',''),(4111,'0',11,4110,NULL,'',''),(4112,'0',70,4110,NULL,'',''),(4113,'0',77,4110,NULL,'',''),(4114,'0',78,4110,NULL,'',''),(4115,'0',79,4110,NULL,'',''),(4116,'0',69,4110,NULL,'',''),(4117,'0',68,4110,NULL,'',''),(4118,'0',80,4110,NULL,'',''),(4119,'0',81,4110,NULL,'',''),(4120,'0',73,4110,NULL,'',''),(4121,'0',74,4110,NULL,'',''),(4122,'0',90,1,NULL,'',''),(4123,'0',91,1,NULL,'',''),(4344,'0',70,2563,NULL,'',''),(4345,'0',77,2563,NULL,'',''),(4346,'0',79,2563,NULL,'',''),(50020,'1',9,1403,NULL,'','1'),(50021,'1',24,1403,NULL,'','1'),(50022,'1',25,1403,NULL,'','1'),(50023,'1',26,1403,NULL,'','1'),(50024,'1',27,1403,NULL,'','1'),(50025,'1',28,1403,NULL,'','1'),(50026,'1',29,1403,NULL,'','1'),(50027,'1',91,1403,NULL,'','1'),(180562,'0',1,4110,NULL,'','1'),(180563,'0',4,4110,NULL,'','1'),(180564,'0',5,4110,NULL,'','1'),(180565,'0',43,4110,NULL,'','1'),(180566,'0',44,4110,NULL,'','1'),(180567,'0',45,4110,NULL,'','1'),(180568,'0',46,4110,NULL,'','1'),(180569,'0',47,4110,NULL,'','1'),(180570,'0',48,4110,NULL,'','1'),(180571,'0',49,4110,NULL,'','1'),(180572,'0',6,4110,NULL,'','1'),(180573,'0',50,4110,NULL,'','1'),(180574,'0',51,4110,NULL,'','1'),(180575,'0',52,4110,NULL,'','1'),(180576,'0',53,4110,NULL,'','1'),(180577,'0',54,4110,NULL,'','1'),(180578,'0',55,4110,NULL,'','1'),(180579,'0',56,4110,NULL,'','1'),(180580,'0',57,4110,NULL,'','1'),(180581,'0',72,4110,NULL,'','1'),(180582,'0',63,4110,NULL,'','1'),(180583,'0',64,4110,NULL,'','1'),(180584,'0',65,4110,NULL,'','1'),(180585,'0',7,4110,NULL,'','1'),(180586,'0',8,4110,NULL,'','1'),(180587,'0',34,4110,NULL,'','1'),(180588,'0',35,4110,NULL,'','1'),(180589,'0',36,4110,NULL,'','1'),(180590,'0',37,4110,NULL,'','1'),(180591,'0',38,4110,NULL,'','1'),(180592,'0',15,4110,NULL,'','1'),(180593,'0',16,4110,NULL,'','1'),(180594,'0',76,4110,NULL,'','1'),(180595,'0',90,4110,NULL,'','1');
/*!40000 ALTER TABLE `sys_resource_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(32) DEFAULT NULL,
  `ROLE_TYPE` varchar(1) DEFAULT NULL,
  `ROLE_STATUS` varchar(1) DEFAULT NULL,
  `ROLE_CODE` varchar(32) DEFAULT NULL,
  `APP_TIME` date DEFAULT NULL,
  `ROLE_DESC` varchar(128) DEFAULT NULL,
  `APP_NOTE` longtext,
  `REMARK` longtext,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3342 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
INSERT INTO `sys_role` VALUES (1,'审计管理员','1','1','A001',NULL,'审计管理员','','查看日志、审计信息、复核管理和统计，定义告警方案并对告警信息进行处理，查看目录权限和安全管理员的权限。'),(2,'日志管理员','1','1','A002',NULL,'日志管理员','','负责日志导出和清空，以及导入操作。'),(3,'测试角色','','1','A003',NULL,'测试角色','','测试用角色，拥有大部分权限'),(4,'排班管理员','1','1','A005',NULL,'审批管理员','','负责排班'),(5,'查询管理员','1','1','A004',NULL,'查询管理员','','复杂流程审批的归档等管理'),(110,'测试角色2','','1','A010',NULL,'zdc','','csads'),(1321,'34','','0','34',NULL,'34','','34'),(1462,'qqqq','','1','31',NULL,'','','qaaa'),(3341,'普通查询员','','1','B001',NULL,'','','');
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CHINESE_ACCOUNT` varchar(32) DEFAULT NULL,
  `ADMIN_LEVEL` varchar(1) DEFAULT NULL,
  `UPDATEDATE` date DEFAULT NULL,
  `ACCOUNT_TYPE` varchar(1) DEFAULT NULL,
  `ORG_ID` int(11) DEFAULT NULL,
  `USER_STATUS` varchar(2) DEFAULT NULL,
  `USER_ACCOUNT` varchar(64) NOT NULL,
  `ORDER_NO` int(11) DEFAULT NULL,
  `DEPT_ID` int(11) DEFAULT NULL,
  `ALP_SEARCH` varchar(128) DEFAULT NULL,
  `CA_ACCOUNT` varchar(32) DEFAULT NULL,
  `REMARK` longtext,
  `USER_NAME` varchar(16) NOT NULL,
  `USER_PASSWORD` varchar(32) DEFAULT NULL,
  `HIRE_DATE` date DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4662 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES (1,'','1','2010-03-20','1',1,'1','admin',121,3,'','','负责系统管理工作。','部署管理员','12345678',NULL,NULL),(2,'','9','2009-11-18','1',1,'1','reviewer',2,1,'','','对部署管理员的操作进行复核。','复核管理员','123',NULL,NULL),(12,'','1','2009-11-13','',1,'1','123',11,1,'','','','adsasd','a',NULL,NULL),(14,'','A',NULL,'',1,'1','asvc',11,1,'','','','sadffff','123456',NULL,NULL),(15,'','',NULL,'',1,'1','12312',11,1,'','','','zzzzz','123',NULL,NULL),(22,'','B',NULL,'',1,'1','123123',11,1,'','','','123123','11111',NULL,NULL),(42,'','B',NULL,'',1,'1','ssss',11,1,'','','','1111','11111',NULL,NULL),(43,'','1',NULL,'',1,'0','tttt',11,1,'','','this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.this is a test.','www','qqq',NULL,NULL),(68,'','3',NULL,'',1,'1','qwe',11,1,'','','fred','dew','1',NULL,NULL),(77,'','3',NULL,'',1,'1','asdf',21,1,'','','22222','dasd','2',NULL,NULL),(226,'','1','2009-11-25','',1,'1','ddsdf',1,1,'','','','ddsdf','sss',NULL,NULL),(444,'','1',NULL,'',1,'1','qqq',1,1,'','','qqq','qqq','qqq',NULL,NULL),(505,'','1',NULL,'',1,'1','www',21,1,'','','logic:iterate标签用来迭代集合，您可以使用如下方式来为这个标签指定其要叠代的集合：\r\n   使用一个运行时表达式，这个表达式的值是一个集合。 用name属性引用一个JSP Bean，这个JSP Bean本身就是一个集合。 用name属性引用一个JSP Bean：sdvf','www','www',NULL,NULL),(524,'','4','2010-05-06','',1,'1','as',213,3,'','','sdsasdfafdadsf','sasda','777',NULL,NULL),(1403,'','1','2009-12-11','',1,'1','test',21,1,'','','','测试用户','testtest',NULL,NULL),(2561,'','9','2010-03-10','',1,'1','testapply',15,1,'','','','测试申请发起者','12345678',NULL,NULL),(2562,'','4','2010-05-31','',1,'1','testaudit1',18,1,'','','','测试审批人','12345678',NULL,NULL),(2563,'','3','2010-03-10','',1,'1','testaudit2',21,1,'','','','测试最终审批人','12345678',NULL,NULL),(2916,'','2','2010-03-20','',1,'1','useraudit1',5,1,'','','','审批管理员1','12345678',NULL,NULL),(2918,'','2','2010-03-20','',1,'1','useraudit2',6,1,'','','','审批管理员2','12345678',NULL,NULL),(3345,'','9','2010-04-09','',1,'1','searchuser',20,2,'','','','普通查询员','12345678',NULL,NULL),(4086,'','4','2010-06-02','',1,'1','a111111',214,4085,'','','','a111111','12345678',NULL,NULL),(4098,'','4','2010-06-02','',1,'1','b222222',215,4085,'','','','b222222','12345678',NULL,NULL),(4110,'','3','2010-06-02','',1,'1','c333333',216,4084,'','','','c333333','c333333 ',NULL,NULL),(4661,'','4','2010-07-13','',1,'1','zhangsan',217,4084,'','','','张三','12345678',NULL,NULL);
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user_role`
--

DROP TABLE IF EXISTS `sys_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_ID` int(11) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `APP_TIME` date DEFAULT NULL,
  `APP_NOTE` longtext,
  `OPER` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4664 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_role`
--

LOCK TABLES `sys_user_role` WRITE;
/*!40000 ALTER TABLE `sys_user_role` DISABLE KEYS */;
INSERT INTO `sys_user_role` VALUES (1,3,'0',1,NULL,'',''),(2,5,'0',1,NULL,'',''),(3,4,'0',1,NULL,'',''),(519,103,'0',505,NULL,'',''),(522,104,'0',505,NULL,'',''),(1408,102,'1',12,NULL,'','1'),(1409,105,'1',12,NULL,'','1'),(1410,109,'1',12,NULL,'','1'),(1674,110,'0',1403,NULL,'',''),(1682,110,'0',226,NULL,'',''),(1690,3,'1',226,NULL,'','3'),(2564,110,'0',2561,NULL,'',''),(2917,5,'0',2916,NULL,'',''),(2919,5,'0',2918,NULL,'',''),(3346,3341,'0',3345,NULL,'',''),(4662,3,'0',4661,NULL,'',''),(4663,5,'0',4661,NULL,'','');
/*!40000 ALTER TABLE `sys_user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-11 14:21:56
