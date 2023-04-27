/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectivity;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author saket
 */
public class Select {
    public static ResultSet getData(String query){
        Connection con = null;
        Statement stmt=null;
        PreparedStatement ptst=null;
        ResultSet rs=null;
       try{
       con=Connector.getcon();
       stmt=con.createStatement();
       ptst=con.prepareStatement(query);
       rs=stmt.executeQuery(query);
       return rs;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
        
    }
}
