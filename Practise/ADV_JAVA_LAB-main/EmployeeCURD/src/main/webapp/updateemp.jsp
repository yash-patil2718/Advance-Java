<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Update Employee </title>
</head>
<body>
	 
<h2>Update Employee Details </h2>
<hr>
<br>

	<form action="updateemp" method="post">
		
	Employee Id : <input type="text" name="empid" id="empid" value="${emp.empid}" readonly><br><br>
    Employee name: <input type="text" name="ename" id="ename" value="${emp.ename}"><br><br>
    Employee Salary: <input type="text" name="sal" id="sal" value="${emp.sal}"><br><br>
    <button type="submit" name="btn" id="btn">Update Employee</button>
    
	</form>
	 
</body>
</html>