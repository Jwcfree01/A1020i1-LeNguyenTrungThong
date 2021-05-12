<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>List Product</h2>
    <a href="/?action=create">Create product</a>
    <table border="1px solid">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>View</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="product" items="${showPro}">
            <tr>
                <td><c:out value="${product.id}"></c:out></td>
                <td><c:out value="${product.name}"></c:out></td>
                <td><c:out value="${product.price}"></c:out></td>
                <td><a href="/?action=view&id=${product.id}">View</a></td>
                <td><a href="/?action=edit&id=${product.id}">Edit</a></td>
                <td><a href="/?action=delete&id=${product.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
