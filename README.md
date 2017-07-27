# servlet
Bank Account Opening and Loan Details

Description

There are two types of login one is bank manager and another one is assistant manager. the login is used for authentication purpose. the manager create the new account and they can edit,delete,view the account holder details.the assistant manager manage the loan information.in this project we are using servlet for backend, html for frontend and database for storage purpose.

Pages

Html

login.html
mail.html
register.html
Java

Bacc.java
AccDao.java
AccDelete.java
AccEdit.java
AccEdit2.java
AccSave.java
AccView.java
MyFilter.java
Database

register
Table

bank
Explanation

Html

login.html

Which is used for authentication purpose, we are used filter and session for login-verification.

<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<link rel="shortcut icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOnO8OvBKUH9OxS5m63Qv2v-1Ch-tLoY9yXSnh94RKkTUEp6hScQ" type="image"/>
<style>


.jumbotron {
  background-image:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTb8Ox7X7zJvkj69b7l2AF4PapMfZdPSAmQFeBJfJIMvPmeDKDaFg);
  height:700px;
  background-repeat: no-repeat;
  background-size: cover;
  border-bottom:1px solid #ff6a00
}
.red{
color:#ff1000;
}
.blue{
color:blue;
}
label{
display:inline-block;
width:80%;
text-align: left;
}

</style>

<body>

<div class ="container-fluid">
    <h1><div align="center">
<div class ="well blue"> welcome </div></div></h1>
<div class ="jumbotron">

<form method="get" action="mail.html" class ="form-inline">

<label>User Name: <input type="text" class ="blue"name="uname"  /></label><br/>
<label> Password: <input type="password"class ="blue" name="password" ></label><br/>

<button type="submit" class="btn-primary">Submit
<span class=" glyphicon glyphicon-ok-sign"></span>
</button>
<button type="reset" class="btn-primary">cancel
<span class=" glyphicon glyphicon-remove"></span>
</button><br/>

</div>
</form>
</div>
</div>

</body>

</html>

mail.html

Which is used for enter account holder information using html form. this page redirected to manager and send mail to account holder.

<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<link rel="shortcut icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOnO8OvBKUH9OxS5m63Qv2v-1Ch-tLoY9yXSnh94RKkTUEp6hScQ" type="image"/>
<style>
.well{
text-align:center;
font-size: 20px;
color:White;
background-color: #384963;
margin-bottom: 5px;
background-position: 0% 25%;
background-size:cover;
background-repeat: no-repeat;
height:100px;
}

.jumbotron{

background-color: #42f4f4;
margin-bottom: 0px;
background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBqW2PvnvjwyfWSpZMERePAXqObaNTtslHruKVtjWNpBUqxpsNQQ);
background-position: 15% 25%;
background-size:cover;
background-repeat: no-repeat;
height:500px;
}
.red{
color:#ff1000;
}
.green{
color:green;
}
.white{
color:white;
}
label{
display:inline-block;
width:80%;
text-align: left;
}

</style>

<body>

<div class ="container-fluid">
<div class ="well"> Welcome to Account Opening Form</div>
<div class ="jumbotron">

<form method="get" action="AccSave"class ="form-inline">


<table>  
    <tr><td>Id:</td><td><input type="number" name="id"/></td></tr> 
    <tr><td>Account Holder Name:</td><td><input type="text" name="name"/></td></tr> 
    <tr><td>PAN Number:</td><td><input type="text" name="pan"/></td></tr>
    <tr><td>Phone Number:</td><td><input type="text" name="phone"/></td></tr>
    <tr><td>Email:</td><td><input type="email" name="email"/></td></tr>
    <tr><td>Village/Street:</td><td><input type="text" name="street"/></td></tr>
    <tr><td>District:</td><td><input type="text" name="dist"/></td></tr>
     <tr><td>State:</td><td>  
    <select name="state" style="width:150px">  
    <option>Tamilnadu</option>  
    <option>kerala</option> 
    </select>  
    </td></tr>
    <tr><td>Country:</td><td>  
    <select name="country" style="width:150px">  
    <option>India</option>  
    <option>USA</option>  
    <option>UK</option>  
    <option>Other</option>  
    </select>  
    </td></tr> 
     <tr><td>Account Type:</td><td>  
    <select name="type" style="width:150px">  
    <option>savings</option>  
    <option>commercial</option> 
    </select>  
    </td></tr>
    <tr><td colspan="2"><button type="submit" class="btn-success">Add Account Holder
