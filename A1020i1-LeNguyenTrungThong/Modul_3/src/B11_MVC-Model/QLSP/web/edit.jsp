<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Edit product</h2>
<form method="post" action="/?action=edit">
    <table class="table">
        <tr>
            <th>Product id:</th>
            <td><input type="text" name="id" value="${product.id}"/></td>
        </tr>
        <tr>
            <th>Product Name:</th>
            <td><input type="text" name="name" value="${product.name}"/></td>
        </tr>
        <tr>
            <th>Price:</th>
            <td><input type="text" name="price" value="${product.price}"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form>
</body>
</html>

