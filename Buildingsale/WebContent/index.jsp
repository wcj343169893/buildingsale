<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title><link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css" />   
<script type="text/javascript" src="extjs/adapter/ext/ext-base.js">   
</script>   
<script type="text/javascript" src="extjs/ext-all.js">   
</script>   
<script type="text/javascript" src="extjs/ext-lang-zh_CN.js" >   
</script>   
<script type="text/javascript">

Ext.onReady(function(){

//方法一
var _grid = new Ext.grid.GridPanel({
      id:'view_gird',
      height:200,
      width:305,
      renderTo:Ext.getBody(),
      colModel:new Ext.grid.ColumnModel([
      {
       align:'center',
       menuDisabled:true,
       header:'姓名'
      },
      {
       align:'center',
       menuDisabled:true,
       header:'年龄'
      },
      {
       align:'center',
       menuDisabled:true,
       header:'性别'
      }
      ]
      ),
      store: new Ext.data.Store({
       proxy: new Ext.data.MemoryProxy([['hjl','24','男'],['mm','23','女']]),
       reader:new Ext.data.ArrayReader({},['name','age','sex']),
       autoLoad:true
      }),
      sm: new Ext.grid.RowSelectionModel({
       listeners:{
        'rowselect':function(_sm, _index, _record){
         Ext.getCmp('_formpanel').getForm().loadRecord(_record);
        }
       }
      })
     
  
})

//方法二 分开写

/* var _proxy = new Ext.data.MemoryProxy([['hjl','24','男'],['mm','23','女']]);
     
var _reader = new Ext.data.ArrayReader(
      {},
      Ext.data.Record.create(['name','age','sex'])
      );

var _grid = new Ext.grid.GridPanel({
      height:200,
      renderTo:Ext.getBody(),
      cm:new Ext.grid.ColumnModel([{
       header:'姓名'
      },
      {
       header:'年龄'
      },
      {
       header:'性别'
      }
      ]),
      store: new Ext.data.Store({
       proxy:_proxy,
       reader:_reader,
       autoLoad:true
      })
     })*/
    
var _formpanel = new Ext.form.FormPanel({
       id:'_formpanel',
       width:305,
       frame:true,
       plain:true,
       defaultType:'textfield',
       renderTo:Ext.getBody(),
       items:[{
        fieldLabel:'姓名',
        name:'name'
       },{
        fieldLabel:'年龄',
        name:'age'
       },{
        fieldLabel:'性别',
        name:'sex'
       }],
       buttons:[{
        text:'修改',
        handler:function(_btn){
         var _rs = Ext.getCmp('view_gird').getSelectionModel().getSelected();
        
         _rs.set('name',this.ownerCt.getForm().getValues()['name']);
        
        }
       }]
      })
});

</script>

</head>
<body>

<div id="formPanel"></div>

</body>
</html>
