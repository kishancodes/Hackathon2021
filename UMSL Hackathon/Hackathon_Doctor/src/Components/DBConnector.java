/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kishanbhakta
 */
public class DBConnector {
    public java.sql.Connection DBConnector() {
        java.sql.Connection con = null;
        try {
            //Open COnnection
            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:")
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbse","root","toor4321");
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}