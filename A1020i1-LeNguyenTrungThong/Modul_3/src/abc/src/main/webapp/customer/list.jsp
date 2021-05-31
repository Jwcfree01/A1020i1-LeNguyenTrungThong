<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
<div>
    <jsp:include page="../template/header.jsp"/>
</div>

<h2 style="text-align: center; padding-top: 2%; padding-bottom: 1%">View Users</h2>

<div class="container-fluid">
    <table class="table">
        <thead class="table-dark">
        <tr>
            <th>Id</th>
            <th>Type</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>Id card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${showCustomer}">
            <tr>
                <td><c:out value="${customer.cusId}"></c:out></td>
                <td><c:out value="${customer.cusTypeId}"></c:out></td>
                <td><c:out value="${customer.cusName}"></c:out></td>
                <td><c:out value="${customer.cusBirthDay}"></c:out></td>
                <td><c:out value="${customer.cusGender}"></c:out></td>
                <td><c:out value="${customer.cusIdCard}"></c:out></td>
                <td><c:out value="${customer.cusPhone}"></c:out></td>
                <td><c:out value="${customer.cusEmail}"></c:out></td>
                <td><c:out value="${customer.cusAddress}"></c:out></td>
                <td><a href="/?action=edit&id=${customer.cusId}">Edit</a></td>
                <td><a href="/?action=delete&id=${customer.cusId}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <button type="button" class="btn btn-outline-dark" style="float: right; text-decoration: none; color: red">
        <a href="/?action=create" style="text-decoration: none">Create user</a>
    </button>
</div>
</body>
</html>
