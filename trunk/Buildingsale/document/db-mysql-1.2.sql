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
   client_id            int not null auto_increment comment 'id���(�Զ�����)',
   emp_id               int comment 'Ա�����(����employee��emp_id)',
   client_name          varchar(20) not null comment '�ͻ�����',
   client_sex           bool not null comment '�ͻ��Ա�',
   client_tell1         varchar(13) not null comment '�ͻ��绰',
   client_tell2         varchar(13) comment '�ͻ��绰',
   client_tell3         varchar(13) comment '�ͻ��绰',
   client_email         varchar(100) comment '����',
   client_address       varchar(100) comment 'סַ',
   client_pid           varchar(18) comment '�ͻ����֤',
   client_time          datetime not null comment 'ע��ʱ��',
   client_remark        varchar(1000) comment '��ע',
   client_server_state  int comment '״̬(����date_dict���dd_id)',
   primary key (client_id)
);

alter table client_info comment '�ͻ���Ϣ��';

/*==============================================================*/
/* Table: data_dict                                             */
/*==============================================================*/
create table data_dict
(
   dd_id                int not null auto_increment comment 'id���(�Զ�����)',
   dd_tye               int not null comment '����data_dict_type���ddt_id',
   dd_value             varchar(100) not null comment '�����ֵ�ֵ',
   dd_remark            varchar(200) comment '�����ֵ䱸ע',
   primary key (dd_id)
);

/*==============================================================*/
/* Table: data_dict_type                                        */
/*==============================================================*/
create table data_dict_type
(
   ddt_id               int not null auto_increment comment 'id���(�Զ�����)',
   ddt_type             varchar(30) not null comment '��������(Ӣ��)',
   ddt_name             varchar(200) not null comment '������(����)',
   primary key (ddt_id)
);

alter table data_dict_type comment '�����ֵ����ͱ�';

/*==============================================================*/
/* Table: deal_info                                             */
/*==============================================================*/
create table deal_info
(
   deal_id              int not null auto_increment comment 'id���(�Զ�����)',
   emp_id               int not null comment 'Ա�����(����employye��emp_id)',
   house_id             int not null comment '��������(����house_info���house_id)',
   client_id            int not null comment '�ͻ����(����client_info��client_id)',
   deal_time            datetime not null comment '����ʱ��',
   deal_house_price     numeric(10,2) not null comment '���ݼ۸�',
   deal_deed_tax        numeric(8,2) not null comment '��˰',
   deal_trad_tax        numeric(8,2) not null comment '��ͬӡ��˰',
   deal_meta_tax        numeric(8,2) not null comment 'ת�Ƶ�½��',
   deal_land_tax        numeric(8,2) not null comment '������',
   deal_five_open       numeric(8,2) not null comment '��ͨ��',
   deal_big_build       numeric(8,2) not null comment '���޻���',
   deal_pay_style       int not null comment '���ʽ(����data_dict���dd_id)',
   deal_pawn_price      numeric(8,2) not null comment '�����',
   deal_pawn_tax        numeric(8,2) not null comment '��Ѻ�ǼǷ�',
   deal_pawn_trad_tax   numeric(8,2) not null comment '����ӡ��˰',
   deal_all_price       numeric(10,2) not null comment '�ܼƽ��',
   deal_book_money      numeric(9,2) not null comment '����',
   deal_state           int not null comment '����״̬(����data_dict��dd_id)',
   primary key (deal_id)
);

alter table deal_info comment '������Ϣ��';

/*==============================================================*/
/* Table: emp_menu                                              */
/*==============================================================*/
create table emp_menu
(
   em_id                int not null auto_increment comment 'id���(�Զ�����)',
   emp_id               int not null comment 'Ա�����',
   menu_id              int not null comment '�˵����',
   primary key (em_id)
);

alter table emp_menu comment 'Ա���˵���ϵ��';

/*==============================================================*/
/* Table: emp_role                                              */
/*==============================================================*/
create table emp_role
(
   mr_id                int not null auto_increment comment 'id���(�Զ�����)',
   role_id              int not null comment '��ɫ���',
   emp_id               int not null comment 'Ա�����',
   primary key (mr_id)
);

