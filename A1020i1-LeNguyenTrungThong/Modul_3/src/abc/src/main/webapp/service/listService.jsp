<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Service</title>
</head>
<body>
<div>
    <jsp:include page="../template/header.jsp"/>
</div>

<h2 style="text-align: center; padding-top: 2%; padding-bottom: 1%">View Service</h2>

<div class="container-fluid">
    <table class="table">
        <thead class="table-dark">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Area</th>
            <th>Cost</th>
            <th>Max People</th>
            <th>Rent Type Name</th>
            <th>Service Type Name</th>
            <th>Standard Room</th>
            <th>Description</th>
            <th>Pool Area</th>
            <th>Number Of Floor</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="service" items="${showService}">
            <tr>
                <td><c:out value="${service.id}"></c:out></td>
                <td><c:out value="${service.name}"></c:out></td>
                <td><c:out value="${service.area}"></c:out></td>
                <td><c:out value="${service.cost}"></c:out></td>
                <td><c:out value="${service.maxPeople}"></c:out></td>
                <td><c:out value="${service.rentTypeId}"></c:out></td>
                <td><c:out value="${service.serviceTypeId}"></c:out></td>
                <td><c:out value="${service.standardRoom}"></c:out></td>
                <td><c:out value="${service.description}"></c:out></td>
                <td><c:out value="${service.pollArea}"></c:out></td>
                <td><c:out value="${service.numberOfFloor}"></c:out></td>
                <td><a href="/?action=deleteService&id=${service.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <button type="button" class="btn btn-outline-dark" style="float: right; text-decoration: none; color: red">
        <a href="/?action=createService" style="text-decoration: none">Create service</a>
    </button>
</div>
</body>
</html>