<span class="glyphicon glyphicon-hand-left"></span>
</button><br/></td></tr>  
    </table>  

<a href="AccView">view  Account Holders</a> 
</form>
</div>
</div>

</body>

</html>

register.html

which is used for getting information of loans. this information provided by assistant manager.

    <html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<link rel="shortcut icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOnO8OvBKUH9OxS5m63Qv2v-1Ch-tLoY9yXSnh94RKkTUEp6hScQ" type="image"/>
<style>
.well{
text-align:center;
font-size: 20px;
color:White;
background-color: #384963;
margin-bottom: 5px;
background-position: 0% 25%;
background-size:cover;
background-repeat: no-repeat;
height:100px;
}

.jumbotron{

background-color: #42f4f4;
margin-bottom: 0px;
background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSaFhtn0-RA6oz8bvGiRTAm9EEFE7W5YE-rveVb8Vjq9vH9QKnNdA);
background-position: 15% 25%;
background-size:cover;
background-repeat: no-repeat;
height:500px;
}
.red{
color:#ff1000;
}
.green{
color:green;
}
.white{
color:white;
}
label{
display:inline-block;
width:80%;
text-align: left;
}

</style>

<body>

<div class ="container-fluid">
<div class ="well"> Welcome to Grtting Loan information</div>
<div class ="jumbotron">

<form method="get" action="thanku.html"class ="form-inline">
    <ul><h3 class="green">Types of loan</h3>
    <ol><h4 class="red">Education loan</h4></ol>
    <ol><h4>Home loan</h4></ol>
    <ol><h4>Gold loan</h4></ol>
    <ol><h4>Documentation loan</h4></ol>
</ul>
</form>
</div>
</div>
</body>
</html>
java

Bacc.java

This is pojo class

public class Bacc {  
    private int id,pan,phone;  
    private String name,email,country,street,dist,state,type;  
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
     public int getPan() {  
        return pan;  
    }  
    public void setPan(int pan) {  
        this.pan = pan;  
    }  
    public int getPhone() {  
        return phone;  
    }  
    public void setPhone(int phone) {  
        this.phone = phone;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    public String getStreet() {  
        return street;  
    }  
    public void setStreet(String street) {  
        this.street = street;  
    }  
public String getDist() {  
        return dist;  
    }  
    public void setDist(String dist) {  
        this.dist = dist;  
    }  
    public String getState() {  
        return state;  
    }  
    public void setState(String state) {  
        this.state = state;  
    }  
    public String getCountry() {  
        return country;  
    }  
    public void setCountry(String country) {  
        this.country = country;  
    }  
     public String getType() {  
        return type;  
    }  
    public void setType(String type) {  
        this.type = type;  
    }  
    }  
MyFilter.java

The doFilter() method will be called for each request of our application. Hence we can check the session in this method and see if it is valid.

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
AccDao.java

This servlet class contain the methods of insert delete update view database operation

import java.util.*;  
import java.sql.*;  
  
public class AccDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "");
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Bacc b){  
        int status=0;  
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into bank(id,name,pan,phone,email,street,dist,state,country,type) values (?,?,?,?,?,?,?,?,?,?)"); 
            ps.setInt(1,b.getId()); 
            ps.setString(2,b.getName());
             ps.setInt(3,b.getPan());
              ps.setInt(4,b.getPhone());  
            ps.setString(5,b.getEmail()); 
             ps.setString(6,b.getStreet()); 
              ps.setString(7,b.getDist()); 
               ps.setString(8,b.getState());  
            ps.setString(9,b.getCountry());  
               ps.setString(10,b.getType()); 
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static List<Bacc> getAllEmployees(){  
        List<Bacc> list=new ArrayList<Bacc>();  
          
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from bank");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Bacc b=new Bacc();  
                b.setId(rs.getInt(1));  
                b.setName(rs.getString(2));  
                b.setPan(rs.getInt(3));  
                b.setPhone(rs.getInt(4));  
                 b.setEmail(rs.getString(5));
                  b.setStreet(rs.getString(6));
                   b.setDist(rs.getString(7));
                b.setState(rs.getString(8)); 
                 b.setCountry(rs.getString(9));
                  b.setType(rs.getString(10)); 
                list.add(b);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from bank where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    } 
    public static int update(Bacc b){  
        int status=0;  
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update bank set name=?,pan=?,phone=?,email=?,street=?,dist=?,state=?,country=?,type=? where id=?");  
             
             ps.setString(1,b.getName());  
            ps.setInt(2,b.getPan()); 
            ps.setInt(3,b.getPhone());
            ps.setString(4,b.getEmail());  
            ps.setString(5,b.getStreet());
            ps.setString(6,b.getDist());              
        ps.setString(7,b.getState());
        ps.setString(8,b.getCountry());
        ps.setString(9,b.getType());
              ps.setInt(10,b.getId());
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static Bacc getEmployeeById(int id){  
        Bacc e=new Bacc();  
          
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from bank where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2)); 
                 e.setPan(rs.getInt(3));  
                  e.setPhone(rs.getInt(4));  
                e.setEmail(rs.getString(5));
                e.setStreet(rs.getString(6));  
                e.setDist(rs.getString(7)); 
                e.setState(rs.getString(8));     
                e.setCountry(rs.getString(9)); 
                e.setType(rs.getString(10));   
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }
}
AccDelete.java