alter table emp_role comment 'Ա����ɫ��ϵ��';

/*==============================================================*/
/* Table: employee                                              */
/*==============================================================*/
create table employee
(
   emp_id               int not null auto_increment comment 'id���(�Զ�����)',
   shop_id              int comment 'id���(�Զ�����)',
   emp_no               varchar(15) not null comment 'Ա�����',
   emp_account          varchar(30) not null comment 'Ա���˺�',
   emp_pass             varchar(30) not null comment 'Ա������',
   emp_name             varchar(20) not null comment 'Ա������',
   emp_pid              varchar(18) not null comment 'ʡ��֤���',
   emp_sex              bool not null comment 'Ա���Ա�',
   emp_birthday         date comment 'Ա������',
   emp_tell             varchar(14) comment 'Ա���绰',
   emp_address          varchar(100) comment 'Ա����ַ',
   emp_email            varchar(50) comment 'Ա������',
   emp_remark           varchar(500) comment '��ע',
   emp_state            int comment 'id���(�Զ�����)',
   primary key (emp_id)
);

alter table employee comment 'Ա����Ϣ��';

/*==============================================================*/
/* Table: house_info                                            */
/*==============================================================*/
create table house_info
(
   house_id             int not null auto_increment comment 'id���(�Զ�����)',
   unit_id              int comment '��Ԫ(����unit_info���unit_id)',
   house_floors         int not null comment '¥��',
   house_no             varchar(15) not null comment '���ݱ��',
   house_type           int not null comment '��������(����house_type���ht_id)',
   house_build_area     numeric(5,2) not null comment '�������',
   house_build_price    numeric(8,2) comment '�����۸�',
   house_deal_build_price numeric(8,2) comment 'ʵ�����۵Ľ����۸�',
   house_use_area       numeric(8,2) not null comment '�������',
   house_use_price      numeric(8,2) comment '���ڼ۸�',
   house_deal_use_price numeric(8,2) comment 'ʵ�����۵����ڼ۸�',
   house_deal_price     numeric(10,2) comment '�����ܼ�',
   house_decoration     varchar(200) comment '����',
   house_state          int comment '����״̬(����data_dic���dd_id)',
   primary key (house_id)
);

alter table house_info comment '������Ϣ��';

/*==============================================================*/
/* Table: house_type                                            */
/*==============================================================*/
create table house_type
(
   ht_id                int not null auto_increment comment 'id���(�Զ�����)',
   ht_name              varchar(50) not null comment '����������',
   ht_room              int not null comment '��������',
   ht_halll             int not null comment '������',
   ht_wc                int not null comment '����������',
   ht_cookRoom          int not null comment '��������',
   ht_terrace           int not null comment '��̨����',
   ht_garden_area       numeric(6,2) not null comment '��԰',
   ht_img               varchar(40) not null comment '����ͼ',
   primary key (ht_id)
);

alter table house_type comment '����������Ϣ';

/*==============================================================*/
/* Table: loft_info                                             */
/*==============================================================*/
create table loft_info
(
   loft_id              int not null auto_increment comment 'id���(�Զ�����)',
   loft_no              varchar(15) not null comment '¥�̱��',
   loft_name            varchar(50) not null comment '¥����',
   loft_comty_type      int not null comment 'id���(�Զ�����)',
   loft_build_type      int not null comment 'id���(�Զ�����)',
   loft_zone            varchar(40) not null comment '����',
   loft_address         varchar(140) not null comment '��ַ',
   loft_price           numeric(8,2) comment '¥�̼۸�',
   loft_begin_time      datetime comment '����ʱ��',
   loft_shell_out_time  datetime comment '����ʱ��',
   loft_finish_time     datetime comment '¥�̿���ʱ��',
   loft_capacity       numeric(4,2) comment '�ݻ���',
   loft_green           numeric(4,2) comment '�̻���',
   loft_traffic         varchar(150) comment '��ͨ',
   loft_facility        varchar(500) comment '��������',
   loft_remark          varchar(8000) comment '¥�̱�ע',
   primary key (loft_id)
);

