package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.ReservationDAO;
import model.Reservation;
import java.sql.Date;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AddReservationServlet")
public class AddReservationServlet extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {

try{

Reservation r = new Reservation();

r.setReservationID(Integer.parseInt(req.getParameter("id")));
r.setCustomerName(req.getParameter("name"));
r.setRoomNumber(req.getParameter("room"));
r.setCheckIn(Date.valueOf(req.getParameter("checkin")));
r.setCheckOut(Date.valueOf(req.getParameter("checkout")));
r.setTotalAmount(Double.parseDouble(req.getParameter("amount")));

boolean status = new ReservationDAO().addReservation(r);

if(status){
res.sendRedirect("DisplayReservationsServlet");
}else{
res.getWriter().println("Insert Failed");
}

}catch(Exception e){
e.printStackTrace();
}
}
}