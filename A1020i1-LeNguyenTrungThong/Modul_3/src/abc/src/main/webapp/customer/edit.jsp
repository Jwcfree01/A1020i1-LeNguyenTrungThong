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

<div class="container-fluid">
    <div class="row">
        <!--menu_left-->
        <div class="col-md-2">
            <p>item one</p>
            <p>item two</p>
            <p>item three</p>
        </div>
        <!--body-->
        <div class="col-md-10">
            <legend style="text-align: center">EDIT CUSTOMER</legend>
            <form action="" method="post" style="margin-top: 7%">
                <div class="row" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <select class="form-select" aria-label="Default select example" name="cus_type" >
                            <option value="5" ${customer.cusTypeId == "5" ? 'selected': ''}>Member</option>
                            <option value="4" ${customer.cusTypeId == "4" ? 'selected': ''}>Silver</option>
                            <option value="3" ${customer.cusTypeId == "3" ? 'selected': ''}>Gold</option>
                            <option value="2" ${customer.cusTypeId == "2" ? 'selected': ''}>Platinum</option>
                            <option value="1" ${customer.cusTypeId == "1" ? 'selected': ''}>Diamond</option>
                        </select>
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="name" placeholder="Name" value="${customer.cusName}">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="birthday" type="date" value="${customer.cusBirthDay}">
                    </div>
                    <div class="col-md-4">
                        <select class="form-select" aria-label="Default select example" name="gender" >
                            <option value="male" ${customer.cusGender == "male" ? 'selected': ''}>Male</option>
                            <option value="female" ${customer.cusGender == "female" ? 'selected': ''}>Female</option>
                            <option value="other" ${customer.cusGender == "other" ? 'selected': ''}>Other</option>
                        </select>
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="cmnd" placeholder="Id card" value="${customer.cusIdCard}">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="phone" placeholder="Phone Number" value="${customer.cusPhone}">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="email" placeholder="Email" value="${customer.cusEmail}">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="address" placeholder="Address" value="${customer.cusAddress}">
                    </div>
                </div>
                <br>
                <button class="btn btn-lg btn-primary btn-block" style="float:right; margin-right: 16%" type="submit">
                    Save
                </button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
</body>
</html>
