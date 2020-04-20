<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page import="org.example.javaee.class03.jdbc.shjdbc" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %>
<%@ page import="org.example.javaee.class03.model.homework" %><%--
  Created by IntelliJ IDEA.
  User: ykx
  Date: 2020/3/11
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作业列表</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/submit">
<table align="center" width="960" border="1">
    <tr>
        <td>作业编号</td>
        <td>作业标题</td>
        <td>作业内容</td>
        <td>提交作业</td>
    </tr>
    <tr>
        <c:forEach var="list" items="${list}">
            <td>
                <span>${list.id}</span>
            </td>
            <td>
                <span>${list.getTitle()}</span>
            </td>
            <td>
                <span>${lsit.getContent()}</span>
            </td>
            <td><input type="button"  value="提交作业" onclick="window.location.href='submit?id=${list.getId()}'"  > </td>
        </c:forEach>
    </tr>
</table>
</form>
</body>

</html>
