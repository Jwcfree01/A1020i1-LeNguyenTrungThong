<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/abc" method="post">
    <fieldset>
      <legend>Calculator:</legend>
      <input type="text" placeholder="input number" name="input1">
      <select name="n" id="">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
      </select>
      <input type="text" placeholder="input number" name="input2">
      <input type="submit" value="Submit">
    </fieldset>
  </form>
  </body>
</html>
