import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/AccEdit")  
public class AccEdit extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        Bacc e=AccDao.getEmployeeById(id);  
           out.println("<body style='background-color:#42e5f4;'>");
        out.print("<form action='AccEdit2' method='get'>");  
        out.print("<table>");  
        out.print("<tr>");  
        out.println("<td>Id:</td><td><input type='number' name='id' value='"+e.getId()+"'/></td>");
        out.println("</tr>");
        out.print("<tr>"); 
        out.println("<td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td>");
        out.println("</tr>");  
        out.print("<tr>");
        out.println("<td>pan:</td><td><input type='text' name='pan' value='"+e.getPan()+"'/></td>");
                out.println("</tr>");
                out.print("<tr>");
        out.println("<td>phone:</td><td><input type='text' name='phone' value='"+e.getPhone()+"'/></td>");
                out.println("</tr>");  
        out.print("<tr>");
        out.println("<td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td>");
        out.println("</tr>");  
        //out.print("<tr>");
        out.print("<tr>");
        out.println("<td>Street:</td><td><input type='text' name='street' value='"+e.getStreet()+"'/></td>");
                out.println("</tr>");
                out.print("<tr>");
        out.println("<td>District:</td><td><input type='text' name='dist' value='"+e.getDist()+"'/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>State:</td>");
        out.println("<td>");  
        out.print("<select name='state' style='width:150px'>");  
        out.print("<option>tamilnadu</option>");  
        out.print("<option>kerala</option>");   
        out.print("</select>");  
        out.print("</td>");
        out.println("</tr>");
        out.println("<tr>");  
        out.println("<td>Country:</td>");
        out.println("<td>");  
        out.print("<select name='country' style='width:150px'>");  
        out.print("<option>India</option>");  
        out.print("<option>USA</option>");  
        out.print("<option>UK</option>");  
        out.print("<option>Other</option>");  
        out.print("</select>");  
        out.print("</td>");
        out.println("</tr>"); 
        out.println("<tr>");
                out.println("<td>type:</td>");
        out.println("<td>");  
        out.print("<select name='type' style='width:150px'>");  
        out.print("<option>savings</option>");  
        out.print("<option>commercial</option>");   
        out.print("</select>");  
        out.print("</td>");
        out.println("</tr>"); 
        out.print("<tr>");
        out.println("<td colspan='2'><input type='submit' value='Edit & Save '/></td>");
        out.println("</tr>");  
        out.print("</table>");  
        out.print("</form>");  
          out.println("<body>");
        out.close();  
    }  
} 