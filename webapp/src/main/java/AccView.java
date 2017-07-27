import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/AccView")  
public class AccView extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        // request.getRequestDispatcher("SaveServlet").include(request, response);  
        out.println("<a href='mail.html'>Add New Account Holder</a>");  
        out.println("<h1>Customer List</h1>");  
          
        List<Bacc> list=AccDao.getAllEmployees();  
          //out.print("<img src='index.jpg' alt='image' />");
         out.println("<body style='background-color:#d3d3d3;'>");
        out.print("<table border='1' width='100%'>");  
        out.print("<tr>");  
                 out.print("<th>Id</th>");
                 out.print("<th>Name</th>");
                 out.print("<th>Pan</th>");
                 out.print("<th>Phone</th>");
                 out.print("<th>Email</th>");
                 out.print("<th>Street</th>");
                 out.print("<th>Dist</th>");
                 out.print("<th>State</th>");
                  out.print("<th>Country</th>");
                   out.print("<th>Type</th>");
                    out.print("<th>Edit</th>");
                    out.print("<th>Delete</th>");
        out.print(" </tr>");
        for(Bacc b:list){  
         out.print("<tr>");
                 out.print("<td>"+b.getId()+"</td>"); 
                 out.print("<td>"+b.getName()+"</td>");
                  out.print( "<td>"+b.getPan()+"</td>");
                   out.print( "<td>"+b.getPhone()+"</td>");
                 out.print("<td>"+b.getEmail()+"</td>");
                  out.print( "<td>"+b.getStreet()+"</td>");
                   out.print( "<td>"+b.getDist()+"</td>");
                    out.print( "<td>"+b.getState()+"</td>");
                 out.print( "<td>"+b.getCountry()+"</td>");
                  out.print( "<td>"+b.getType()+"</td>");
                out.print("<td><a href='AccEdit?id="+b.getId()+"'>edit</a></td>");
            out.print("<td><a href='AccDelete?id="+b.getId()+"'>delete</a></td>");
                 out.print("</tr>");
                 out.println("</body>");
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}