package com.HTTP_REQ_RES;

	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.*;

	//ResultServlet.java
	import java.io.*;
	import javax.servlet.*;

	@WebServlet("/processResult")
	public class ResultServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    // Get parameters
	    String rollno = request.getParameter("rollno");
	    String name = request.getParameter("name");

	    String s1 = request.getParameter("sub1");
	    String s2 = request.getParameter("sub2");
	    String s3 = request.getParameter("sub3");
	    String s4 = request.getParameter("sub4");
	    String s5 = request.getParameter("sub5");

	    String message;

	    try {
	        if (rollno == null || rollno.trim().isEmpty() ||
	            name == null || name.trim().isEmpty()) {

	            message = "All fields are required";

	        } else {

	            int sub1 = Integer.parseInt(s1);
	            int sub2 = Integer.parseInt(s2);
	            int sub3 = Integer.parseInt(s3);
	            int sub4 = Integer.parseInt(s4);
	            int sub5 = Integer.parseInt(s5);

	            // Calculate average
	            double avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;

	            // Check pass condition
	            String result;
	            if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40 &&
	                sub4 >= 40 && sub5 >= 40) {
	                result = "PASS";
	            } else {
	                result = "FAIL";
	            }

	            message = "Result processed successfully";

	            // Set attributes
	            request.setAttribute("rollno", rollno);
	            request.setAttribute("name", name);
	            request.setAttribute("sub1", sub1);
	            request.setAttribute("sub2", sub2);
	            request.setAttribute("sub3", sub3);
	            request.setAttribute("sub4", sub4);
	            request.setAttribute("sub5", sub5);
	            request.setAttribute("average", avg);
	            request.setAttribute("result", result);
	        }

	    } catch (Exception e) {
	        message = "Invalid input! Enter numeric marks.";
	    }

	    request.setAttribute("message", message);

	    RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
	    dispatcher.forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    response.sendRedirect("index.jsp");
	}
	}