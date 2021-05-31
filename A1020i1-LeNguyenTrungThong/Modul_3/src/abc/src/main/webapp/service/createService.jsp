<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Service</title>
</head>
<body>
<div>
    <jsp:include page="../template/header.jsp"/>
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
            <legend style="text-align: center">CREATE SERVICE</legend>
            <form action="/?action=createService" method="post" style="margin-top: 5%">
                <div class="row" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="serviceName" placeholder="Service Name"
                               style="margin-top: 4%">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="serviceArea" placeholder="Service Area"
                               style="margin-top: 4%">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="serviceCost" placeholder="Service Cost"
                               style="margin-top: 4%">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="serviceMaxPeople" placeholder="Service Max People"
                               style="margin-top: 4%">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <select class="form-select" aria-label="Default select example" name="rentTypeName"
                                style="margin-top: 4%">
                            <option value="4">House</option>
                            <option value="3">Day</option>
                            <option value="2">Month</option>
                            <option value="1">Year</option>
                        </select>
                    </div>
                    <div class="col-md-4">
                        <select class="form-select" aria-label="Default select example" name="serviceTypeName"
                                style="margin-top: 4%">
                            <option value="1">Villa</option>
                            <option value="2">House</option>
                            <option value="3">Room</option>
                        </select>
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="standardRoom" placeholder="Standard Room"
                               style="margin-top: 4%">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="descriptionOtherConvenience" placeholder="Description"
                               style="margin-top: 4%">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" style="margin-right: 3%">
                        <input class="form-control" name="pollArea" placeholder="Poll Area" style="margin-top: 4%">
                    </div>
                    <div class="col-md-4">
                        <input class="form-control" name="numberOfFloor" placeholder="Number Of Floor"
                               style="margin-top: 4%">
                    </div>
                </div>
                <br>
                <button class="btn btn-lg btn-primary btn-block" style="float:right; margin-right: 16%" type="submit">
                    Create Service
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
