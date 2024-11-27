<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<form action="updateEmps" method="post">
<pre>
ID: <input type="text" name="id" value=${ed.id}>
Name: <input type="text" name="name" value=${ed.name}>
Email: <input type="email" name="emailId" value=${ed.emailId}>
Phone: <input type="number" name="mobile" value=${ed.mobile}>
<input type="submit" value=save>
</pre>
</form>
</body>
</html>