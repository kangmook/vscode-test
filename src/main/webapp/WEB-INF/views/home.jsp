<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Sungmook API 입니다.</title>
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
    <!-- Navigation-->
    <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
        <div class="container">
            <a class="navbar-brand" href="#page-top">Sungmook API</a>
            <button class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                Menu
                <i class="fas fa-bars"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ms-auto">
                    <!-- <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="#portfolio">Portfolio</a></li> -->
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="#about">About</a></li>
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="#board">Board</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- Masthead-->
    <header class="masthead bg-primary text-white text-center">
        <div class="container d-flex align-items-center flex-column">
            <!-- Masthead Avatar Image-->
            <img class="masthead-avatar mb-5" src="static/assets/img/avataaars.svg" alt="..." />
            <!-- Masthead Heading-->
            <h1 class="masthead-heading text-uppercase mb-0">Start SUNGMOOK API</h1>
            <!-- Icon Divider-->
            <div class="divider-custom divider-light">
                <div class="divider-custom-line"></div>
                <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                <div class="divider-custom-line"></div>
            </div>
            <!-- Masthead Subheading-->
            <p class="masthead-subheading font-weight-light mb-0">Programmer - Middleware Engineer - DevOps</p>
        </div>
    </header>

    <!-- About Section-->
    <section class="page-section" id="about">
        <div class="container">
            <!-- About Section Heading-->
            <h2 class="page-section-heading text-center text-uppercase text-black">About</h2>
            <!-- Icon Divider-->
            <div class="divider-custom divider-light">
                <div class="divider-custom-line"></div>
                <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                <div class="divider-custom-line"></div>
            </div>
            <!-- About Section Content-->
            <div class="row">
                <div class="col-lg-4 ms-auto">
                        <p class="lead">
                            I have been working as a developer or middleware engineer since 2009 until now. Currently, at my company, I am responsible for development and middleware operation management, and I am also preparing to introduce Kubernetes as the deployment coordinator. Within the company, I am referred to as a DevOps professional.
                        </p>
                </div>
                <div class="col-lg-4 me-auto">
                        <p class="lead">
                            This API is a test API created for personal study purposes. I am currently developing it using the Spring Boot framework and integrating it with VS Code. It is a website I made for personal testing purposes.
                        </p>
                </div>
            </div>
            <!-- About Section Button-->
            <div class="text-center mt-4">
                <a class="btn btn-xl btn-outline-dark" href="/swagger-ui/index.html#/">
                    <i class="fas fa-check me-2"></i>
                    Sungmook API
                </a>
            </div>
        </div>
    </section>

    <!-- Board -->
    <section class="page-section bg-primary text-white mb-0" id="board">
        <div class="container">
            <!-- Contact Section Heading-->
            <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Test Board</h2>
            <!-- Icon Divider-->
            <div class="divider-custom">
                <div class="divider-custom-line"></div>
                <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                <div class="divider-custom-line"></div>
            </div>

            <div class="row justify-content-center">
                <div class="col-lg-8 col-xl-7">
                    
                    <button type="button" class="btn btn-danger" id="refreshButton">Refresh Data</button>
                    <br />
                    <table class="table" id="dataTable">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>age</th>
                                <th>tel</th>
                            </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                    
                    <div id="paginationContainer" align="center">
                        <button type="button" class="btn btn-outline-success" id="prevButton">Previous</button>
                        <span id="currentPage"></span>
                        <button type="button" class="btn btn-outline-success" id="nextButton">Next</button>
                    </div>

                </div>
            </div>
        </div>
    </section>

    <!-- Copyright Section-->
    <div class="copyright py-4 text-center text-white">
        <div class="container"><small>Copyright &copy; kang sungmook 2023</small></div>
    </div>

    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="static/js/scripts.js"></script>
    <script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        
    <script>
        // 버튼 클릭 이벤트
        $("#refreshButton").on("click", function() {
            if ( confirm('새로고침 하시겠습니까?')) {
                fetchData();
            }
        });

        var jsonData = []; // 전체 데이터
        var tableBody = $("#dataTable tbody");
        var currentPage = 1;
        var pageSize = 6;

        function fetchData() {
            var startIndex = (currentPage - 1) * pageSize;
            var endIndex = startIndex + pageSize;

            $.ajax({
                url: "/api/getAuthListApi.json",
                method: "GET",
                dataType: "json",
                success: function(data) {
                    jsonData = data;
                    updateTable();
                    updatePagination();
                },
                error: function() {
                    console.error("Error occurred while fetching JSON data.");
                }
            });
        }

        function updateTable() {
            var startIndex = (currentPage - 1) * pageSize;
            var endIndex = startIndex + pageSize;
            var tableBody = $("#dataTable tbody");

            tableBody.empty(); // 기존 테이블 내용 초기화

            for (var i = startIndex; i < endIndex && i < jsonData.length; i++) {
                var row = jsonData[i];
                var rowData = 
                "<tr>" +
                    "<td>" + row.empId + "</td>" +
                    "<td>" + row.empName + "</td>" +
                    "<td>" + row.empAge + " 세</td>" +
                    "<td>" + row.empTel + "</td>" +
                "</tr>";

                tableBody.append(rowData);
            }
        }

        function updatePagination() {
            var totalPages = Math.ceil(jsonData.length / pageSize);
            $("#currentPage").text(currentPage + " / " + totalPages); // 현재 페이지 / 전체 페이지 수 표시

            var pageNumbers = "";
            for (var i = 1; i <= totalPages; i++) {
                pageNumbers += '<li class="page-item"><a class="page-link" href="#">' + i + '</a></li>';
            }

            $("#pageNumbers").html(pageNumbers);

            if (currentPage === 1) {
                $("#prevButton").prop("disabled", true);
            } else {
                $("#prevButton").prop("disabled", false);
            }

            if (currentPage === totalPages) {
                $("#nextButton").prop("disabled", true);
            } else {
                $("#nextButton").prop("disabled", false);
            }
        }

        // 페이지 번호 클릭 이벤트 처리
        $("#pageNumbers").on("click", ".page-link", function() {
            var pageNumber = parseInt($(this).text());
            currentPage = pageNumber;
            updatePagination();
            // 페이지 번호에 따른 데이터 로딩 등의 동작 수행
        });

        
        // 초기 데이터 로드
        fetchData();

        // 주기적으로 데이터 갱신 (5초마다)
        setInterval(function() {
            fetchData();
        }, 5000); // 5000ms = 5 seconds

        // 이전 페이지로 이동
        $("#prevButton").on("click", function() {
            if (currentPage > 1) {
                currentPage--;
                updateTable();
                updatePagination();
            }
        });

        // 다음 페이지로 이동
        $("#nextButton").on("click", function() {
            var totalPages = Math.ceil(jsonData.length / pageSize);
            if (currentPage < totalPages) {
                currentPage++;
                updateTable();
                updatePagination();
            }
        });

    </script>

</body>

</html>
