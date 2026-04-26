<%@ page import="java.sql.*" %>

<%
String ch = request.getParameter("ch");

Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","");

String query = "SELECT * FROM Emp WHERE Emp_Name LIKE ?";
ps = con.prepareStatement(query);
ps.setString(1, ch + "%");

rs = ps.executeQuery();

out.println("<h2>Salary Report</h2>");
out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

while(rs.next()){
out.println("Emp_No : " + rs.getInt(1) + "<br>");
out.println("Emp_Name : " + rs.getString(2) + "<br>");
out.println("Basic : " + rs.getInt(3) + "<br>");
out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");
}

} catch(Exception e){
out.println(e);
}
%>

<a href="index.jsp">Back</a>