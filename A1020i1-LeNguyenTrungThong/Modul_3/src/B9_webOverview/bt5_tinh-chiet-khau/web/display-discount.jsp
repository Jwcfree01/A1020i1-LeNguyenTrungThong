<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h5>Product Description</h5>
    <h2><%=request.getAttribute("num1")%></h2>
<h5>List Price</h5>
    <h2><%=request.getAttribute("num2")%></h2>
<h5>Discount Percent</h5>
    <h2><%=request.getAttribute("num3")%></h2>
<h5>Discount Amount</h5>
    <h2><%=request.getAttribute("num4")%></h2>
<h5>Discount Price</h5>
    <h2><%=request.getAttribute("num5")%></h2>
</body>
</html>
