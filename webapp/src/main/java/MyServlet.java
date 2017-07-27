
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class MyServlet extends HttpServlet {
 
   private String message,message1;

   public void init() throws ServletException {
      // Do required initialization
      message = " World";
      message1 = "world is beautiful";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h6>" + message + "</h6>");
       out.println("<p>" + message1 + "<p>");
   }

  
}