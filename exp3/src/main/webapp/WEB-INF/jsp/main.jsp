<%@ page import="com.zhengzuoyu.controller.StudentController" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.zhengzuoyu.po.Student" %><%--

  Created by IntelliJ IDEA.
  User: 47871
  Date: 2019/5/18
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <title>主页</title>
</head>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<body>
<script type="text/javascript">
    layui.use('form', function(){
        var form = layui.form;
        form.render();
    });

    // function getData() {
    //
    //     $.ajax({
    //         async : true,
    //         type : "post",
    //         url : "/all",//请求的 URL地址
    //         dataType : "json",//返回的数据类型
    //         success: function (data) {
    //             console.log(data);  //在控制台打印服务器端返回的数据
    //             for(var i=0;i<data.length;i++){
    //                 console.log(data[i].deptId+" "+data[i].deptName);
    //             }
    //             $("select[name='depertmentId']").empty();
    //             $("select[name='depertmentId']").append('<option value="">——请选择——</option>');
    //             for(var i=0;i<data.length;i++){
    //                 var html ='<option value="'+data[i].deptId+'">';
    //                 html +=data[i].deptName + '</option>';
    //                 $("select[name='departmentId']").append(html);  //将数据显示在html页面
    //             }
    //         },
    //         error:function (data) {
    //             alert(data.result);
    //         }
    // },
    // window.onload = function(){
    //     //getData()
    // })
</script>

<br><br><br>

<form class="layui-form layui-main" action="${pageContext.request.contextPath}/add" method="post" style="width: 50%">

    <div class="layui-form-item">
        <label class="layui-form-label">姓名:</label>
        <div class="layui-input-block">
            <input type="text" name="name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">年龄</label>
        <div class="layui-input-block">
            <input type="number" name="age" required lay-verify="required" placeholder="请输入年龄 " autocomplete="off" class="layui-input">
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
            <input type="number" name="number" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">地址</label>
        <div class="layui-input-block">
            <input type="text" name="address" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">状态</label>
        <div class="layui-input-block">
            <input type="number" name="status" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>


<table class="layui-table layui-main" style="width: 90%">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
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
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${list}" varStatus="s">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.gender}</td>
            <td>${student.number}</td>
            <td>${student.address}</td>
            <td>${student.status}</td>
            <td><a href="http://www.layui.com" class="layui-btn layui-btn-normal">修改</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
