package sessiontracking;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionTracker")
public class SessionTrackingServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");
PrintWriter out = response.getWriter();

// Get session
HttpSession session = request.getSession(true);

// Set session expiry to 60 seconds
session.setMaxInactiveInterval(60);

// Session details
Date createTime = new Date(session.getCreationTime());
Date lastAccessTime = new Date(session.getLastAccessedTime());
String sessionId = session.getId();

// Visit count
Integer visitCount = (Integer) session.getAttribute("visitCount");

if(visitCount == null)
visitCount = 1;
else
visitCount++;

session.setAttribute("visitCount", visitCount);

// Output
out.println("<html><body>");
out.println("<h2>Session Tracking Information</h2>");
out.println("<p>Session ID: " + sessionId + "</p>");
out.println("<p>Creation Time: " + createTime + "</p>");
out.println("<p>Last Access Time: " + lastAccessTime + "</p>");
out.println("<p>Visit Count: " + visitCount + "</p>");
out.println("<p><b>Session expires in 1 minute</b></p>");
out.println("</body></html>");
}
}