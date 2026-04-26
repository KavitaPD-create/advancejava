<html>
<head><title>Employee Input</title></head>
<body>

<h2>Insert Employee</h2>

<form action="insert.jsp" method="post">
Emp No: <input type="text" name="empno"><br><br>
Emp Name: <input type="text" name="empname"><br><br>
Basic Salary: <input type="text" name="salary"><br><br>
<input type="submit" value="Insert">
</form>

<hr>

<h2>Search Employee Name Starting With</h2>

<form action="report.jsp" method="post">
Enter Character: <input type="text" name="ch"><br><br>
<input type="submit" value="Generate Report">
</form>

</body>
</html>