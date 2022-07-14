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

/**
 *
 * @author USer
 */
public class SelectQuery {
    public static ArrayList<String> getData(String Query) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);  
            ArrayList<String> values = new ArrayList<String>();
            while( rs.next() ) { 
              values.add( rs.getString(1));
            }
            st.close();
            return values;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
