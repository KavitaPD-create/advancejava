/*
 * 6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.
 */
	package com.prime;

	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.*;

	@WebServlet("/prime")
	public class PrimeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();

	try {
	int number = Integer.parseInt(request.getParameter("number"));

	boolean isPrime = true;

	if(number <= 1) {
	isPrime = false;
	}
	else {
	for(int i = 2; i <= number/2; i++) {
	if(number % i == 0) {
	isPrime = false;
	break;
	}
	}
	}

	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Prime Number Result</h2>");
	out.println("<p>Number: " + number + "</p>");

	if(isPrime)
	out.println("<h3>" + number + " is a PRIME number</h3>");
	else
	out.println("<h3>" + number + " is NOT a prime number</h3>");

	out.println("<a href='index.html'>Check Another</a>");
	out.println("</body>");
	out.println("</html>");

	} catch(NumberFormatException e) {
	out.println("<h3>Invalid Input</h3>");
	}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	response.sendRedirect("index.html");
	}
	
}
