import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/// with MYSQL server
public class DataBase {
     public static Connection conn = null;
    
    
    public static Connection getInstance(){
        try {
 
            String dbURL = "jdbc:sqlserver://localhost\\TEHMINA:1433;databaseName=CMS";
            String user = "Tehmina";
            String pass = "tehmina143";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                System.out.println("Connected to Database......");
            }
 
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
       
return conn;
}

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


////////////
//public class DataBase {
//    private static String servername= "Localhost";
//    private static String username="root";
//    private static String dbname="CMS";
//    private static Integer portnumber=3306;
//    private static String password="";
//    
//public static Connection getConnection(){
//Connection cnx =null;
//MysqlDataSource datasource= new MysqlDataSource();
//datasource.setServerName(servername);
//datasource.setUser(username);
//datasource.setPassword(password);
//datasource.setDatabaseName(dbname);
//datasource.setPortNumber(portnumber);
//
//
//        try {    
//            cnx=datasource.getConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger("Get Connection - < "+DataBase.class.getName()).log(Level.SEVERE, null, ex);
//        }
//return cnx;
//}
//}