<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add New Employee </h2>
<hr>
<br>

	<form action="addnewemp" method="post">
		
	Employee Id : <input type="text" name="empid" id="empid"><br><br>
    Employee name: <input type="text" name="ename" id="ename"><br><br>
    Employee Salary: <input type="text" name="sal" id="sal"><br><br>
    <button type="submit" name="btn" id="btn">Add new Employee</button>
    
	</form>

</body>
</html>