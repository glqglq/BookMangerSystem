<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="struts" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户登录</title>
    <link rel="stylesheet" href="css/style.css"/>
  </head>
  
  <body>
  	<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
		<img src="imgs/background.jpg" height="100%" width="100%"/>    
	</div> 
   	<form class="form-div" action="login.action" method="post">
   		<fieldset>
	   		<legend>用户登录</legend>
	   		<span>用户名</span><input name="NAME" type="text"/><br/>
	    	<span>密&nbsp;码</span><input name="PASSWD" type="password"/><br/>
	    	<input class="input-btn btn-1" type="submit" value="登陆"/>	  			
	    	<input class="input-btn btn-2" type="button" value="修改密码" onclick="javascript:window.location.href='ModifyPassword.jsp';"/>
  			<input class="btn-3" type="button" value="注册" onclick="javascript:window.location.href='regist.jsp';"/>
   		</fieldset>
    </form>
  </body>
</html>
