    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/Insert")  
    public class Insert extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();
            int id=Integer.parseInt(request.getParameter("id"));
            String name=request.getParameter("name");
            Student s=new Student();
            s.setId(id);
            s.setName(name);
            int n=StudentDao.insert(s);
            if(n>0)
            {
                
                out.println("inserted successfully");
            }
            else
            {
                out.println("unsuccess");
            }

       }
    }