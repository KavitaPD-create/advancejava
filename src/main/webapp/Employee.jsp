 <%@ page import="java.sql.*" %>

<html>
<head>
<title>Salary Report</title>
</head>
<body>

<%
int empno = Integer.parseInt(request.getParameter("empno"));
String empname = request.getParameter("empname");
int salary = Integer.parseInt(request.getParameter("salary"));

Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

int total = 0;

try
{
Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/Employee","root","");

// INSERT RECORD
ps = con.prepareStatement("insert into Emp values(?,?,?)");
ps.setInt(1, empno);
ps.setString(2, empname);
ps.setInt(3, salary);
ps.executeUpdate();

// FETCH ALL RECORDS
Statement st = con.createStatement();
rs = st.executeQuery("select * from Emp");
%>

<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
while(rs.next())
{
int no = rs.getInt(1);
String name = rs.getString(2);
int sal = rs.getInt(3);
total += sal;
%>

Emp_No     : <%=no%>
Emp_Name   : <%=name%>
Basic      : <%=sal%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

<%
}
%>

Grand Salary : <%=total%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>

<%
}
catch(Exception e)
{
out.println(e);
}
finally
{
try { con.close(); } catch(Exception e){}
}
%>

</body>
</html>
 