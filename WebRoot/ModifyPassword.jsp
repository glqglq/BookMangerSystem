<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="struts" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改密码</title>
    <link rel="stylesheet" href="css/style.css"/>
  </head>
  
  <body>
  	<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
		<img src="imgs/background.jpg" height="100%" width="100%"/>    
	</div> 
    <form class="form-div" action="ModifyPassword.action" method="post">
    	<fieldset>
    		<legend>修改密码</legend>
    		<span>用户名</span><input name="NAME" type="text"/><br/>
    		<span>旧密码</span><input name="OLDPASSWD" type="password"/><br/>
    		<span>新密码</span><input name="NEWPASSWD" type="password"/><br/>
    		<input class="input-btn btn-1" type="submit" value="修改"/>    
    		<input class="input-btn btn-2" type="button" value="返回" onclick="javascript:window.location.href='login.jsp';"/>
    	</fieldset>
    
    </form>
  </body>
</html>
