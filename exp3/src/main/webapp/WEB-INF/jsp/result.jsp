<%--
  Created by IntelliJ IDEA.
  User: 47871
  Date: 2019/5/19
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <title>查询结果</title>
</head>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<body>
<fieldset class="layui-elem-field">
    <legend>查询结果</legend>
    <div class="layui-field-box">

        <div class="layui-col-md12">
            <table class="layui-table layui-input-block" style="width: 80%; margin-left: auto; margin-right: auto">
                <colgroup>
                    <col width="70">
                    <col width="150">
                    <col width="70">
                    <col width="70">
                    <col width="70">
                    <col width="200">
                    <col width="70">
                    <col width="200">
                </colgroup>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>姓名</th>
                    <th>年龄</th>
                    <th>性别</th>
                    <th>编号</th>
                    <th>地址</th>
                    <th>状态</th>
                </tr>
                </thead>
                <tbody>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.gender}</td>
                <td>${student.number}</td>
                <td>${student.address}</td>
                <td>${student.status}</td>
                </tbody>

            </table>
        </div>
    </div>
</fieldset>

</body>
</html>
