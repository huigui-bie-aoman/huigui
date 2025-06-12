<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <%
        String submitText = "添加";
        if (!request.getParameter("action").equals("add"))
            submitText = "修改";
    %>
    <h1>学员信息管理</h1>
    <hr>
    <a href="/myweb/selAll">浏览学员</a> |
    <a href="/myweb/edit.jsp">添加学员</a>
    <hr>
    <h3><%= submitText %>学员</h3>
    <hr width="450px">
    <form action="/myweb/<%= request.getParameter("action") %>" method="post">
        <input type="hidden" name="id" value="${stu.id}">>
        <table border="0px" width="350px" height="400px">

            <tr>
                <td align="right">姓名：</td>
                <td><input type="text" name="name" placeholder="请输入学生姓名" value="${stu.name}"></td>
            </tr>
            <tr>
                <td align="right">性别：</td>
                <td>
                    男 <input type="radio" name="sex" value="1"> |
                    女 <input type="radio" name="sex" value="0"> |
                    未知 <input type="radio" name="sex" value="2" checked>
                </td>
            </tr>
            <tr>
                <td align="right">年龄：</td>
                <td><input type="number" name="age" placeholder="请输入学生年龄" value="${stu.age}"></td>
            </tr>
            <tr>
                <td align="right">成绩：</td>
                <td><input type="number" name="score" placeholder="请输入学生成绩" value="${stu.score}"></td>
            </tr>
            <tr>
                <td align="right">电话：</td>
                <td><input type="text" name="tel" placeholder="请输入学生电话" value="${stu.tel}"></td>
            </tr>
            <tr>
                <td align="right">班级：</td>
                <td><input type="text" name="classid" placeholder="请输入学生班级" value="${stu.classid}"></td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <input type="submit" value="<%= submitText %>"> |
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>