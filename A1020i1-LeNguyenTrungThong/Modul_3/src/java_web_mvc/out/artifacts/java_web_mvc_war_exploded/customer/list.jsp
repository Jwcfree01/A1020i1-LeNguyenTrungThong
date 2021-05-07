<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/customer?actionUser=create">Create customer</a>

<h2>List customer</h2>
<table border="1px">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>address</th>
    </tr>
    <c:forEach var="customer" items="${listCus}" varStatus="loop">
        <tr>
            <td><c:out value="${loop.index +1}"></c:out></td>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.email}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
