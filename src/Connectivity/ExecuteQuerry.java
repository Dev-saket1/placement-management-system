/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connectivity;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author saket
 */
public class ExecuteQuerry {
    public static void setData(String Query,String massage){
        java.sql.Connection con=null;
        java.sql.Statement st=null;
        try{
            con=Connector.getcon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!massage.equals(""))
                JOptionPane.showConfirmDialog(null, massage);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
        try{}
        catch(Exception e){}
        
        }
        } 
        
        
}
    

