<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>shiro 登录测试</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<form action="${pageContext.request.contextPath}/doLogin" method="post">
	<br/>
		账号：<input type="text" name="userName" value=""/>
	<br/>
	<br/>
		密码：<input type="text" name="passWord" value=""/>
	<br/>
	<br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>