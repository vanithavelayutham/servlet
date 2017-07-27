import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Select")  
public class Select extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        out.println("<a href='index1.html'>add new student</a>");
        out.println("<h1>student details</h1>");
        List<Student> s1=StudentDao.select();
        out.println("<table border='1' width='50%'>");
        out.println("<tr>");
        out.println("<th>id</th>");
        out.println("<th>name</th>");
        out.println("<th>edit</th>");
        out.println("<th>delete</th>");
        out.println("</tr>");
        for(Student s:s1){
        out.println("<tr>");
        out.println("<td>"+s.getId()+"</td>");
        out.println("<td>"+s.getName()+"</td>");
        out.println("<td><a href='Edit1?id="+s.getId()+"'>edit</a></td>");
        out.println("<td><a href='Delete?id="+s.getId()+"'>delete</a></td>");
        out.println("</tr>");
        }
        out.println("</table>");
               }
}