This servlet class is used for delete the account holder details, this operation is controlled by manager.

    import java.io.IOException;  
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/AccDelete")  
    public class AccDelete extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
                 throws ServletException, IOException {  
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
            AccDao.delete(id);  
            response.sendRedirect("AccView");  
        }  
    }  
AccSave.java

This servlet class is used for insert the account holder details to database

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.net.Authenticator;
import java.util.*;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/AccSave")  
    public class AccSave extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();

              int id=Integer.parseInt(request.getParameter("id")); 
            String name=request.getParameter("name");  
            int pan=Integer.parseInt(request.getParameter("pan"));
            int phone=Integer.parseInt(request.getParameter("phone"));  
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
              
            int status=AccDao.save(b);  
            if(status>0){  
                
                out.print("<p>Record saved successfully!</p>");  
               try
                {
                 AccSave.sendEmail(email);
                    out.println("Mail sent successfully\n");
       } catch (Exception e) {
          e.printStackTrace();
      }
             request.getRequestDispatcher("mail.html").include(request, response);
               //request.getRequestDispatcher("ViewServlet").include(request, response);  
            }else{  
                out.println("Sorry! unable to save record");  
            }  
              } 
        public static void sendEmail(String to)
{
final String username = "vanitha.v@kggroup.com";
final String password = "kgisl@123";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("vanitha.v@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(to));


message.setSubject("A testing mail header !!!");
message.setText("Dear Account Holder,"
+"\n\n WELCOME TO KTVE BANK"
+ "\n\n your account has been created successfully!"
+"\n\n thankyou for open the account ");
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);
//System.out.println("Username or Password are incorrect ... exiting !");
}
}
} 
AccView.java

This servlet class is used to retrive the account holder details from database

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
AccEdit.java

This servlet class is used to alter the account holder detals

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
AccEdit2.java

This servlet class is used to get account holder details using their id, then alter the details

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
    ## snapshots
![login](https://github.com/vanithavelayutham/servlet/blob/master/webapp/src/main/webapp/image/login.png)

![manager](https://github.com/vanithavelayutham/servlet/blob/master/webapp/src/main/webapp/image/manager.png)

![insert and send mail](https://github.com/vanithavelayutham/servlet/blob/master/webapp/src/main/webapp/image/insert%20mail.png)

![view](https://github.com/vanithavelayutham/servlet/blob/master/webapp/src/main/webapp/image/view.png)

![edit](https://github.com/vanithavelayutham/servlet/blob/master/webapp/src/main/webapp/image/update.png)

![delete](https://github.com/vanithavelayutham/servlet/blob/master/webapp/src/main/webapp/image/delete.png)

![assistant manager](https://github.com/vanithavelayutham/servlet/blob/master/webapp/src/main/webapp/image/ass%20manager.png)

