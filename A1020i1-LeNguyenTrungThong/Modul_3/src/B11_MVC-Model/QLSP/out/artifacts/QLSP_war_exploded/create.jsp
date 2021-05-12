<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Create product</h2>
<form action="/?action=create" method="post">
    <p>Id: <input type="text" placeholder="id" name="id"></p>
    <p>Name: <input type="text" placeholder="name" name="name"></p>
    <p>Price: <input type="text" placeholder="price" name="price"></p>
    <input type="submit" value="create">
</form>
</body>
</html>
