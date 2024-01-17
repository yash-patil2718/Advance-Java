<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<tr>
		<th>pid</th>
		<th>pname</th>
		<th>pqty</th>
		<th>pcost</th>
	</tr>
	<c:forEach var="p" items={plist}>
		<tr>
			<td>${p.pid}</td>
			<td>${p.pname}</td>
			<td>${p.qty}</td>
			<td>${p.cost}</td>
		</tr>
	</c:forEach>
	
</body>
</html>