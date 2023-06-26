<%--
  Created by IntelliJ IDEA.
  User: HaiChuong
  Date: 6/25/2023
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
    <div class="container">
        <nav class="navbar bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand">ONLINE SHOPPING MALL</a>
                <form class="d-flex" role="search" style="margin-top: 10px">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <%@include file="menu.jsp"%>
        <div style="margin-top: 10px">
            <div class="row">
                <div class="col-10">
                    <jsp:include page="item.jsp">
                        <jsp:param name="name" value="Tên Sản Phẩm"/>
                        <jsp:param name="image" value="Hình Sản Phẩm"/>
                    </jsp:include>
                </div>
                <div class="col-2">
                    <%@include file="login.jsp"%>
                    <%@include file="category.jsp"%>
                </div>
            </div>
        </div>
        <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
            <p class="col-md-4 mb-0 text-body-secondary"></p>

            <a href="/" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
                FPT PolyTechnic @2023. All rights reserved.
            </a>

            <ul class="nav col-md-4 justify-content-end">

            </ul>
        </footer>
    </div>
</body>
</html>
