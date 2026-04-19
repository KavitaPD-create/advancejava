 <%@ page language="java" %>
<html>
<head>
<title>Session Check</title>
</head>
<body>

<%
String user = (String)session.getAttribute("user");

if(user == null) {
%>
<h2 style="color:red;">Session Expired!</h2>
<%
} else {
%>
<h2>Hello again <%= user %>!</h2>
<%
}
%>

<a href="index.jsp">Go Back</a>

</body>
</html>