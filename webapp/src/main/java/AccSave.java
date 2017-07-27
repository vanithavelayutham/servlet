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

            // String toMail = request.getParameter("email");
     // String cc=request.getParameter("cc");
      //  String[] recipientList = cc.trim().split(",");


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

/*for( int i = 0; i < recipientList.length; i++) {
               message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ddd));
           }*/
    
              // message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ddd));

           

//message.setRecipients(Message.RecipientType.CC,cc);
//message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("vanitha.v@kggroup.com","subitha.m@kggroup.com","switha.c@kggroup.com"));
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
      
