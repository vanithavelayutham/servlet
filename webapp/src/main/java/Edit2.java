    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/Edit2")  
    public class Edit2 extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
              throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
            String name=request.getParameter("name");  
            
           Student e=new Student();  
            e.setId(id);  
            e.setName(name);  
            
            int status=StudentDao.update(e);  
            if(status>0){  
                response.sendRedirect("Select");  
            }else{  
                out.println("Sorry! unable to update record");  
            }  
              
            out.close();  
        }  
      
    }  

