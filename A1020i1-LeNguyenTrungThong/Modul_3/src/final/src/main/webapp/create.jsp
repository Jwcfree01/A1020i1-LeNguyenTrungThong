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
<div class="container-fluid">
    <div class="row">
        <!--body-->
        <div class="col-md-10">
            <legend style="text-align: center">CREATE MAT BANG</legend>
            <h2>${msg}</h2>
            <form action="/?action=create" method="post" style="margin-top: 7%">
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4">
                        <p>Mã Mặt Bằng</p>
                        <input class="form-control" name="maMatBang" placeholder="Ma Mat Bang">
                    </div>
                    <div class="col-md-4">
                        <p>Diện Tích</p>
                        <input class="form-control" name="area" placeholder="Dien Tich">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4">
                        <p>Trạng Thái</p>
                        <select class="form-select" aria-label="Default select example" name="status">
                            <option value="Trống">Trống</option>
                            <option value="Hạ Tầng">Hạ Tầng</option>
                            <option value="Đầy Đủ">Đầy Đủ</option>
                        </select>
                    </div>
                    <div class="col-md-4">
                        <p>Số Tầng</p>
                        <select class="form-select" aria-label="Default select example" name="floor">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                        </select>
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4">
                        <p>Kiểu Thuê</p>
                        <select class="form-select" aria-label="Default select example" name="type">
                            <option value="Cho Thue">Cho Thue</option>
                            <option value="Tron Goi">Tron Goi</option>
                        </select>
                    </div>
                    <div class="col-md-4" >
                        <p>Giá Cho Thuê</p>
                        <input class="form-control" name="price" placeholder="Gia Cho Thue">
                    </div>
                </div>
                <div class="row mt-4" style="justify-content: center">
                    <div class="col-md-4" >
                        <p>Ngày Bắt Đầu</p>
                        <input class="form-control" name="startDate" type="date">
                    </div>
                    <div class="col-md-4">
                        <p>Ngày kết Thúc</p>
                        <input class="form-control" name="endDate" type="date">
                    </div>
                </div>
                <br>
                <button class="btn btn-lg btn-primary btn-block" style="float:right; margin-right: 16%" type="submit">
                    Create
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
