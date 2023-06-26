<%--
  Created by IntelliJ IDEA.
  User: HaiChuong
  Date: 6/19/2023
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="chunhat" method="POST">
    <h1>Chiều dài</h1>
    <input type="text" name="chieudai">
    <h1>Chiều rộng</h1>
    <input type="text" name="chieurong">
    <hr>
    <button formaction="chuvi">tính chu vi</button>
    <button formaction="dientich">tính diện tích</button>
</form>
<h1>${result}</h1>
</body>
</html>
