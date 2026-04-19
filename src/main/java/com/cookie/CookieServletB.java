 package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookieB")
public class CookieServletB extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

String name = request.getParameter("username");

// Step 1: Read existing cookies
Cookie[] cookies = request.getCookies();
int count = 1;

if(cookies != null) {
for(Cookie c : cookies) {
if(c.getName().equals("visit")) {
count = Integer.parseInt(c.getValue()) + 1;
}
}
}

// Step 2: Create new cookies
Cookie visitCookie = new Cookie("visit", String.valueOf(count));
Cookie nameCookie = new Cookie("username", name);

// expiry 30 seconds
visitCookie.setMaxAge(30);
nameCookie.setMaxAge(30);

// add cookies
response.addCookie(visitCookie);
response.addCookie(nameCookie);

// Step 3: Display response
out.println("<html><body>");

out.println("<h2>Welcome back " + name + "!</h2>");
out.println("<h3>You have visited this page " + count + " times</h3>");

out.println("<h3>Cookie Details:</h3>");

// IMPORTANT FIX: show BOTH old + new cookies
if(cookies != null) {
for(Cookie c : cookies) {
out.println("<p>Name: " + c.getName() + "<br>");
out.println("Value: " + c.getValue() + "</p><hr>");
}
}

// show newly created cookies also
out.println("<p>Name: visit<br>Value: " + count + "</p><hr>");
out.println("<p>Name: username<br>Value: " + name + "</p><hr>");

out.println("<p><b>Cookie expires in 30 seconds</b></p>");
out.println("<a href='index.html'>Back</a>");

out.println("</body></html>");
}
}