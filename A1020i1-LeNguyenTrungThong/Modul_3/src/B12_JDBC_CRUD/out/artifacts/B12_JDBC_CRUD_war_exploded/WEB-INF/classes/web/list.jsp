<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>View Users</title>
  </head>
  <body>
  <div>
  <jsp:include page="search.jsp" />
  </div>

  <h2 style="text-align: center; padding-top: 5%; padding-bottom: 5%">View Users</h2>

<%--    <table>--%>
<%--      <tr>--%>
<%--        <th>Id</th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Email</th>--%>
<%--        <th>Address</th>--%>
<%--        <th>Edit</th>--%>
<%--        <th>Delete</th>--%>
<%--      </tr>--%>

<%--      <c:forEach var="user" items="${showUser}">--%>
<%--        <tr>--%>
<%--          <td><c:out value="${user.id}"></c:out></td>--%>
<%--          <td><c:out value="${user.name}"></c:out></td>--%>
<%--          <td><c:out value="${user.email}"></c:out></td>--%>
<%--          <td><c:out value="${user.country}"></c:out></td>--%>
<%--          <td><a href="/?action=edit&id=${user.id}">Edit</a></td>--%>
<%--          <td><a href="/?action=delete&id=${user.id}">Delete</a></td>--%>
<%--        </tr>--%>
<%--      </c:forEach>--%>
<%--    </table>--%>

  <div class="container">
  <table class="table">
    <thead class="table-dark">
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Email</th>
      <th>Address</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${showUser}">
      <tr>
        <td><c:out value="${user.id}"></c:out></td>
        <td><c:out value="${user.name}"></c:out></td>
        <td><c:out value="${user.email}"></c:out></td>
        <td><c:out value="${user.country}"></c:out></td>
        <td><a href="/?action=edit&id=${user.id}">Edit</a></td>
        <td><a href="/?action=delete&id=${user.id}">Delete</a></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
<%--  <h4 style="float: right"><a href="/?action=create">Create user</a></h4>--%>
    <button type="button" class="btn btn-outline-dark" style="float: right; text-decoration: none; color: red">
      <a href="/?action=create" style="text-decoration: none">Create user</a>
    </button>
  </div>
  </body>
</html>
