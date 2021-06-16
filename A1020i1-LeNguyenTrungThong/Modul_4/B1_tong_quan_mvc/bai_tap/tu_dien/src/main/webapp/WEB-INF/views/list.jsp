<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Translate</h2>
<form action="/list">
    <input type="text" placeholder="Input vn" name="input" value="${input}">
    <input type="text" value="${output}">
    <input type="submit" value="Submit">
</form>
</body>
</html>