alter table loft_info comment '¥����Ϣ��';

/*==============================================================*/
/* Table: loft_shop                                             */
/*==============================================================*/
create table loft_shop
(
   ls_id                int not null auto_increment comment 'id���(�Զ�����)',
   loft_id              int not null comment '����loft_info���loft_id',
   shop_id              int not null comment '����shop_info��shop_id',
   primary key (ls_id)
);

alter table loft_shop comment '¥�̺���¥���Ĺ�ϵ��';

/*==============================================================*/
/* Table: menu_info                                             */
/*==============================================================*/
create table menu_info
(
   menu_id              int not null auto_increment comment 'id���(�Զ�����)',
   menu_no              varchar(10) not null comment '�˵����',
   menu_name            varchar(50) not null comment '�˵�����',
   menu_parent          varchar(10) not null comment '�����˵�',
   menu_url             varchar(255) comment '�����ַ',
   menu_target          varchar(30) comment '��ʾĿ��',
   menu_img             varchar(30) comment '�˵�ͼƬ',
   menu_desc            varchar(100) comment '����',
   menu_remark          varchar(200) comment '�˵���ע',
   primary key (menu_id)
);

alter table menu_info comment '�˵���Ϣ��';

/*==============================================================*/
/* Table: menu_item                                             */
/*==============================================================*/
create table menu_item
(
   mi_id                int not null auto_increment comment 'id���(�Զ�����)',
   menu_id              int comment '����menu_info��menu_id',
   mi_url               varchar(255) not null comment '�����ַ',
   mi_remark            varchar(200) comment '��ע˵��',
   primary key (mi_id)
);

alter table menu_item comment '�˵�����Ϣ��';

/*==============================================================*/
/* Table: role_info                                             */
/*==============================================================*/
create table role_info
(
   role_id              int not null auto_increment comment 'id���(�Զ�����)',
   role_name            varchar(100) not null comment '��ɫ����',
   role_remark          varchar(500) comment '��ע',
   primary key (role_id)
);

alter table role_info comment '��ɫ��Ϣ��';

/*==============================================================*/
/* Table: role_menu                                             */
/*==============================================================*/
create table role_menu
(
   rm_id                int not null auto_increment comment 'id���(�Զ�����)',
   role_id              int not null comment '��ɫ���',
   menu_id              int not null comment 'Ŀ¼���',
   primary key (rm_id)
);

alter table role_menu comment '��ɫĿ¼��';

/*==============================================================*/
/* Table: shop_info                                             */
/*==============================================================*/
create table shop_info
(
   shop_id              int not null auto_increment comment 'id���(�Զ�����)',
   shop_no              varchar(15) not null comment '��¥�����',
   shop_name            varchar(100) not null comment '����',
   shop_address         varchar(150) not null comment '��¥����ַ',
   shop_tell_one        varchar(13) not null comment '�绰1',
   shop_tell_two        varchar(13) comment '�绰2',
   shop_tell_three      varchar(13) comment '�绰3',
   shop_tell_four       varchar(13) comment '�绰4',
   shop_remark          varchar(5000) comment '��ע',
   primary key (shop_id)
);

alter table shop_info comment '��¥����Ϣ';

/*==============================================================*/
/* Table: unit_info                                             */
/*==============================================================*/
create table unit_info
(
   unit_id              int not null auto_increment comment 'id���(�Զ�����)',
   loft_id              int comment 'id���(�Զ�����)',
   unit_no              varchar(15) not null comment '��Ԫ���
            ',
   unit_name            varchar(20) not null comment '��Ԫ����',
   unit_house_number    int not null comment 'ÿ��ķ�������',
   unit_floor_number    int not null comment '¥������',
   unit_term            int comment '�����ں�',
   primary key (unit_id)
);

alter table unit_info comment '��Ԫ��Ϣ��';

-- �������� ������������

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


