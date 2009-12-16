<%@ tag import="com.zuxia.buildingsale.common.Page" pageEncoding="GBK" %>

<%@ attribute name="name" description="分页对象名称" required="true" %>
<%@ attribute name="scope" description="分页对象存储范围" required="true" %>
<%@ attribute name="formName" description="表单名" required="true" %>

<%
	Page pag = null; //分页对象
	if(scope.toLowerCase().equals("request")){
		pag = (Page)request.getAttribute(name);
	}
	else if(scope.toLowerCase().equals("session")){
		pag = (Page)session.getAttribute(name);
	}
	else{
		pag = (Page)application.getAttribute(name);
	}
%>

<style type="text/css" >
	.page_tag_txt{
		border-top:0px;
		border-left:0px;
		border-right:0px;
		border-bottom:solid 1px #006699;
		background-color:transparent;
    	text-align: center;
    	width:20px;
	}
	.page_tag_but{
		border:solid 1px #006699;
		height:18px;
		background-color:#B6D9F6;
		color:#006699;
		cursor:hand;
	}
	.page_a{
		color:#006699;
		text-decoration:none;
	}
	.page_a:hover{
		color:blue;
		text-decoration:underline;
	}
</style>

<font style="font-size:12px;color=#006699;">
共 <%=pag.getTotalRecordCount() %> 条记录&nbsp;
每页<input type="text" class="page_tag_txt" name="page.pageNumber" id="pageNumber" size="3" value="<%=pag.getPageRecordCount() %>" />条&nbsp;
当前<input type="text" class="page_tag_txt" name="page.pageIndex" id="pageIndex" size="3" value="<%=pag.getPageIndex()%>" />页/
共 <%=pag.getPageCount() %> 页
<a href="javascript:first();" class="page_a">第一页</a>
<a href="javascript:before();" class="page_a">上一页</a>
<a href="javascript:next();" class="page_a">下一页</a>
<a href="javascript:last();" class="page_a">末尾页</a>
<input type="button" value="跳转" class="page_tag_but" onclick="send()" />
</font>
<script type="text/javascript">
	function send(){
		this.document.<%=formName %>.submit();
	}
	function first(){
		this.document.getElementById("pageIndex").value = 1;
		send();
	}
	function before(){
		this.document.getElementById("pageIndex").value = <%=pag.getPageIndex()-1 %>;
		send();
	}
	function next(){
		this.document.getElementById("pageIndex").value = <%=pag.getPageIndex()+1 %>;
		send();
	}
	function last(){
		this.document.getElementById("pageIndex").value = <%=pag.getPageCount() %>;
		send();
	}
</script>