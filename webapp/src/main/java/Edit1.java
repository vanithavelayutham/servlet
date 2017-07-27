import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Edit1")  
public class Edit1 extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
       Student e=StudentDao.updateGet(id);  
          
        out.print("<form action='Edit2' method='get'>");  
        out.print("<table>");  
        out.print("<tr>");  
        out.println("<td>Id:</td><td><input type='text' name='id' value='"+e.getId()+"'/></td>");
        out.println("</tr>");
        out.print("<tr>"); 
        out.println("<td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td>");
        out.println("</tr>"); 
        out.print("<tr>");
        out.println("<td colspan='2'><input type='submit' value='Edit & Save '/></td>");
        out.println("</tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
} 