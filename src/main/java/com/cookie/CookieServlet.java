/*
 * 6b. Build a servlet program to create a cookie to get your name through text box and press 
 * submit button( through HTML) to display the message by greeting Welcome back your name ! , 
 * you have visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.
 */
package com.cookie;

	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.*;

	@WebServlet("/cookie")
	public class CookieServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();

	String name = request.getParameter("username");

	// Get cookies
	Cookie[] cookies = request.getCookies();
	int visitCount = 1;

	if(cookies != null) {
	for(Cookie c : cookies) {
	if(c.getName().equals("visitCount")) {
	visitCount = Integer.parseInt(c.getValue()) + 1;
	}
	}
	}

	// Create cookie
	Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

	// Expiry time (30 seconds)
	visitCookie.setMaxAge(30);

	response.addCookie(visitCookie);

	// Response
	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Welcome back " + name + "!</h2>");
	out.println("<h3>You have visited this page " + visitCount + " times</h3>");
	out.println("<p>(Cookie expires in 30 seconds)</p>");
	out.println("<a href='index.html'>Go Back</a>");
	out.println("</body>");
	out.println("</html>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	response.sendRedirect("index.html");
	}
	}
