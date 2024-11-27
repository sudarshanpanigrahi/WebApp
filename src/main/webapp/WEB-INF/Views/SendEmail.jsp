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
<form action="send" method="post">
<pre>
To: <input type="email" name="to" value=${ed.emailId}>
    Subject: <input type="text" name="sub">
    message: <input type="text" name="mssg">
<input type="submit" value=save>
</pre>
</form>
${msg}
</body>
</html>