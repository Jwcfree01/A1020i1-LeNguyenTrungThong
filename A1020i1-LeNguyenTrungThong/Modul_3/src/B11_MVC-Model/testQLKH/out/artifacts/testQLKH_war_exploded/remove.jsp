<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="color: red"><c:out value="${msg}"></c:out></h2>
<form action="/customer" method="post">
    <div>
        id remove:
        <input type="text" name="removeCus">
    </div>
    <div>
        <input type="submit" value="remove">
    </div>
</form>
</body>
</html>
