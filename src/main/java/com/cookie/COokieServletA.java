package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookieA")
public class COokieServletA  extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();

	String name = request.getParameter("username");

	// Visit counter logic
	int count = 1;
	Cookie[] cookies = request.getCookies();

	if(cookies != null) {
	for(Cookie c : cookies) {
	if(c.getName().equals("visit")) {
	count = Integer.parseInt(c.getValue()) + 1;
	}
	}
	}

	// Create cookie
	Cookie visitCookie = new Cookie("visit", String.valueOf(count));
	visitCookie.setMaxAge(30); // expires in 30 seconds
	response.addCookie(visitCookie);

	// Response
	out.println("<html><body>");
	out.println("<h2>Welcome back " + name + "!</h2>");
	out.println("<h3>You have visited this page " + count + " times</h3>");

	out.println("<h3>List of Cookies:</h3>");

	if(cookies != null) {
	for(Cookie c : cookies) {
	out.println("<p>Cookie Name: " + c.getName() + "</p>");
	}
	} else {
	out.println("<p>No cookies found</p>");
	}

	out.println("<p><b>Note:</b> Cookie expires in 30 seconds</p>");
	out.println("<a href='index.html'>Back</a>");

	out.println("</body></html>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	response.sendRedirect("index.html");
	}
	
}
