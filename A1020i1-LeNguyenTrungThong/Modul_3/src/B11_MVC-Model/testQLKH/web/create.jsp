<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customer" method="post">
    <div>
        name:
        <input type="text" placeholder="name" name="nameCus">
    </div>
    <div>
        email:
        <input type="text" placeholder="email" name="email">
    </div>
    <div>
        address:
        <input type="text" placeholder="address" name="address">
    </div>
    <div>
        <input type="submit" value="create customer">
    </div>

    <h2 style="color: red"><c:out value="${msg}"></c:out></h2>
</form>
</body>
</html>
