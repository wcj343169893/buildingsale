/* =================================================*/
/*            初始数据                                                                                       */
/* =================================================*/


-- 字典类型
INSERT INTO data_dict_type VALUES(NULL,'deal_pay_type','交易付款方式');
INSERT INTO data_dict_type VALUES(NULL,'deal_state','交易状态');
INSERT INTO data_dict_type VALUES(NULL,'loft_comty_type','物业类型');
INSERT INTO data_dict_type VALUES(NULL,'loft_build_type','建筑类型');
INSERT INTO data_dict_type VALUES(NULL,'house_state','房屋状态');
INSERT INTO data_dict_type VALUES(NULL,'emp_state','员工状态');
INSERT INTO data_dict_type VALUES(NULL,'client_server_state','客户状态');


-- 付款方式
INSERT INTO data_dict VALUES(NULL,1,'一次性付款','');
INSERT INTO data_dict VALUES(NULL,1,'分期付款','');
INSERT INTO data_dict VALUES(NULL,1,'银行按揭','');
-- 交易状态
INSERT INTO data_dict VALUES(NULL,2,'已下定','');
INSERT INTO data_dict VALUES(NULL,2,'已签合同','');
INSERT INTO data_dict VALUES(NULL,2,'房交所已审核','');
INSERT INTO data_dict VALUES(NULL,2,'已归档','');
-- --物业类型
INSERT INTO data_dict VALUES(NULL,3,'普通住房','');
-- --建筑类型
INSERT INTO data_dict VALUES(NULL,4,'高层','');
-- --房屋状态
INSERT INTO data_dict VALUES(NULL,5,'未售','');
INSERT INTO data_dict VALUES(NULL,5,'下订','');
INSERT INTO data_dict VALUES(NULL,5,'已售','');
-- --员工状态
INSERT INTO data_dict VALUES(NULL,6,'在职','');
INSERT INTO data_dict VALUES(NULL,6,'离职','');
-- ---客户状态
INSERT INTO data_dict VALUES(NULL,7,'新客户','');
INSERT INTO data_dict VALUES(NULL,7,'以分配','');
INSERT INTO data_dict VALUES(NULL,7,'以处理','');


