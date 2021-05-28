<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <title>Edit Employee</title>
</head>
<body>
<div>
    <jsp:include page="../customer/header.jsp"/>
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
            <legend style="text-align: center">EDIT EMPLOYEE</legend>
            <form action="" method="post" style="margin-top: 7%">
                <div class="row" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="name" placeholder="Name" value="${employee.emName}">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="birthday" type="date" value="${employee.emBirthDay}">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="idCard" placeholder="Id Card" value="${employee.emIdCard}">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="salary" placeholder="salary" value="${employee.emSalary}">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="phone" placeholder="Phone Number" value="${employee.emPhone}">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="email" placeholder="Email" value="${employee.emEmail}">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="address" placeholder="Address" value="${employee.emAddress}">
                    </div>
                    <div class="col-md-4">
                        <select class="form-select" aria-label="Default select example" name="position"
                                style="margin-top: 3%">
                            <option value="1">Director</option>
                            <option value="2">Manager</option>
                            <option value="3">Supervisor</option>
                            <option value="4">Specialist</option>
                            <option value="5">Waiter</option>
                            <option value="6">Receptionist</option>
                        </select>
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <select class="form-select" aria-label="Default select example" name="division"
                                style="margin-top: 3%">
                            <option value="1">Sale–Marketing</option>
                            <option value="2">Management</option>
                            <option value="3">Waiter</option>
                            <option value="4">Administrative</option>
                        </select>
                    </div>
                    <div class="col-md-4">
                        <select class="form-select" aria-label="Default select example" name="education">
                            <option value="1">Graduate</option>
                            <option value="2">University</option>
                            <option value="3">College</option>
                            <option value="4">Intermediate</option>
                        </select>
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="username" placeholder="UserName" value="${employee.userName}">
                    </div>
                    <div class="col-md-4">
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
