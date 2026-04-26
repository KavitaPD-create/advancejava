package dao;

import java.sql.*;
import java.util.*;
import model.Reservation;

public class ReservationDAO {

Connection con;

public ReservationDAO(){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/HotelDB?useSSL=false",
"root",
"password"
);
}catch(Exception e){
e.printStackTrace();
}
}

// ADD
public boolean addReservation(Reservation r){
try{

PreparedStatement ps = con.prepareStatement(
"INSERT INTO Reservations VALUES (?,?,?,?,?,?)");

ps.setInt(1,r.getReservationID());
ps.setString(2,r.getCustomerName());
ps.setString(3,r.getRoomNumber());
ps.setDate(4,r.getCheckIn());
ps.setDate(5,r.getCheckOut());
ps.setDouble(6,r.getTotalAmount());

int rows = ps.executeUpdate();

System.out.println("Inserted rows = " + rows);  // 🔥 DEBUG

return rows > 0;

}catch(Exception e){
System.out.println("INSERT ERROR:");
e.printStackTrace();   // 🔥 SEE THIS IN CONSOLE
}
return false;
}

// DELETE
public boolean deleteReservation(int id){
try{
PreparedStatement ps = con.prepareStatement(
"DELETE FROM Reservations WHERE ReservationID=?");

ps.setInt(1,id);

return ps.executeUpdate()>0;

}catch(Exception e){e.printStackTrace();}
return false;
}

// UPDATE
public boolean updateReservation(Reservation r){
try{
PreparedStatement ps = con.prepareStatement(
"UPDATE Reservations SET CustomerName=?,RoomNumber=?,CheckIn=?,CheckOut=?,TotalAmount=? WHERE ReservationID=?");

ps.setString(1,r.getCustomerName());
ps.setString(2,r.getRoomNumber());
ps.setDate(3,r.getCheckIn());
ps.setDate(4,r.getCheckOut());
ps.setDouble(5,r.getTotalAmount());
ps.setInt(6,r.getReservationID());

return ps.executeUpdate()>0;

}catch(Exception e){e.printStackTrace();}
return false;
}

// DISPLAY
public List<Reservation> getAllReservations(){
List<Reservation> list=new ArrayList<>();
try{
ResultSet rs=con.createStatement().executeQuery("SELECT * FROM Reservations");

while(rs.next()){
Reservation r=new Reservation();
r.setReservationID(rs.getInt(1));
r.setCustomerName(rs.getString(2));
r.setRoomNumber(rs.getString(3));
r.setCheckIn(rs.getDate(4));
r.setCheckOut(rs.getDate(5));
r.setTotalAmount(rs.getDouble(6));
list.add(r);
}
}catch(Exception e){e.printStackTrace();}
return list;
}
}