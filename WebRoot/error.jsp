<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <base href="<%=basePath%>">
    
    <title>出错啦！</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">

</style>
  </head>
  
  <body>
    <script language="javascript" type="text/javascript">
            setTimeout(function () { this.location.href = "login.jsp" }, 5000);
        </script>
<span class="STYLE12">&nbsp;:(</span>
<p class="STYLE7"> 　　您输入的网址我们没有找到。<br />
　　5秒后为您跳转到首页，您可以在首页试着找找您所需要的信息。</p>
<p class="STYLE7">　　<span class="STYLE9">如果您想了解更多信息，则可以稍后在线搜索此错误: 404 页面未找到</span></p>
  </body>
</html>
