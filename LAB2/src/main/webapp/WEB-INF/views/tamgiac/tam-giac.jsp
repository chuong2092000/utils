<%--
  Created by IntelliJ IDEA.
  User: HaiChuong
  Date: 6/19/2023
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="tamgiac" method="post">
    <h1>Cạnh a</h1>
    <input type="text" name="canha">
    <h1>Cạnh b</h1>
    <input type="text" name="canhb">
    <h1>Cạnh c</h1>
    <input type="text" name="canhc">

    <hr>
    <button formaction="chuvi">Tính chu vi</button>
    <button formaction="dientich">Tính diện tích</button>
</form>
<h1>${result}</h1>
</body>
</html>
