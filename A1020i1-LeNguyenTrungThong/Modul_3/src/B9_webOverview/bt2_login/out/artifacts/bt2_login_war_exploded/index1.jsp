<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/abcxyz">
    <h5>ten dang nhap</h5>
    <input type="text" placeholder="name" name="name">
    <h5>mat khau</h5>
    <input type="text" placeholder="password" name="pass">
    <input type="submit" value="Login">
  </form>

  <h2><%=request.getAttribute("to1")%></h2>
  </body>
</html>