/* =========菜单==========*/
-- 数据字典管理
INSERT INTO menu_info VALUES(NULL,'1','数据字典管理',DEFAULT,'','main','datadic.png','管理数据字典数据','');
-- 权限管理
INSERT INTO menu_info VALUES(NULL,'2','权限管理',DEFAULT,NULL,'main','key.png','管理用户角色和角色菜单','');
INSERT INTO menu_info VALUES(NULL,'201','角色管理','2','pages/struts/impower.do?operate=scanRole','main','group_edit.png','增、删、改、查角色以及给角色赋予权限','');
INSERT INTO menu_info VALUES(NULL,'202','角色菜单管理','2','pages/struts/impower.do?operate=toRoleMenu','main','crmtreeicon801.png','给角色赋予权限','');
INSERT INTO menu_info VALUES(NULL,'203','员工角色赋予','2','pages/struts/impower.do?operate=toEmpRole','main','crmtreeicon801.png','给角色赋予权限','');
INSERT INTO menu_info VALUES(NULL,'204','特殊权限管理','2','pages/struts/impower.do?operate=toEmpMenu','main','crmtreeicon302.png','给员工赋予特殊权限','');
-- 销售部信息管理
INSERT INTO menu_info VALUES(NULL,'3','销售部信息管理',DEFAULT,'pages/struts/shop.do?operate=toScanShop','main','house.png','销售部信息管理','');
-- 员工信息管理
INSERT INTO menu_info VALUES(NULL,'4','员工信息管理',DEFAULT,NULL,'main','crmtreeicon803.png','员工信息管理','');
INSERT INTO menu_info VALUES(NULL,'401','新员工入职','4','pages/struts/emp.do?operate=toNewEmp','main','newclient.png','新员工入职','');
INSERT INTO menu_info VALUES(NULL,'402','查询员工信息','4','pages/struts/emp.do?operate=toScanEmp','main','crmtreeicon802.png','查询员工信息','');
INSERT INTO menu_info VALUES(NULL,'403','员工成交套数和金额','4','pages/struts/emp.do?operate=toCountEmpSell','main','sellchance.png','查询员工成交套数和金额','');
INSERT INTO menu_info VALUES(NULL,'404','员工部门调动','4','pages/struts/emp.do?operate=toScanEmp','main','user_suit.png','员工调职','');
-- 楼盘信息管理
INSERT INTO menu_info VALUES(NULL,'5','楼盘信息管理',DEFAULT,NULL,'main','bricks.png','楼盘信息管理','');
INSERT INTO menu_info VALUES(NULL,'501','录入楼盘信息','5','pages/struts/loft.do?operate=toNewLoft','main','bt_feedback.gif','录入楼盘信息','');
INSERT INTO menu_info VALUES(NULL,'502','导入导出楼盘信息','5',NULL,'main','refresh.png','导入导出楼盘信息','');
INSERT INTO menu_info VALUES(NULL,'503','查询楼盘信息','5','pages/struts/loft.do?operate=toScanLoft','main','cd.png','查询楼盘信息','');
INSERT INTO menu_info VALUES(NULL,'504','房屋类型管理','5','pages/struts/house.do?operate=toScanHouseType','main','chart_bar.png','查询楼盘信息','');
INSERT INTO menu_info VALUES(NULL,'505','楼盘信息管理','5','pages/struts/loft.do?operate=loftManager','main','cookbook-cx.png','查询房屋信息','');
-- 客户管理
INSERT INTO menu_info VALUES(NULL,'6','客户管理',DEFAULT,NULL,'main','displayclient.png','客户管理','');
INSERT INTO menu_info VALUES(NULL,'601','新建客户','6','pages/~client/newclient.jsp','main','newEmp.png','新建客户','');
INSERT INTO menu_info VALUES(NULL,'602','分配客户','6','pages/struts/client.do?operate=toScanAllotClient','main','crmtreeicon8.png','分配客户','');
INSERT INTO menu_info VALUES(NULL,'603','更改客户需求','6','pages/struts/client.do?operate=toScanModiClient','main','crmtreeicon2.png','更改客户需求','');
INSERT INTO menu_info VALUES(NULL,'604','查询客户','6','pages/struts/client.do?operate=scanClient','main','crmtreeicon603.png','查询客户','');
-- 交易管理
INSERT INTO menu_info VALUES(NULL,'7','交易管理',DEFAULT,NULL,'main','crmtreeicon504.png','交易管理','');
INSERT INTO menu_info VALUES(NULL,'701','新增交易信息','7',NULL,'main','crmtreeicon403.png','新增交易信息','');
INSERT INTO menu_info VALUES(NULL,'702','预算表','7',NULL,'main','crmtreeicon201.png','预算表','');
INSERT INTO menu_info VALUES(NULL,'703','查询员工成交信息','7','pages/struts/emp.do?operate=toCountEmpSell','main','crmtreeicon404.png','查询员工成交信息','');
INSERT INTO menu_info VALUES(NULL,'704','查询房屋交易信息','7','pages/struts/deal.do?operate=toScanDeal','main','house.png','查询房屋交易信息','');
-- 报表统计
INSERT INTO menu_info VALUES(NULL,'8','报表统计',DEFAULT,NULL,'main','finishjh.png','报表统计','');
INSERT INTO menu_info VALUES(NULL,'801','店面统计','8',NULL,'main','edit.png','店面统计','');
INSERT INTO menu_info VALUES(NULL,'802','员工统计','8',NULL,'main','scanclient.png','员工统计','');
INSERT INTO menu_info VALUES(NULL,'803','店面销售排行榜','8',NULL,'main','crmtreeicon6.png','店面销售排行榜','');
INSERT INTO menu_info VALUES(NULL,'804','员工销售排行榜','8',NULL,'main','crmtreeicon601.png','员工销售排行榜','');

/* =========角色========== */
INSERT INTO role_info VALUES(NULL,'系统管理员','');
INSERT INTO role_info VALUES(NULL,'人事部','');
INSERT INTO role_info VALUES(NULL,'销售经理','');
INSERT INTO role_info VALUES(NULL,'店长','');
INSERT INTO role_info VALUES(NULL,'置业顾问','');
INSERT INTO role_info VALUES(NULL,'超级管理员','');

