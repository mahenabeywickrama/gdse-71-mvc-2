/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc2.db;

import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.Connection;

/**
 *
 * @author mahenvate
 */
public class DBConnection {
    private static DBConnection dbconnection;  // be singaleton
    private Connection connection;
    private DBConnection() throws SQLException, ClassNotFoundException{
       Class.forName("com.mysql.cj.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "Ijse@1234");
   }
    
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException{
    
          if(dbconnection == null){
                 
              dbconnection = new DBConnection();
                
          }  
        return dbconnection;           
    } 
    
    public Connection getConnection(){
    
           return connection;
    }
    
}
