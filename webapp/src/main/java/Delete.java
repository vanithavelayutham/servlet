 import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/Delete")  
    public class Delete extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
            int id=Integer.parseInt(request.getParameter("id")); 
            StudentDao.delete(id);
            response.sendRedirect("Select");
             }
    }
  