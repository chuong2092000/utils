<%--
  Created by IntelliJ IDEA.
  User: HaiChuong
  Date: 6/25/2023
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form>
    <h3>User Edition</h3><br>
    <h4>${mes}</h4><br>
    Username: <input type="text" placeholder="username" value="${form.getUserName()}"><br>
    Password: <input type="password" placeholder="password" value="${form.getPassword()}"><br>
    <input type="checkbox" ${form.getRemember()?'checked':''}> Remember me? <br>
    <button type="submit">Create</button>
</form>
