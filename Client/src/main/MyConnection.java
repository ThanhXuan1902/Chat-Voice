package main;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Thanh Xuan
 */
public class MyConnection {

    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/chat_room","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
