<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<center>
  <h1>学员信息管理</h1>
  <hr>
  <a href="/myweb/selAll">浏览学员</a> |
  <a href="/myweb/edit.jsp?action=add">添加学员</a>
  <hr>
  <c:if test="${stuList != null}">
    <h3>浏览学员</h3>
    <hr width="80%">
    <table border="1px" width="80%">
      <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>成绩</td>
        <td>电话</td>
        <td>班级</td>
        <td>操作</td>
      </tr>
      <c:forEach items="${stuList}" var="stu">
        <tr>
          <td>${stu.id}</td>
          <td>${stu.name}</td>
          <td>${stu.sex}</td>
          <td>${stu.age}</td>
          <td>${stu.score}</td>
          <td>${stu.tel}</td>
          <td>${stu.classid}</td>
          <td>
            <a href="/myweb/edit?action=update&id=${stu.id}">编辑</a> |
            <a href="/myweb/delete?id=${stu.id}">删除</a>
          </td>
        </tr>
      </c:forEach>
    </table>
  </c:if>
</center>
</body>
</html>