<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="struts" %>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
  
    <title>请增加书籍记录</title>
    <link rel="stylesheet" href="css/style.css"/>
  </head>
  
  <body>
    <form class="form-div" action="addbook.action" method="post" enctype="multipart/form-data"> 
    	<fieldset>
	    	<legend>增加书籍记录</legend>
	    	<span>书名</span><input style="width: 320px;" name="NAME" type="text"/><br/>
	    	<span>描述</span><textarea name="DISC" cols=50 rows=5>请输入书籍描述，在200字以内。</textarea><br/>
	    	<span>价格</span><input style="width: 320px;" name="PRICE" type="text"/><br/>
	    	<span>数量</span><input style="width: 320px;" name="NUM" type="text"/><br/>
	    	<span>图片</span><input style="width: 320px;" type="file" accept="image/png,image/gif,image/jpg" name="PIC"/><br/>
	    	<p style="padding-left: 60px;">支持png、gif、jpg类型图片</p><br/>
	    	<input type="submit" value="添加"/>
	    	<input type="reset" value="清空"/>
    	</fieldset>
    </form>
  </body>
</html>
