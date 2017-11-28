<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>登录成功界面</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	${successMsg } Welcome!  <shiro:principal/>  
    <br><br>  
      
    <shiro:hasAnyRoles name="user">  
        <a href="/jsp/user.jsp">User Page</a>  
    </shiro:hasAnyRoles>  
      
    <br><br>  
      
    <shiro:hasAnyRoles name="admin">  
        <a href="/jsp/admin.jsp">Admin Page</a>  
    </shiro:hasAnyRoles>  
      
    <br><br>  
    <a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>