<%--
  Created by IntelliJ IDEA.
  User: 47871
  Date: 2019/5/16
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/registerUser" method="post">
        用户名：<input type="text" name="username"/><br>
        密码：<input type="password" name="password"/> <br>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
