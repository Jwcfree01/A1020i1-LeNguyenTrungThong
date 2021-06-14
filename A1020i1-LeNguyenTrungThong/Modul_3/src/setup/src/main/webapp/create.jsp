<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Create Customer</title>
</head>
<body>
<%--<div>--%>
<%--    <jsp:include page="../template/header.jsp"/>--%>
<%--</div>--%>

<div class="container-fluid">
    <div class="row">
        <!--body-->
        <div class="col-md-10">
            <legend style="text-align: center">CREATE USER</legend>
            <h2>${msg}</h2>
            <form action="/?action=create" method="post" style="margin-top: 7%">
                <div class="row" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <select class="form-select" aria-label="Default select example" name="cus_type">
                            <option value="5">Member</option>
                            <option value="4">Silver</option>
                            <option value="3">Gold</option>
                            <option value="2">Platinum</option>
                            <option value="1">Diamond</option>
                        </select>
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="name" placeholder="Name">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="birthday" type="date">
                    </div>
                    <div class="col-md-4">
                        <select class="form-select" aria-label="Default select example" name="gender">
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                            <option value="other">Other</option>
                        </select>
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="cmnd" placeholder="Id card">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="phone" placeholder="Phone Number">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="email" placeholder="Email">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="address" placeholder="Address">
                    </div>
                </div>
                <br>
                <button class="btn btn-lg btn-primary btn-block" style="float:right; margin-right: 16%" type="submit">
                    Create Customer
                </button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"
        integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT"
        crossorigin="anonymous"></script>
</body>
</html>
