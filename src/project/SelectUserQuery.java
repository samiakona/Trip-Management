/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author USer
 */
public class SelectUserQuery {
    public static User getData(String Query) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);  

            User user = new User();
            
            while( rs.next() ) { 
              user.setName(rs.getString(1));
              user.setEmail(rs.getString(2));
              user.setPhone(rs.getInt(3));
              user.setPassword(rs.getString(4));
              user.setConfirm_password(rs.getString(5));
            }
            st.close();
            return user;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

