<%--
  Created by IntelliJ IDEA.
  User: HaiChuong
  Date: 6/19/2023
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="successNC" method="post">
  <h1>Đăng Ký</h1>
  <br>
  Tên đăng nhập <input type="text" name="tendangnhap">
  <br>
  Password <input type="password" name="matkhau">
  <br>
  Giới tính
  <input name="gioitinh" type="radio" value="Nam">Nam
  <input name="gioitinh" type="radio" value="Nữ">Nữ
  <br>
  <input name="marry" type="checkbox">Đã có gia đình?
  <br>
  Quốc tịch
  <select name="quoctich">
    <option value="Việt Nam">Việt nam</option>
    <option value="Mỹ">Mỹ</option>
  </select>
  <br>
  Sở thích
  <input name="hobbies" type="checkbox" value="Đọc sách">Đọc sách
  <input name="hobbies" type="checkbox" value="Du lịch">Du lịch
  <input name="hobbies" type="checkbox" value="Âm nhạc">Âm nhạc
  <input name="hobbies" type="checkbox" value="Khác">Khác
  <br>
  Ghi chú
  <textarea name="ghichu" rows="3" cols="30"></textarea>
  <hr>
  <button type="submit">Đăng ký</button>
</form>
</body>
</html>
