<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Registration</title>
</head>
<body>
<form action="save" method="post">
<pre>
Name: <input type="text" name="name">
Email: <input type="email" name="emailId">
Phone: <input type="number" name="mobile">
<input type="submit" value=save>
</pre>
</form>
${msg}
</body>
</html>