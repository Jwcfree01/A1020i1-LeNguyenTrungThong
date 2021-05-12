<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: blue"><c:out value="${err}"></c:out></h1>
<h2>List customer</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>address</th>
    </tr>
    <c:forEach items="${findCus}" var="customer">
        <tr>
            <td><c:out value="${customer.id}"></c:out></td>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.email}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
            <td><a href="customer?action=edit">Edit customer</a></td>
            <td><a href="customer?action=delete">Delete customer</a></td>
        </tr>
    </c:forEach>
</table>
<a href="customer?action=create">Create customer</a>
</body>
</html>
