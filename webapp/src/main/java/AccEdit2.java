       import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/AccEdit2")  
    public class AccEdit2 extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
              throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
            String name=request.getParameter("name"); 
             String span=request.getParameter("pan");  
            int pan=Integer.parseInt(span); 
             String sphone=request.getParameter("phone");  
            int phone=Integer.parseInt(sphone);  
           // String password=request.getParameter("password");  
            String email=request.getParameter("email"); 
            String street=request.getParameter("street");
            String dist=request.getParameter("dist");
            String state=request.getParameter("state"); 
            String country=request.getParameter("country");  
              String type=request.getParameter("type");
            Bacc b=new Bacc();  
            b.setId(id);  
            b.setName(name);  
            b.setPan(pan);
            b.setPhone(phone);  
            b.setEmail(email);
            b.setStreet(street);
            b.setDist(dist);
            b.setState(state);
            b.setCountry(country);  
            b.setType(type);  
              
            int status=AccDao.update(b);  
            if(status>0){  
                response.sendRedirect("AccView");  
            }else{  
                out.println("Sorry! unable to update record");  
            }  
              
            out.close();  
        }  
      
    }  

