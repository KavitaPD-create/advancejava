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
<h2>Hello again <%= user %>!</h2>
<%
}
%>

</body>
</html>