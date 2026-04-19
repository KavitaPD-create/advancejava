 <%@ page language="java" %>
<html>
<body>

<%
String name = request.getParameter("username");

// create session
session.setAttribute("user", name);

// set expiry 60 seconds
session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>
<p>Session expires in 1 minute</p>

<a href="check.jsp">Check Session</a>

</body>
</html>