<%@ page import="java.sql.*" %>

<%
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

try {

// ✅ LOAD DRIVER
Class.forName("com.mysql.cj.jdbc.Driver");

// ✅ CONNECT DATABASE
con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/Employee","root","password"
);

// GET INPUT
String ch = request.getParameter("ch");

// ✅ DELETE RECORDS
String deleteQuery = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
ps = con.prepareStatement(deleteQuery);
ps.setString(1, ch + "%");

int rows = ps.executeUpdate();

out.println("<h3>" + rows + " Record(s) Deleted</h3>");

// ✅ DISPLAY REMAINING RECORDS
String selectQuery = "SELECT * FROM Emp";
ps = con.prepareStatement(selectQuery);
rs = ps.executeQuery();

out.println("<h2>Salary Report</h2>");
out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

while(rs.next()){
out.println("Emp_No     : " + rs.getInt("Emp_NO") + "<br>");
out.println("Emp_Name   : " + rs.getString("Emp_Name") + "<br>");
out.println("Basic      : " + rs.getInt("Basicsalary") + "<br>");
out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");
}

// CLOSE
rs.close();
ps.close();
con.close();

} catch(Exception e){
out.println("ERROR: " + e.getMessage());
}
%>

<br><a href="index.jsp">Back</a>