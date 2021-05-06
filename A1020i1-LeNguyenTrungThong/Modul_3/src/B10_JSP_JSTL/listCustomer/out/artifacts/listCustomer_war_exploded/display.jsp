<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <h2>Danh sach khach hang</h2>
    <table border="1">
        <tr>
            <th>name</th>
            <th>date of birth</th>
            <th>address</th>
            <th>img</th>
        </tr>
        <c:forEach var="customer" items="${list1}">
            <tr>
                <td><c:out value="${customer.name}"/></td>
                <td><c:out value="${customer.dateOfBirth}"/></td>
                <td><c:out value="${customer.address}"/></td>
                <td>
                    <img src="${customer.img}" style="max-width: 50px; max-height: 50px">
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
