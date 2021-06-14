<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Customer</title>
</head>
<body>
<%--<div>--%>
<%--  <jsp:include page="../template/header.jsp"/>--%>
<%--</div>--%>

<h2 style="text-align: center; padding-top: 2%; padding-bottom: 1%">View Customer</h2>
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
            <th>Type</th>
            <th>Name</th>
            <th>Birthday</th>
            <%--      <th>Gender</th>--%>
            <th>Id card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${showCustomer}">
            <tr>
                <td><c:out value="${customer.customerId}"></c:out></td>
                <td><c:out value="${customer.customerTypeId}"></c:out></td>
                <td><c:out value="${customer.customerName}"></c:out></td>
                <td><c:out value="${customer.customerBirthday}"></c:out></td>
                    <%--        <td><c:out value="${customer.customerGender}"></c:out></td>--%>
                <td><c:out value="${customer.customerIdCard}"></c:out></td>
                <td><c:out value="${customer.customerPhone}"></c:out></td>
                <td><c:out value="${customer.customerEmail}"></c:out></td>
                <td><c:out value="${customer.customerAddress}"></c:out></td>
                <td><a href="/?action=edit&id=${customer.customerId}">Edit</a></td>
                <td>
                    <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                            data-bs-target="#exampleModal${customer.customerId}">
                        Delete
                    </button>

                    <div class="modal fade" id="exampleModal${customer.customerId}" tabindex="-1"
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
                                    Delete customer ${customer.customerName}?
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                    </button>
                                    <button type="submit" class="btn btn-danger"><a style="color:white;"
                                                                                    href="/?action=delete&id=${customer.customerId}">
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
