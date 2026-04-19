 <%@ page language="java" %>
<html>
<body>

<%
String name = request.getParameter("username");
int time = Integer.parseInt(request.getParameter("time"));

// set session
session.setAttribute("user", name);
session.setMaxInactiveInterval(time);
%>

<h2>Hello <%= name %>!</h2>
<p>Session set for <%= time %> seconds</p>

<a href="checkSession.jsp">Check Session</a>

</body>
</html>