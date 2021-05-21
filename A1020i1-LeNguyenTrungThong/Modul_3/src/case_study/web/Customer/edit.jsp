<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div>
    <jsp:include page="header.jsp"/>
</div>

<div class="container">
    <div class="row" style="justify-content: center">
        <div class="col-xs-12 col-sm-12 col-md-4 well well-sm col-md-offset-4">
            <legend>EDIT CUSTOMER</legend>
            <form action="/?edit" method="post" class="form">
                <select class="form-select" aria-label="Default select example" name="cus_type" value="${customer.cusTypeId}">
                    <option value="5">Member</option>
                    <option value="4">Silver</option>
                    <option value="3">Gold</option>
                    <option value="2">Platinum</option>
                    <option value="1">Diamond</option>
                </select>
                <input class="form-control" name="name" placeholder="Name" value="${customer.cusName}" style="margin-top: 5%">
                <input class="form-control" name="birthday" type="date" value="${customer.cusBirthDay}" style="margin-top: 5%">
                <input class="form-control" name="gender" placeholder="Gender" value="${customer.cusGender}" style="margin-top: 5%">
                <input class="form-control" name="cmnd" placeholder="Id card" value="${customer.cusIdCard}" style="margin-top: 5%">
                <input class="form-control" name="phone" placeholder="Phone Number" value="${customer.cusPhone}" style="margin-top: 5%">
                <input class="form-control" name="email" placeholder="Email" value="${customer.cusEmail}" style="margin-top: 5%">
                <input class="form-control" name="address" placeholder="Address" value="${customer.cusAddress}" style="margin-top: 5%">
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