/* =========角色菜单========== */
-- 系统管理员
INSERT INTO role_menu VALUES(NULL,1,1);
INSERT INTO role_menu VALUES(NULL,1,2);
INSERT INTO role_menu VALUES(NULL,1,3);
INSERT INTO role_menu VALUES(NULL,1,4);
INSERT INTO role_menu VALUES(NULL,1,5);
-- 人事部
INSERT INTO role_menu VALUES(NULL,2,6);
INSERT INTO role_menu VALUES(NULL,2,7);
INSERT INTO role_menu VALUES(NULL,2,8);
INSERT INTO role_menu VALUES(NULL,2,9);
INSERT INTO role_menu VALUES(NULL,2,10);
-- 销售经理
INSERT INTO role_menu VALUES(NULL,3,11);
INSERT INTO role_menu VALUES(NULL,3,12);
INSERT INTO role_menu VALUES(NULL,3,13);
INSERT INTO role_menu VALUES(NULL,3,14);
INSERT INTO role_menu VALUES(NULL,3,15);
INSERT INTO role_menu VALUES(NULL,3,16);
INSERT INTO role_menu VALUES(NULL,3,27);
INSERT INTO role_menu VALUES(NULL,3,28);
INSERT INTO role_menu VALUES(NULL,3,29);
INSERT INTO role_menu VALUES(NULL,3,30);
INSERT INTO role_menu VALUES(NULL,3,31);
-- 店长
INSERT INTO role_menu VALUES(NULL,4,11);
INSERT INTO role_menu VALUES(NULL,4,13);
INSERT INTO role_menu VALUES(NULL,4,14);
INSERT INTO role_menu VALUES(NULL,4,15);
INSERT INTO role_menu VALUES(NULL,4,16);
INSERT INTO role_menu VALUES(NULL,4,17);
INSERT INTO role_menu VALUES(NULL,4,18);
INSERT INTO role_menu VALUES(NULL,4,19);
INSERT INTO role_menu VALUES(NULL,4,20);
INSERT INTO role_menu VALUES(NULL,4,21);
INSERT INTO role_menu VALUES(NULL,4,22);
INSERT INTO role_menu VALUES(NULL,4,23);
INSERT INTO role_menu VALUES(NULL,4,24);
INSERT INTO role_menu VALUES(NULL,4,25);
INSERT INTO role_menu VALUES(NULL,4,26);
INSERT INTO role_menu VALUES(NULL,4,27);
INSERT INTO role_menu VALUES(NULL,4,28);
INSERT INTO role_menu VALUES(NULL,4,29);
INSERT INTO role_menu VALUES(NULL,4,30);
INSERT INTO role_menu VALUES(NULL,4,31);
-- 置业顾问
INSERT INTO role_menu VALUES(NULL,5,11);
INSERT INTO role_menu VALUES(NULL,5,13);
INSERT INTO role_menu VALUES(NULL,5,14);
INSERT INTO role_menu VALUES(NULL,5,15);
INSERT INTO role_menu VALUES(NULL,5,16);
INSERT INTO role_menu VALUES(NULL,5,17);
INSERT INTO role_menu VALUES(NULL,5,18);
INSERT INTO role_menu VALUES(NULL,5,20);
INSERT INTO role_menu VALUES(NULL,5,21);
INSERT INTO role_menu VALUES(NULL,5,22);
INSERT INTO role_menu VALUES(NULL,5,23);
INSERT INTO role_menu VALUES(NULL,5,24);
INSERT INTO role_menu VALUES(NULL,5,25);
INSERT INTO role_menu VALUES(NULL,5,26);
INSERT INTO role_menu VALUES(NULL,5,27);
INSERT INTO role_menu VALUES(NULL,5,28);
INSERT INTO role_menu VALUES(NULL,5,29);
INSERT INTO role_menu VALUES(NULL,5,30);
INSERT INTO role_menu VALUES(NULL,5,31);
-- 超级管理员
INSERT INTO role_menu VALUES(NULL,6,1);
INSERT INTO role_menu VALUES(NULL,6,2);
INSERT INTO role_menu VALUES(NULL,6,3);
INSERT INTO role_menu VALUES(NULL,6,4);
INSERT INTO role_menu VALUES(NULL,6,5);
INSERT INTO role_menu VALUES(NULL,6,6);
INSERT INTO role_menu VALUES(NULL,6,7);
INSERT INTO role_menu VALUES(NULL,6,8);
INSERT INTO role_menu VALUES(NULL,6,9);
INSERT INTO role_menu VALUES(NULL,6,10);
INSERT INTO role_menu VALUES(NULL,6,11);
INSERT INTO role_menu VALUES(NULL,6,12);
INSERT INTO role_menu VALUES(NULL,6,13);
INSERT INTO role_menu VALUES(NULL,6,14);
INSERT INTO role_menu VALUES(NULL,6,15);
INSERT INTO role_menu VALUES(NULL,6,16);
INSERT INTO role_menu VALUES(NULL,6,17);
INSERT INTO role_menu VALUES(NULL,6,18);
INSERT INTO role_menu VALUES(NULL,6,19);
INSERT INTO role_menu VALUES(NULL,6,20);
INSERT INTO role_menu VALUES(NULL,6,21);
INSERT INTO role_menu VALUES(NULL,6,22);
INSERT INTO role_menu VALUES(NULL,6,23);
INSERT INTO role_menu VALUES(NULL,6,24);
INSERT INTO role_menu VALUES(NULL,6,25);
INSERT INTO role_menu VALUES(NULL,6,26);
INSERT INTO role_menu VALUES(NULL,6,27);
INSERT INTO role_menu VALUES(NULL,6,28);
INSERT INTO role_menu VALUES(NULL,6,29);
INSERT INTO role_menu VALUES(NULL,6,30);
INSERT INTO role_menu VALUES(NULL,6,31);
INSERT INTO role_menu VALUES(NULL,6,32);


