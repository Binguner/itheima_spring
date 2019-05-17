<%--
  Created by IntelliJ IDEA.
  User: 47871
  Date: 2019/5/16
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单查询</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/findOrdersWithUser" method="post">
        订单编号：<input type="text" name="ordersId"><br>
        所属用户：<input type="text" name="user.username"><br>
        所属用户密码：<input type="password" name="user.password"><br>
        <input type="submit" value="查询">
    </form>

</body>
</html>
