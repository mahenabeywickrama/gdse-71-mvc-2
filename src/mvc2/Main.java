/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc2;
import java.sql.SQLException;
import mvc2.db.DBConnection;
/**.8
 *
 * @author mahen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        System.out.println("hello");
        DBConnection.getInstance().getConnection();
    }
    
}
