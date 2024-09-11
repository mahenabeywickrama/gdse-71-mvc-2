/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc2.model;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import mvc2.db.DBConnection;
import mvc2.dto.custDto;

/**
 *
 * @author mahen
 */
public class custModel {
    
    public String Save() throws SQLException, ClassNotFoundException{
         Connection connection = DBConnection.getInstance().getConnection();
         String sql = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";
         PreparedStatement statment = connection.prepareStatement(sql);
         
        ResultSet rst = statment.executeQuery();
        ArrayList<custDto> custDtos = new ArrayList<>();
        
        while(rst.next()){
           custDto CUSTDTO = new custDto();
           
        
        }
    }
}

