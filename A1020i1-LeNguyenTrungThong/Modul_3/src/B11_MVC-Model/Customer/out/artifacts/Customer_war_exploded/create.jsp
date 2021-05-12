<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    <div>
        id:
        <input type="text" placeholder="id" name="idCus">
    </div>
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

    <h2 style="color: red"><c:out value="${err}"></c:out></h2>
    <a href="customer?action=back">Back to list customer</a>
</form>
</body>
</html>
