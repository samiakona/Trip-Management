/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USer
 */
public class LogIn {
    public static ResultSet getdata (String query)
    {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
