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
  
    <title>请修改书籍记录</title>
    <link rel="stylesheet" href="css/style.css"/>
  </head>
  
  <body>
  	<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
		<img src="imgs/background.jpg" height="100%" width="100%"/>    
	</div> 
    <form class="form-div" action="UpdateBook.action?NO=${param.NO }" method="post">
    <fieldset>
    	<legend>修改书籍记录</legend>
    	<span>序号</span><input style="width: 320px;" name="NO" type="text" disabled="disabled" value="${param.NO }"/><br/>
    	<span>书名</span><input style="width: 320px;" name="NAME" type="text"/><br/>
    	<span style="line-height: 80px;vertical-align>: top;">描述</span><textarea name="DISC" cols=50 rows=5>请输入书籍描述，在200字以内。</textarea><br/>
    	<span>价格</span><input style="width: 320px;" name="PRICE" type="text"/><br/>
    	<span>数量</span><input style="width: 320px;" name="NUM" type="text"/><br/>
    	<input class="input-btn btn-1" type="submit" value="修改"/>
    	<input class="input-btn btn-2" type="reset" value="清空"/>
    </fieldset> 
    </form>
  </body>
</html>
