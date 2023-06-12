<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Test home</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="static/assets/favicon.ico" />
    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="static/css/styles.css" rel="stylesheet" />
</head>

<body id="page-top">
    <table class="table" id="dataTable">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>age</th>
                <th>tel</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${authList}" var="dataList" varStatus="status">
			    <tr>
			        <td>${dataList.empId }</td>
			        <td>${dataList.empName}</a></td>
			        <td>${dataList.empAge }</td>
                    <td>${dataList.empTel }</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>


<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="static/js/scripts.js"></script>
<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    
</body>
</html>
