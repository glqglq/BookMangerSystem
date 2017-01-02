<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"%>
<%@taglib prefix="s" uri="/struts-tags"%>   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>请登录</title>
    <style>
		table{border:1px solid #abcdef; border-collapse:collapse;width:100%; margin-bottom:30px;}
		tr{ height:30px;}
		th{ border:1px solid #abcdef;}
		td{ border:1px solid #abcdef; text-align:center;}
		td a{ margin-right:5px; color:#f00;}
	</style>
  </head>
  
<body>
	<center>
		<h1>图书浏览</h1>
	</center>
	<table class="contable">
		<s:iterator value="Books" status="Book">
		<tr>
			<td height="25" align="center">
			&nbsp;<s:property value="NO"/>
			</td>
			<td align="center">
			&nbsp;<s:property value="NAME"/>
			</td>
			<td align="center">
			&nbsp;<s:property value="DISC"/> 
			</td>
			<td align="center">
			&nbsp;<s:property value="NUM"/> 
			</td>
			<td align="center">
			&nbsp;<img width="50px" height="50px" src="${PIC}"/>
			</td>
			<td align="center">
			&nbsp;<s:property value="PRICE"/>
			</td>
			<td align="center">
			&nbsp;<a href="Delete.action?NO=<s:property value='NO'/>" onclick="return confirm('确认删除?')">删除</a>
			</td>
			<td align="center">
			&nbsp;<a href="UpdateBook.jsp?NO=<s:property value='NO'/>">修改</a>
			</td>
		</tr><br/>
		</s:iterator>
	</table>
	<input  class="btn-3" class="input-btn btn-2" type="button" value="增添书籍" onclick="javascript:window.location.href='AddBook.jsp';"/>
</body>