<%--
  Created by IntelliJ IDEA.
  User: HaiChuong
  Date: 6/26/2023
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<div class="card" style="width: 18rem;">
    <img src="${item.getHinhanh()}" class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title">${item.getTensanpham()}</h5>
        <p class="card-text">Giá gốc: ${item.getGiagoc()}</p>
        <p class="card-text">Giá mới: ${item.getGiamoi()}  </p>
        <c:choose>
            <c:when test="${item.getGiamoi()<10}">Giá Thấp</c:when>
            <c:when test="${item.getGiamoi()>100}">Giá Cao</c:when>
            <c:otherwise>Bình Thường</c:otherwise>
        </c:choose>
        <hr>
        <p class="card-text">Ngày :<fmt:formatDate value="${item.getNgay()}" pattern="dd-MM-yyyy"/></p>

    </div>
</div>
</body>
</html>
