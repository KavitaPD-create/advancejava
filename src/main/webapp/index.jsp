<%@ page language="java" %>
<html>
<head>
<title>Cookie Management</title>
</head>
<body>

<h2>Add Cookie</h2>

<form action="addCookie.jsp" method="post">
Name: <input type="text" name="cname"><br><br>
Domain: <input type="text" name="cdomain"><br><br>
Expiry (seconds): <input type="number" name="cage"><br><br>

<input type="submit" value="Add Cookie">
</form>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>