/* =================================================*/
/*            其他测试数据                                                                                 */
/* =================================================*/


/*=========楼盘========== */
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_01','金沙港湾-F3',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_02','金沙港湾-F13',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_03','金沙港湾-F31',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_04','金沙港湾-F32',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_05','金沙港湾-F33',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_06','金沙港湾-F34',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_07','金沙港湾-F35',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_08','金沙港湾-F36',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_09','金沙港湾-F37',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_10','金沙港湾-F38',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_11','金沙港湾-F39',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_12','金沙港湾-F30',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_13','金沙港湾-F23',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_14','金沙港湾-F24',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_15','金沙港湾-F25',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_16','金沙港湾-F26',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_17','金沙港湾-F27',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');
INSERT INTO loft_info VALUES(NULL,'HY_JSGW_18','金沙港湾-F28',8,9,'沙坪坝','石门大桥','4650','2009-2-1','2009-5-1','2010-2-1',62.3,37.7,'261','haha','fafa');

/* =========单元信息==========*/
INSERT INTO unit_info VALUES(NULL,1,'N01','一单元',10,18,1);
INSERT INTO unit_info VALUES(NULL,1,'N02','二单元',10,18,2);
INSERT INTO unit_info VALUES(NULL,1,'N03','三单元',10,18,1);
INSERT INTO unit_info VALUES(NULL,1,'N04','四单元',10,18,2);
INSERT INTO unit_info VALUES(NULL,1,'N05','五单元',10,18,3);

/*=========店面信息==========*/
INSERT INTO shop_info VALUES(NULL,'LHS001','龙湖房地产公司总部','重庆市江北区','023-68886886','023-68886887','023-68886888','023-68886889','公司总部');

/*=========员工信息==========*/
INSERT INTO employee VALUES(NULL,1,'LH_S001_R001','parddu','123456','杜武全','123123123123123123',DEFAULT,'1981-9-1','34554345','重庆沙坪坝','parddu@163.com','crazyParddu',13);
INSERT INTO employee VALUES(NULL,1,'LH_S001_R002','xingba','123456','兴雨革月','123123123123123123',DEFAULT,'1981-9-1','34554345','重庆沙坪坝','parddu@163.com','crazyParddu',13);

/*=========员工角色==========*/
INSERT INTO emp_role VALUES(NULL,1,6);

/*-========房屋类型==========*/
INSERT INTO house_type VALUES(NULL,'一室一厅',1,1,1,1,1,0,'');
INSERT INTO house_type VALUES(NULL,'二室一厅',2,1,1,1,1,0,'');
INSERT INTO house_type VALUES(NULL,'三室一厅',3,1,1,1,1,0,'');
INSERT INTO house_type VALUES(NULL,'二室二厅',2,2,1,1,1,0,'');
INSERT INTO house_type VALUES(NULL,'三室二厅',3,2,1,1,1,0,'');


/*========客户信息===========*/
INSERT INTO client_info VALUES(NULL,1,'张成强',1,'13629796731','0713-2696366','1592344532','zcq100@126.com','重庆市沙坪坝','42118119900612912',NOW(),'我要大房子',15);
/*======== 交易记录==========*/
INSERT INTO deal_info VALUES(NULL,1,3,1,NOW(),234000,300,200,33,234,342,4999,2,50000,12,12,300000,23321,12);


SELECT * FROM data_dict;
SELECT * FROM CLIENT_INFO;
SELECT * FROM DEAL_INFO;
SELECT * FROM EMPLOYEE;
SELECT * FROM LOFT_INFO;
SELECT * FROM ROLE_INFO;
SELECT * FROM MENU_INFO;
SELECT * FROM UNIT_INFO;




