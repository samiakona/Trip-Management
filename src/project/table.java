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
public class table {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            
            st = con.createStatement();
            st.executeUpdate("create table users("
                    + "name varchar(200),"
                    + "email varchar(200),"
                    + "phone varchar(20),"
                    + "password varchar(50),"
                    + "confirm_password varchar(50));");

            JOptionPane.showMessageDialog(null, "Table Create Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            }

        }

    }

}
