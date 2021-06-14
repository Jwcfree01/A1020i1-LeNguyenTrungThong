<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  <title>Mat Bang</title>
</head>
<body>
<h2 style="text-align: center; padding-top: 2%; padding-bottom: 1%">View Mat Bang</h2>
<div class="container-fluid">
  <div class="col-md-3"></div>
  <div class="col-md-6">
    <div class="row">
      <form class="form-inline my-2 my-lg-0">
        <input type="hidden" name="action" value="search">
        <input class="form-control mr-sm-2" name="name" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
      </form>
    </div>
  </div>
  <div class="col-md-3"></div>
</div>

<div class="container-fluid">
  <table class="table" id="tableCustomer">
    <thead class="table-dark">
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Status</th>
      <th>Area</th>
      <th>Floor</th>
      <th>Type</th>
      <th>Price</th>
      <th>Start</th>
      <th>End</th>
      <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="matbang" items="${showMatBang}">
      <tr>
        <td><c:out value="${matbang.id}"></c:out></td>
        <td><c:out value="${matbang.name}"></c:out></td>
        <td><c:out value="${matbang.status}"></c:out></td>
        <td><c:out value="${matbang.area}"></c:out></td>
        <td><c:out value="${matbang.floor}"></c:out></td>
        <td><c:out value="${matbang.typeMatBang}"></c:out></td>
        <td><c:out value="${matbang.price}"></c:out></td>
        <td><c:out value="${matbang.startDate}"></c:out></td>
        <td><c:out value="${matbang.endDate}"></c:out></td>
        <td>
          <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                  data-bs-target="#exampleModal${matbang.id}">
            Delete
          </button>

          <div class="modal fade" id="exampleModal${matbang.id}" tabindex="-1"
               aria-labelledby="exampleModalLabel"
               aria-hidden="true">
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title" id="exampleModalLabel">Confirmation</h5>
                  <button type="button" class="btn-close" data-bs-dismiss="modal"
                          aria-label="Close"></button>
                </div>
                <div class="modal-body">
                  Delete customer ${matbang.name}?
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                  </button>
                  <button type="submit" class="btn btn-danger"><a style="color:white;"
                                                                  href="/?action=delete&id=${matbang.id}">
                    Delete</a></button>
                </div>
              </div>
            </div>
          </div>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <button type="button" class="btn btn-outline-dark" style="float: right; text-decoration: none; color: red">
    <a href="/?action=create" style="text-decoration: none">Create user</a>
  </button>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"
        integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT"
        crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap4.min.js"></script>

<script>
  $(document).ready(function () {
    $('#tableCustomer').DataTable(
            {
              "dom": 'lrtip',
              "lengthChange": false,
              "pageLength": 3
            }
    );
  });
</script>
</body>
</html>
