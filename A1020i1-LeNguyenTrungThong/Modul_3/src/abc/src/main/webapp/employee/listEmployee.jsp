<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
<div>
    <jsp:include page="../template/header.jsp"/>
</div>

<h2 style="text-align: center; padding-top: 2%; padding-bottom: 1%">List Employee</h2>

<div class="container-fluid">
    <table class="table">
        <thead class="table-dark">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Id Card</th>
            <th>Salary</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Position</th>
            <th>Education Degree</th>
            <th>Division</th>
            <th>User Name</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="employee" items="${showEmployee}">
            <tr>
                <td><c:out value="${employee.emId}"></c:out></td>
                <td><c:out value="${employee.emName}"></c:out></td>
                <td><c:out value="${employee.emBirthDay}"></c:out></td>
                <td><c:out value="${employee.emIdCard}"></c:out></td>
                <td><c:out value="${employee.emSalary}"></c:out></td>
                <td><c:out value="${employee.emPhone}"></c:out></td>
                <td><c:out value="${employee.emEmail}"></c:out></td>
                <td><c:out value="${employee.emAddress}"></c:out></td>
                <td><c:out value="${employee.position.namePosition}"></c:out></td>
                <td><c:out value="${employee.division.nameDivision}"></c:out></td>
                <td><c:out value="${employee.education_degree.name_Education}"></c:out></td>
                <td><c:out value="${employee.userName}"></c:out></td>
                <td><a href="/?action=editEmployee&id=${employee.emId}">Edit</a></td>
                <td><a href="/?action=deleteEmployee&id=${employee.emId}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <button type="button" class="btn btn-outline-dark" style="float: right; text-decoration: none; color: red">
        <a href="/?action=createEmployee" style="text-decoration: none">Create employee</a>
    </button>
</div>
</body>
</html>
