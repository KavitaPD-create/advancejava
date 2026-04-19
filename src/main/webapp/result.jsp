 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Result Page</title>
<style>
.result-container {
    width: 320px;
    margin: 50px auto;
    padding: 20px;
    border: 1px solid #ccc;
}
.message {
    color: green;
}
.error {
    color: red;
}
</style>
</head>

<body>
<div class="result-container">
<h2>Student Result</h2>

<div>
    <%= request.getAttribute("message") %>
</div>

<% if(request.getAttribute("rollno") != null) { %>

<p>Roll No : <%= request.getAttribute("rollno") %></p>
<p>Name : <%= request.getAttribute("name") %></p>

<p>Sub1 : <%= request.getAttribute("sub1") %></p>
<p>Sub2 : <%= request.getAttribute("sub2") %></p>
<p>Sub3 : <%= request.getAttribute("sub3") %></p>
<p>Sub4 : <%= request.getAttribute("sub4") %></p>
<p>Sub5 : <%= request.getAttribute("sub5") %></p>

<p><b>Average : <%= request.getAttribute("average") %></b></p>
<p><b>Result : <%= request.getAttribute("result") %></b></p>

<% } %>

<a href="index.jsp">Back to Form</a>

</div>
</body>
</html>