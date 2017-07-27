
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*;

@WebServlet("/SendMail")
/*@WebServlet(
        urlPatterns = "/uploadFiles",
        initParams = @WebInitParam(name = "location", value = "request.getParameter("")")
)*/
public class SendMail extends HttpServlet{
SendMail javaEmail = null;
static String  recipientAddress[];
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String toMail = request.getParameter("email");
      String cc=request.getParameter("cc");
        String[] recipientList = cc.trim().split(",");
      // List<String> abc= Arrays.asList(recipientList);

      /*  for(String dd:recipientList)
        {
            System.out.println(dd);
        }*/
    /*  public static String getTo(HttpServlet request)
        {return request.getParameter(toMail);}*/

      // InternetAddress[] recipientAddress = new InternetAddress[recipientList.length];
/*
for (int i=0;i<recipientList.length;i++) {
    
    recipientAddress[i] = recipientList[i].trim();
    //recipientAddress[counter] = new recipient[i];
}*/
     
     
            
      //  String[] Address;

        /*Address cc = new Address[] {InternetAddress.parse("vanitha.v@kggroup.com"),
                               InternetAddress.parse("subitha.m@kggroup.com"),
                               InternetAddress.parse("switha.c@kggroup.com")};*/
        
        //String password = request.getParameter("password");
        try {
           SendMail javaEmail = new SendMail();
           // javaEmail.setMailServerProperties();
           // javaEmail.createEmailMessage(toMail);
          for(String dd: recipientList)
          {

         javaEmail.sendEmail(toMail,dd);
      }
            
            out.println("Process Completed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("event registered successfully");
    }

public static void sendEmail(String to,String ddd)
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
    
               message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ddd));

           

//message.setRecipients(Message.RecipientType.CC,cc);
//message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("vanitha.v@kggroup.com","subitha.m@kggroup.com","switha.c@kggroup.com"));
message.setSubject("A testing mail header !!!");
message.setText("Dear Account Holder,"
+ "\n\n your account has been activated succesfully!"
+"\n\n thankyou ");
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);
//System.out.println("Username or Password are incorrect ... exiting !");
}
}

/*public static void main(String[] args) 
{
String to = "aruna.c@kgfsl.com";
sendEmail(to);
}*/
}