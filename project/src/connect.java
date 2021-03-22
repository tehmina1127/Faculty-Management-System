import java.sql.*;
public class connect {
    
     public static void main(String[]args){
          String url= "jdbc:mysql://localhost:3306/db1?useSSL=true";
     String user="root'";
     String pass="";
     try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn= DriverManager.getConnection(url,user,pass);
    System.out.println("done");
}
     catch(Exception e){
    System.out.println(e);
}
     }
}
