/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2009-12-10 13:48:34                          */
/* Version:        1.2                                          */
/*==============================================================*/


drop table if exists client_info;

drop table if exists data_dict;

drop table if exists data_dict_type;

drop table if exists deal_info;

drop table if exists emp_menu;

drop table if exists emp_role;

drop table if exists employee;

drop table if exists house_info;

drop table if exists house_type;

drop table if exists loft_info;

drop table if exists loft_shop;

drop table if exists menu_info;

drop table if exists menu_item;

drop table if exists role_info;

drop table if exists role_menu;

drop table if exists shop_info;

drop table if exists unit_info;

/*==============================================================*/
/* Table: client_info                                           */
/*==============================================================*/
create table client_info
(
   client_id            int not null auto_increment comment 'id编号(自动增长)',
   emp_id               int comment '员工编号(引用employee表emp_id)',
   client_name          varchar(20) not null comment '客户姓名',
   client_sex           bool not null comment '客户性别',
   client_tell1         varchar(13) not null comment '客户电话',
   client_tell2         varchar(13) comment '客户电话',
   client_tell3         varchar(13) comment '客户电话',
   client_email         varchar(100) comment '邮箱',
   client_address       varchar(100) comment '住址',
   client_pid           varchar(18) comment '客户身份证',
   client_time          datetime not null comment '注册时间',
   client_remark        varchar(1000) comment '备注',
   client_server_state  int comment '状态(引用date_dict表的dd_id)',
   primary key (client_id)
);

alter table client_info comment '客户信息表';

/*==============================================================*/
/* Table: data_dict                                             */
/*==============================================================*/
create table data_dict
(
   dd_id                int not null auto_increment comment 'id编号(自动增长)',
   dd_tye               int not null comment '引用data_dict_type表的ddt_id',
   dd_value             varchar(100) not null comment '数据字典值',
   dd_remark            varchar(200) comment '数据字典备注',
   primary key (dd_id)
);

/*==============================================================*/
/* Table: data_dict_type                                        */
/*==============================================================*/
create table data_dict_type
(
   ddt_id               int not null auto_increment comment 'id编号(自动增长)',
   ddt_type             varchar(30) not null comment '类型名字(英文)',
   ddt_name             varchar(200) not null comment '类型名(中文)',
   primary key (ddt_id)
);

alter table data_dict_type comment '数据字典类型表';

/*==============================================================*/
/* Table: deal_info                                             */
/*==============================================================*/
create table deal_info
(
   deal_id              int not null auto_increment comment 'id编号(自动增长)',
   emp_id               int not null comment '员工编号(引用employye表emp_id)',
   house_id             int not null comment '房子类型(引用house_info表的house_id)',
   client_id            int not null comment '客户编号(引用client_info的client_id)',
   deal_time            datetime not null comment '销售时间',
   deal_house_price     numeric(10,2) not null comment '房屋价格',
   deal_deed_tax        numeric(8,2) not null comment '契税',
   deal_trad_tax        numeric(8,2) not null comment '合同印花税',
   deal_meta_tax        numeric(8,2) not null comment '转移登陆费',
   deal_land_tax        numeric(8,2) not null comment '国土费',
   deal_five_open       numeric(8,2) not null comment '五通费',
   deal_big_build       numeric(8,2) not null comment '大修基金',
   deal_pay_style       int not null comment '付款方式(引用data_dict表的dd_id)',
   deal_pawn_price      numeric(8,2) not null comment '贷款额',
   deal_pawn_tax        numeric(8,2) not null comment '抵押登记费',
   deal_pawn_trad_tax   numeric(8,2) not null comment '按竭印花税',
   deal_all_price       numeric(10,2) not null comment '总计金额',
   deal_book_money      numeric(9,2) not null comment '定金',
   deal_state           int not null comment '交易状态(引用data_dict表dd_id)',
   primary key (deal_id)
);

alter table deal_info comment '交易信息表';

