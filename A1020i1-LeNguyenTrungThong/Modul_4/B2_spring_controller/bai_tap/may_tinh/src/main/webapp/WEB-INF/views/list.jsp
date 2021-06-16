<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/list" method="post">
    <input type="text" name="number1" placeholder="input number" id="number1">
    <input type="text" name="number2" placeholder="input number" id="number2">
    <button name="phepTinh" value="+" type="submit">+</button>
    <button name="phepTinh" value="-" type="submit">-</button>
    <button name="phepTinh" value="*" type="submit">*</button>
    <button name="phepTinh" value="/" type="submit">/</button>
    <h2>${result}</h2>
</form>
</body>
</html>