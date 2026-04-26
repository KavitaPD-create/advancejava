<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Update Reservation</title>

<style>
body {
margin:0;
font-family:Arial, sans-serif;
background:linear-gradient(135deg,#667eea,#764ba2);
}

.container {
width:60%;
margin:60px auto;
background:white;
padding:25px;
border-radius:12px;
box-shadow:0 0 10px rgba(0,0,0,0.2);
}

h2 {
text-align:center;
margin-bottom:20px;
}

input {
width:100%;
padding:10px;
margin:8px 0;
border-radius:6px;
border:1px solid #ccc;
box-sizing:border-box;
}

input[type="submit"] {
background:#007bff;
color:white;
border:none;
cursor:pointer;
font-weight:bold;
}

input[type="submit"]:hover {
background:#0056b3;
}

a {
display:block;
text-align:center;
margin-top:15px;
text-decoration:none;
color:#007bff;
}
</style>

</head>

<body>

<div class="container">

<h2>Update Reservation</h2>

<form action="UpdateReservationServlet" method="post">

<label>Reservation ID</label>
<input type="number" name="id" required>

<label>Customer Name</label>
<input type="text" name="name" required>

<label>Room Number</label>
<input type="text" name="room" required>

<label>Check-In Date</label>
<input type="date" name="checkin" required>

<label>Check-Out Date</label>
<input type="date" name="checkout" required>

<label>Total Amount</label>
<input type="number" name="amount" step="0.01" required>

<input type="submit" value="Update Reservation">

</form>

<a href="index.jsp">⬅ Back to Home</a>

</div>

</body>
</html>