/*==============================================================*/
/* Table: emp_menu                                              */
/*==============================================================*/
create table emp_menu
(
   em_id                int not null auto_increment comment 'id编号(自动增长)',
   emp_id               int not null comment '员工编号',
   menu_id              int not null comment '菜单编号',
   primary key (em_id)
);

alter table emp_menu comment '员工菜单关系表';

/*==============================================================*/
/* Table: emp_role                                              */
/*==============================================================*/
create table emp_role
(
   mr_id                int not null auto_increment comment 'id编号(自动增长)',
   role_id              int not null comment '角色编号',
   emp_id               int not null comment '员工编号',
   primary key (mr_id)
);

alter table emp_role comment '员工角色关系表';

/*==============================================================*/
/* Table: employee                                              */
/*==============================================================*/
create table employee
(
   emp_id               int not null auto_increment comment 'id编号(自动增长)',
   shop_id              int comment 'id编号(自动增长)',
   emp_no               varchar(15) not null comment '员工编号',
   emp_account          varchar(30) not null comment '员工账号',
   emp_pass             varchar(30) not null comment '员工密码',
   emp_name             varchar(20) not null comment '员工姓名',
   emp_pid              varchar(18) not null comment '省份证编号',
   emp_sex              bool not null comment '员工性别',
   emp_birthday         date comment '员工生日',
   emp_tell             varchar(14) comment '员工电话',
   emp_address          varchar(100) comment '员工地址',
   emp_email            varchar(50) comment '员工邮箱',
   emp_remark           varchar(500) comment '备注',
   emp_state            int comment 'id编号(自动增长)',
   primary key (emp_id)
);

alter table employee comment '员工信息表';

/*==============================================================*/
/* Table: house_info                                            */
/*==============================================================*/
create table house_info
(
   house_id             int not null auto_increment comment 'id编号(自动增长)',
   unit_id              int comment '单元(引用unit_info表的unit_id)',
   house_floors         int not null comment '楼层',
   house_no             varchar(15) not null comment '房屋编号',
   house_type           int not null comment '房屋类型(引用house_type表的ht_id)',
   house_build_area     numeric(5,2) not null comment '建筑面积',
   house_build_price    numeric(8,2) comment '建筑价格',
   house_deal_build_price numeric(8,2) comment '实际销售的建筑价格',
   house_use_area       numeric(8,2) not null comment '套内面积',
   house_use_price      numeric(8,2) comment '套内价格',
   house_deal_use_price numeric(8,2) comment '实际销售的套内价格',
   house_deal_price     numeric(10,2) comment '房屋总价',
   house_decoration     varchar(200) comment '描述',
   house_state          int comment '房子状态(引用data_dic表的dd_id)',
   primary key (house_id)
);

alter table house_info comment '房屋信息表';

/*==============================================================*/
/* Table: house_type                                            */
/*==============================================================*/
create table house_type
(
   ht_id                int not null auto_increment comment 'id编号(自动增长)',
   ht_name              varchar(50) not null comment '房屋类型名',
   ht_room              int not null comment '卧室数量',
   ht_halll             int not null comment '厅数量',
   ht_wc                int not null comment '卫生间数量',
   ht_cookRoom          int not null comment '厨房数量',
   ht_terrace           int not null comment '阳台数量',
   ht_garden_area       numeric(6,2) not null comment '花园',
   ht_img               varchar(40) not null comment '户型图',
   primary key (ht_id)
);

alter table house_type comment '房屋类型信息';

