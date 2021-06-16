<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/formInput">
    <input type="text" placeholder="USD" name="usd">
    <input type="text" placeholder="result" value="${output}">
    <input type="submit" value="Submit">
</form>
</body>
</html>
