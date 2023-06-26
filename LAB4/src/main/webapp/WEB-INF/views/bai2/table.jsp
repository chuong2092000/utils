<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HaiChuong
  Date: 6/25/2023
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h3>User List</h3>

<table border="1" >
    <thead>
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Remember?</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="it" items="${item}">
    <tr>
        <td>${it.userName}</td>
        <td>${it.password}</td>
        <td>${it.remember}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>