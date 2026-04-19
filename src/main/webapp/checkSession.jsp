 <html>
<body>

<%
String user = (String)session.getAttribute("user");

if(user == null) {
%>
<h2 style="color:red;">Session Expired!</h2>
<%
} else {
%>
<h2>Hello <%= user %>! Session Active</h2>
<%
}
%>

<a href="index.jsp">Back</a>

</body>
</html>