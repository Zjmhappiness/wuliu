<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<title>Li-------Gui</title>
  </head>
  
  <body>
    <table>
		    <form action="Users_find.action" method="post">
		    <tr>
		        <td>用户名：</td>
		        <td><input type="text" name="users.user_name" /></td>
		    </tr>
		    <tr>
		        <td>密码：</td>
		        <td><input type="password" name="users.user_psd" /></td>
		    </tr>
		    <tr>
		        <td>操作员：</td>
		        <td>
			        <select name="user_qx">
			            <option value="0" selected>普通用户</option>
			            <option value="1">管理员</option>
			        </select>
		        </td>
		    </tr>
		         <!-- <input type="button" value="登录"/><input type="button" value="注册"/> -->
		         <input type="submit" value="登录"/>
		    </form>
    </table>
  </body>
</html>
