package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.ReservationDAO;
import javax.servlet.annotation.WebServlet;

@WebServlet("/DeleteReservationServlet")
public class DeleteReservationServlet extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {

try {

int id = Integer.parseInt(req.getParameter("id"));

boolean status = new ReservationDAO().deleteReservation(id);

if(status){
    // ✅ CORRECT FLOW
    res.sendRedirect("DisplayReservationsServlet");
}else{
    res.getWriter().println("<h3>Delete Failed</h3>");
}

} catch (Exception e) {
e.printStackTrace();

res.getWriter().println("<h3>Error Occurred</h3>");
}
}
}