/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author saket
 */
public class Connector {
     public static Connection getcon()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("JDBC:mysql://localhost:3306/project","root","saket@1234");
            return con;
            
        }
        catch(Exception e){
            return null;
        }
    }
    
}
