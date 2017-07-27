import java.io.*;  
import java.sql.*; 
//import java.sql.Date; 
import java.text.ParseException;
import javax.servlet.ServletException;  
import javax.servlet.http.*; 
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
//import java.util.Date;
  //@WebServlet("/Register")
public class Register extends HttpServlet {  private String message,jfname,jlname,jemail,jdate,jtime,jtopic,jlocation,s1,s2,s3,s4,s5,s6,s7;

public void init() throws ServletException {
// Do required initialization
//message = "Display Event Detail";
jfname="FirstName :";
jlname="LastName:";
jemail="Email :";
jdate="Date :";
jtime="Time:";
jtopic="Topic:";
jlocation="Location:";

//System.out.println("i am init");
}
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
        
String fname=request.getParameter("fname");  
String lname=request.getParameter("lname");  
String email=request.getParameter("email");  
String date=request.getParameter("date");  
String time=request.getParameter("time");  
String topic=request.getParameter("topic");  
String location=request.getParameter("location");
//SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
//Date dt =objSDF.parse(date);
out.println(
"<table border=1><tr><td><h2>"+jfname+"</td><td><h2>"+fname+"</td></h2></tr><br>"+
"<tr><td><h2>"+jlname+"</td><td><h2>"+lname+"</td></h2></tr><br>"+
"<tr><td><h2>"+jemail+"</td><td><h2>"+email+"</td></h2></tr><br>"+
"<tr><td><h2>"+jdate+"</td><td><h2>"+date+"</td></h2></tr><br>"+
" <tr><td><h2>"+jtime+"</td><td><h2>"+time+"</td></h2></tr><br>"+
" <tr><td><h2>"+jtopic+"</td><td><h2>"+topic+"</td></h2></tr><br>"+
" <tr><td><h2>"+jlocation+"</td><td><h2>"+location+"</td></h2></tr><br>"


);

out.println("<img src='/image/images.jpg' alt='success'/>");



try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "");
            
            PreparedStatement ps=conn.prepareStatement("insert into registeruser values(?,?,?,?,?,?,?)");
         //ps.executeUpdate("insert into registeruser values(?,?,?,?,?,?,?)");
        
ps.setString(1,fname);  
ps.setString(2,lname);  
ps.setString(3,email);  
ps.setString(4,date);
//ps.setDate(4, (java.sql.Date)dt);
ps.setString(5,time);  
ps.setString(6,topic);  
ps.setString(7,location);
Statement stmt=conn.createStatement();
String query="select * from registeruser";
           ResultSet rs1=stmt.executeQuery(query);
          while(rs1.next()) 
          { 
    out.println( rs1.getString(1)+" "+rs1.getString(2)+"  "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getString(5)+" "+rs1.getString(6)+" "+rs1.getString(7));     
          }
  
int i=ps.executeUpdate();
     
 conn.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
           
    }  
}