/*==============================================================*/
/* Table: loft_info                                             */
/*==============================================================*/
create table loft_info
(
   loft_id              int not null auto_increment comment 'id编号(自动增长)',
   loft_no              varchar(15) not null comment '楼盘编号',
   loft_name            varchar(50) not null comment '楼盘名',
   loft_comty_type      int not null comment 'id编号(自动增长)',
   loft_build_type      int not null comment 'id编号(自动增长)',
   loft_zone            varchar(40) not null comment '区域',
   loft_address         varchar(140) not null comment '地址',
   loft_price           numeric(8,2) comment '楼盘价格',
   loft_begin_time      datetime comment '开工时间',
   loft_shell_out_time  datetime comment '开盘时间',
   loft_finish_time     datetime comment '楼盘竣工时间',
   loft_capacity       numeric(4,2) comment '容积率',
   loft_green           numeric(4,2) comment '绿化率',
   loft_traffic         varchar(150) comment '交通',
   loft_facility        varchar(500) comment '配套设置',
   loft_remark          varchar(8000) comment '楼盘备注',
   primary key (loft_id)
);

alter table loft_info comment '楼盘信息表';

/*==============================================================*/
/* Table: loft_shop                                             */
/*==============================================================*/
create table loft_shop
(
   ls_id                int not null auto_increment comment 'id编号(自动增长)',
   loft_id              int not null comment '引用loft_info表的loft_id',
   shop_id              int not null comment '引用shop_info的shop_id',
   primary key (ls_id)
);

alter table loft_shop comment '楼盘和售楼部的关系表';

/*==============================================================*/
/* Table: menu_info                                             */
/*==============================================================*/
create table menu_info
(
   menu_id              int not null auto_increment comment 'id编号(自动增长)',
   menu_no              varchar(10) not null comment '菜单编号',
   menu_name            varchar(50) not null comment '菜单名字',
   menu_parent          varchar(10) not null comment '父级菜单',
   menu_url             varchar(255) comment '请求地址',
   menu_target          varchar(30) comment '显示目标',
   menu_img             varchar(30) comment '菜单图片',
   menu_desc            varchar(100) comment '描述',
   menu_remark          varchar(200) comment '菜单备注',
   primary key (menu_id)
);

alter table menu_info comment '菜单信息表';

/*==============================================================*/
/* Table: menu_item                                             */
/*==============================================================*/
create table menu_item
(
   mi_id                int not null auto_increment comment 'id编号(自动增长)',
   menu_id              int comment '引用menu_info的menu_id',
   mi_url               varchar(255) not null comment '请求地址',
   mi_remark            varchar(200) comment '备注说明',
   primary key (mi_id)
);

alter table menu_item comment '菜单项信息表';

/*==============================================================*/
/* Table: role_info                                             */
/*==============================================================*/
create table role_info
(
   role_id              int not null auto_increment comment 'id编号(自动增长)',
   role_name            varchar(100) not null comment '角色名字',
   role_remark          varchar(500) comment '备注',
   primary key (role_id)
);

alter table role_info comment '角色信息表';

/*==============================================================*/
/* Table: role_menu                                             */
/*==============================================================*/
create table role_menu
(
   rm_id                int not null auto_increment comment 'id编号(自动增长)',
   role_id              int not null comment '角色编号',
   menu_id              int not null comment '目录编号',
   primary key (rm_id)
);

alter table role_menu comment '角色目录表';

/*==============================================================*/
/* Table: shop_info                                             */
/*==============================================================*/
create table shop_info
(
   shop_id              int not null auto_increment comment 'id编号(自动增长)',
   shop_no              varchar(15) not null comment '售楼部编号',
   shop_name            varchar(100) not null comment '名称',
   shop_address         varchar(150) not null comment '售楼部地址',
   shop_tell_one        varchar(13) not null comment '电话1',
   shop_tell_two        varchar(13) comment '电话2',
   shop_tell_three      varchar(13) comment '电话3',
   shop_tell_four       varchar(13) comment '电话4',
   shop_remark          varchar(5000) comment '备注',
   primary key (shop_id)
);

alter table shop_info comment '售楼部信息';

