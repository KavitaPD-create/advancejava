package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.List;
import dao.ReservationDAO;
import model.Reservation;
import javax.servlet.annotation.WebServlet;

@WebServlet("/DisplayReservationsServlet")
public class DisplayReservationsServlet extends HttpServlet {

protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {

ReservationDAO dao = new ReservationDAO();

// FETCH DATA
List<Reservation> list = dao.getAllReservations();

// SEND TO JSP
req.setAttribute("list", list);

// FORWARD
RequestDispatcher rd = req.getRequestDispatcher("reservationdisplay.jsp");
rd.forward(req, res);
}
}