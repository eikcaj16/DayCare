///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package javamailsender;
//
//import java.util.Properties;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//
//
///**
// *
// * @author nagashreeseshadri
// */
//public class MailSender {
//    
//    public static void sendMail(String recepient) throws MessagingException
//    {
//        System.out.println("Preparing to send email");
//        Properties prop = new Properties(); //key values pairs of properties for mail server
//        
//        prop.put("mail.smtp.auth", "true");
//        //prop.put("mail.smtp.starttls.enable", "true");
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//       // prop.put("mail.smtp.port", "465");
//        prop.put("mail.smtp.socketFactory.port", "465");
//        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        //prop.put("mail.smtp.username", "daycare.ad21");
//       // prop.put("mail.smtp.password", "daycare123");
//        
//        
//      String myEmailAccount = "daycare.ad21@gmail.com";
//      String password = "daycare123";
//       
//        //login
//        Session session = Session.getDefaultInstance(prop, new Authenticator(){
//        
//            
//            protected PasswordAuthentication getPasswordAuthetication(){
//                
//                String myUserName = "daycare.ad21";
//                String password = "daycare123";
//                
//               // return new PasswordAuthentication(myEmailAccount, password);
//               return new PasswordAuthentication(myUserName, password);
//            
//            }       
//        
//        });
//        
//        
//        Message message = prepareMessage(session, myEmailAccount, recepient); 
//                
//        if(message == null){
//            System.out.println("Message is null or failed");
//            return;
//        }
//        
//        Transport.send(message);
//        
////        Transport transport = session.getTransport("smtp");
////        transport.connect("smtp.gmail.com" , 587 , myEmailAccount, password);
////        transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
////        transport.close();
//       
//      
//       
//        System.out.println("Message sent successfully");
//    
//    }
//    
//    
//    private static Message prepareMessage(Session session, String myEmailAccount, String recepient){
//        Message message = new MimeMessage(session);
//        try {
//            message.setFrom(new InternetAddress(myEmailAccount));
//            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
//            message.setSubject("Enrollment and Vaccination Status"); //setting the subject
//            message.setText("Hello, your child's vaccination is due");
//            return message;
//        } catch (Exception ex) {
//            Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//     
//       // return message;
//    }
//    
//}