/*==============================================================*/
/* Table: unit_info                                             */
/*==============================================================*/
create table unit_info
(
   unit_id              int not null auto_increment comment 'id编号(自动增长)',
   loft_id              int comment 'id编号(自动增长)',
   unit_no              varchar(15) not null comment '单元编号
            ',
   unit_name            varchar(20) not null comment '单元名称',
   unit_house_number    int not null comment '每层的房屋数量',
   unit_floor_number    int not null comment '楼层数量',
   unit_term            int comment '工程期号',
   primary key (unit_id)
);

alter table unit_info comment '单元信息表';

-- 开发初期 不建议添加外键

/*
alter table client_info add constraint FK_Relationship_21 foreign key (emp_id)
      references employee (emp_id) on delete restrict on update restrict;

alter table client_info add constraint FK_Relationship_6 foreign key (client_server_state)
      references data_dict (dd_id) on delete restrict on update restrict;

alter table data_dict add constraint FK_Relationship_4 foreign key (dd_tye)
      references data_dict_type (ddt_id) on delete restrict on update restrict;

alter table deal_info add constraint FK_DealPayStyleRelationship foreign key (deal_pay_style)
      references data_dict (dd_id) on delete restrict on update restrict;

alter table deal_info add constraint FK_DealSateRelationship foreign key (deal_state)
      references data_dict (dd_id) on delete restrict on update restrict;

alter table deal_info add constraint FK_Relationship_18 foreign key (house_id)
      references house_info (house_id) on delete restrict on update restrict;

alter table deal_info add constraint FK_Relationship_19 foreign key (client_id)
      references client_info (client_id) on delete restrict on update restrict;

alter table deal_info add constraint FK_Relationship_22 foreign key (emp_id)
      references employee (emp_id) on delete restrict on update restrict;

alter table emp_menu add constraint FK_emp_id2 foreign key (menu_id)
      references menu_info (menu_id) on delete restrict on update restrict;

alter table emp_menu add constraint FK_menu_id2 foreign key (emp_id)
      references employee (emp_id) on delete restrict on update restrict;

alter table emp_role add constraint FK_emp_id foreign key (role_id)
      references role_info (role_id) on delete restrict on update restrict;

alter table emp_role add constraint FK_role_id2 foreign key (emp_id)
      references employee (emp_id) on delete restrict on update restrict;

alter table employee add constraint FK_Relationship_17 foreign key (emp_state)
      references data_dict (dd_id) on delete restrict on update restrict;

alter table employee add constraint FK_Relationship_20 foreign key (shop_id)
      references shop_info (shop_id) on delete restrict on update restrict;

alter table house_info add constraint FK_Relationship_12 foreign key (house_type)
      references house_type (ht_id) on delete restrict on update restrict;

alter table house_info add constraint FK_Relationship_13 foreign key (unit_id)
      references unit_info (unit_id) on delete restrict on update restrict;

alter table house_info add constraint FK_Relationship_8 foreign key (house_state)
      references data_dict (dd_id) on delete restrict on update restrict;

alter table loft_info add constraint FK_Relationship_23 foreign key (loft_comty_type)
      references data_dict (dd_id) on delete restrict on update restrict;

alter table loft_info add constraint FK_Relationship_7 foreign key (loft_build_type)
      references data_dict (dd_id) on delete restrict on update restrict;

alter table loft_shop add constraint FK_loft_shopRelationship foreign key (loft_id)
      references loft_info (loft_id) on delete restrict on update restrict;

alter table loft_shop add constraint FK_loft_shopRelationship2 foreign key (shop_id)
      references shop_info (shop_id) on delete restrict on update restrict;

alter table menu_item add constraint FK_Relationship_11 foreign key (menu_id)
      references menu_info (menu_id) on delete restrict on update restrict;

alter table role_menu add constraint FK_menu_id foreign key (role_id)
      references role_info (role_id) on delete restrict on update restrict;

alter table role_menu add constraint FK_role_id foreign key (menu_id)
      references menu_info (menu_id) on delete restrict on update restrict;

alter table unit_info add constraint FK_Relationship_14 foreign key (loft_id)
      references loft_info (loft_id) on delete restrict on update restrict;
*/


