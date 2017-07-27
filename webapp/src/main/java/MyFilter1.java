import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.*;  
    import javax.servlet.http.HttpSession; 
    import javax.servlet.annotation.WebFilter;
    import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
      
      @WebFilter(filterName="MyFilter1", urlPatterns={"/mail.html"})
    public class MyFilter1 implements Filter{  
      
    public void init(FilterConfig arg0) throws ServletException {}  
          
    public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws IOException, ServletException {  

          HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;    
        PrintWriter out=response.getWriter();  
              
              String n=request.getParameter("uname");  
        String p=request.getParameter("password");  
        //String u=request.getParameter("user"); 
         
        if(n.equals("manager") && p.equals("vanitha")){  
            out.print("Welcome KTVE manager, "+n);  
        HttpSession session=req.getSession();  
        session.setAttribute("name",n);  
        chain.doFilter(request, response);//sends request to next resource  
    }  
   else if((n.equals("ass manager"))&&(p.equals("vanitha.v"))){  
       out.print("Welcome KTVE Assitant manager , "+n);  
        HttpSession session=req.getSession();  
        session.setAttribute("name",n);  
        //response.sendRedirect("loan.html");
           RequestDispatcher rd=request.getRequestDispatcher("register.html");  
            rd.include(request,response);  
        } 
        else{  
        out.print("username or password error!");  
        //RequestDispatcher rd=request.getRequestDispatcher("login.html");  
        //rd.forward(request, response);  
        }  
              
    }  
        public void destroy() {}  
      
    }  