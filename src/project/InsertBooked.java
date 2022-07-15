/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USer
 */
public class InsertBooked {
    public static void insertBooked(String email, String name, int phone, String hotelName, String timeDuration, int cost, String msg) {
        Connection con = null;
        try {
            con = ConnectionProvider.getCon();
            String query = "insert into booked(userEmail, userName, userPhone, hotelName, timeDuration, cost)"
                        + " values(?, ?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, email);
            preparedStmt.setString(2, name);
            preparedStmt.setInt(3, phone);
            preparedStmt.setString(4, hotelName);
            preparedStmt.setString(5, timeDuration);
            preparedStmt.setInt(6, cost);
            
            preparedStmt.execute();
            
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
            } catch (Exception e) {
            }
        }
    }
}
