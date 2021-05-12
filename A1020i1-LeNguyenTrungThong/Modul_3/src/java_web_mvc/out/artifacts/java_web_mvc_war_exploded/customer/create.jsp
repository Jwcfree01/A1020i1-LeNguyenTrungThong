<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2><c:out value="${listCusabc}"></c:out></h2>

<form action="/customer" method="post">
    <h2>Register Account</h2>
    <div>
        name:
        <input type="text" name="nameCus">
    </div>
    <div>
        email:
        <input type="text" name="emailCus">
    </div>
    <div>
        address:
        <input type="text" name="addressCus">
    </div>
    <div>
        <input type="submit" value="Create customer">
    </div>
</form>
</body>
</html>
