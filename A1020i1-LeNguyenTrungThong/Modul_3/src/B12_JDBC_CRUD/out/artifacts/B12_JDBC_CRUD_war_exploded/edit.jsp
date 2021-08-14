<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%--<h2>Edit User</h2>--%>
<%--<form action="" method="post">--%>
<%--&lt;%&ndash;    <p>id: <input type="text" name="id" value="${user.id}"></p>&ndash;%&gt;--%>
<%--    <p>name: <input type="text" name="name" value="${user.name}"></p>--%>
<%--    <p>email: <input type="text" name="email" value="${user.email}"></p>--%>
<%--    <p>country: <input type="text" name="country" value="${user.country}"></p>--%>
<%--    <p><input type="submit" value="Save"></p>--%>
<%--</form>--%>


<div class="container">
    <div class="row" style="justify-content: center">
        <div class="col-xs-12 col-sm-12 col-md-4 well well-sm col-md-offset-4">
            <legend>EDIT USER</legend>
            <form action="" method="post" class="form">
                <input class="form-control" name="name" placeholder="Name" value="${user.name}">
                <input class="form-control" name="email" placeholder="Email" value="${user.email}" style="margin-top: 5%">
                <input class="form-control" name="country" placeholder="Country" value="${user.country}" style="margin-top: 5%">
                <br>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
</body>
</html>
