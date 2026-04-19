 <%@ page language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
<title>Cookie Added</title>
</head>
<body>

<%
String name = request.getParameter("cname");
String domain = request.getParameter("cdomain");
int age = Integer.parseInt(request.getParameter("cage"));

// Create cookie
Cookie cookie = new Cookie(name, domain);

// Set expiry
cookie.setMaxAge(age);

// Add cookie
response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p>Name: <%= name %></p>
<p>Domain: <%= domain %></p>
<p>Expiry: <%= age %> seconds</p>

<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>