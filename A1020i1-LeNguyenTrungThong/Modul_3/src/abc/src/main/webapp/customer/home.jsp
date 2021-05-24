<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<%--    <link type="text/css" rel="stylesheet" href="../style/style.css"/>--%>
    <title>Home</title>
</head>
<body>
<div>
    <jsp:include page="header.jsp"/>
</div>

<%--body--%>
<div class="container-fluid">
    <div class="container-fluid">
        <!--menu_left-->
        <div class="col-md-3">
            <p>item one</p>
            <p>item two</p>
            <p>item three</p>
        </div>
        <!--body-->
        <div class="col-md-9">
<%--            <table class="table">--%>
<%--                <thead class="table-dark">--%>
<%--                <tr>--%>
<%--                    <th>Id</th>--%>
<%--                    <th>Name</th>--%>
<%--                    <th>Email</th>--%>
<%--                    <th>Address</th>--%>
<%--                    <th>Edit</th>--%>
<%--                    <th>Delete</th>--%>
<%--                </tr>--%>
<%--                </thead>--%>
<%--                <tbody>--%>
<%--                <c:forEach var="user" items="${showUser}">--%>
<%--                    <tr>--%>
<%--                        <td><c:out value="${user.id}"></c:out></td>--%>
<%--                        <td><c:out value="${user.name}"></c:out></td>--%>
<%--                        <td><c:out value="${user.email}"></c:out></td>--%>
<%--                        <td><c:out value="${user.country}"></c:out></td>--%>
<%--                        <td><a href="/?action=edit&id=${user.id}">Edit</a></td>--%>
<%--                        <td><a href="/?action=delete&id=${user.id}">Delete</a></td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
<%--                </tbody>--%>
<%--            </table>--%>
        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"
        integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT"
        crossorigin="anonymous"></script>
</body>
</html>
