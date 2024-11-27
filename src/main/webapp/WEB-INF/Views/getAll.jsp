<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Records</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>emailId</th>
			<th>phone</th>
			<th>Delete</th>
			<th>Update</th>
			<th>Compose Email</th>

		</tr>
		<c:forEach var="emp" items="${ed}">
		<tr>
			<td>${emp.name}</td>
			<td>${emp.emailId}</td>
			<td>${emp.mobile}</td>
            <td><a href="deleteReg?id=${emp.id}">Delete</a></td>
			<td><a href="UpdateReg?id=${emp.id}">update  </a></td>
			<td><a href="sendem?id=${emp.id}">Email  </a></td>

		</tr>
		</c:forEach>
	</table>
</body>
</html>