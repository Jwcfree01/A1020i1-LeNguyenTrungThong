<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product details</h1>
<h2>Product Id <p><c:out value="${product.id}"></c:out></p></h2>
<h2>Product Name <p><c:out value="${product.name}"></c:out></p></h2>
<h2>Product Price <p><c:out value="${product.price}"></c:out></p></h2>
<h5><a href="/?action=back">Back to list</a></h5>
</body>
</html>
