<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link type="text/css" rel="stylesheet" href="../style/style.css"/>
    <title>Service</title>
</head>
<body>
<div>
    <jsp:include page="header.jsp"/>
</div>

<div class="container-fluid">
    <div class="container-fluid">
        <!--menu_left-->
        <div class="col-md-3">
            <p>item one</p>
            <p>item two</p>
            <p>item three</p>
        </div>
        <!--body-->
        <div class="col-md-9">
            <div class="container">
                <div class="row" style="justify-content: center">
                    <div class="col-xs-12 col-sm-12 col-md-4 well well-sm col-md-offset-4">
                        <legend>CREATE SERVICE</legend>
<%--                        <div class="form-group">--%>
                        <form action="/?action=createService" method="post" class="form">
                            <div class="form-inline">
                            <input class="form-control" name="serviceName" placeholder="Service Name" style="margin-top: 5%">
                            <input class="form-control" name="serviceArea" placeholder="Service Area" style="margin-top: 5%">
                            <input class="form-control" name="serviceCost" placeholder="Service Cost" style="margin-top: 5%">
                            <input class="form-control" name="serviceMaxPeople" placeholder="Service Max People" style="margin-top: 5%">
                            <input class="form-control" name="rentTypeName" placeholder="Rent Type Name" style="margin-top: 5%">

                            <input class="form-control" name="serviceTypeName" placeholder="Service Type Name" style="margin-top: 5%">
                            <input class="form-control" name="standardRoom" placeholder="Standard Room" style="margin-top: 5%">
                            <input class="form-control" name="descriptionOtherConvenience" placeholder="Description" style="margin-top: 5%">
                            <input class="form-control" name="pollArea" placeholder="Poll Area" style="margin-top: 5%">
                            <input class="form-control" name="numberOfFloor" placeholder="Number Of Floor" style="margin-top: 5%">
                            </div>
                            <br>
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Create Service</button>
                        </form>
<%--                        </div>--%>
                    </div>
                </div>
            </div>
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
