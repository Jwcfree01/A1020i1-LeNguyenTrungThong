<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>View Users</title>
  </head>
  <body>
  <h2>View Users</h2>
  <h4><a href="/?action=create">Create user</a></h4>
    <table>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
      <c:forEach var="user" items="showUser">
        <tr>
          <td><c:out value="${user.id}"></c:out></td>
          <td><c:out value="${user.name}"></c:out></td>
          <td><c:out value="${user.email}"></c:out></td>
          <td><c:out value="${user.country}"></c:out></td>
          <td><a href="/?action=edit&id=${user.id}">Edit</a></td>
          <td><a href="/?action=delete&id=${user.id}">Delete</a></td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
