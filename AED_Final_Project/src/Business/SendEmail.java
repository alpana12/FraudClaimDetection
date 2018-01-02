/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author prana
 */
public class SendEmail {
         
         public static void SendMail(String toEmailId,String subject,String body){
         
                  final String username = "";
                  final String password = "170parkerhill";
                  Properties props = new Properties();
                  props.put("mail.smtp.starttls.enable", "true");
                  props.put("mail.smtp.auth", "true");
                  props.put("mail.smtp.host", "smtp.gmail.com");
                  props.put("mail.smtp.port", "587");
                  Session session = Session.getInstance(props,
                          new javax.mail.Authenticator() {
                           protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication(username, password);
                           }
                  });
                  try {
                           Message message = new MimeMessage(session);
                           message.setFrom(new InternetAddress(username + "@gmail.com"));
                           message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailId));
                           message.setSubject(subject);
                           message.setText(body);
                           Transport.send(message);
                           //System.out.println("Done");
                  } catch (MessagingException e) {
                           throw new RuntimeException(e);
                  }
         }
}
