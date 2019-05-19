<%--
  Created by IntelliJ IDEA.
  User: 47871
  Date: 2019/5/19
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <title>修改</title>
</head>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script type="text/javascript">
    layui.use('form', function () {
        var form = layui.form;
        form.render();
    });
</script>
<body>

<form class="layui-form" action="${pageContext.request.contextPath}/update" method="post" style="width: 70%">

    <input type="text" name="id" required lay-verify="required" value="${student.id}" disabled="disabled" style="display: none;">

    <div class="layui-form-item">
        <label class="layui-form-label">姓名:</label>
        <div class="layui-input-block">
            <input type="text" name="name" required lay-verify="required" value="${student.name}" autocomplete="off"
                   class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">年龄</label>
        <div class="layui-input-block">
            <input type="text" name="age" required lay-verify="required" value="${student.age} "
                   autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">
            <input type="radio" name="gender" value="male" title="男" checked>
            <input type="radio" name="gender" value="female" title="女">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">编号</label>
        <div class="layui-input-block">
            <input type="number" name="number" class="layui-input" value="${student.number}">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">地址</label>
        <div class="layui-input-block">
            <input type="text" name="address" class="layui-input" value="${student.address}">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">状态</label>
        <div class="layui-input-block">
            <input type="number" name="status" class="layui-input" value="${student.status}">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

</body>
</html>
