/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USer
 */
import javax.swing.JOptionPane;

public class MakeUrOwnTrip extends javax.swing.JFrame {
    String email;

    public MakeUrOwnTrip(String _email) {
        initComponents();
        this.email = _email;
        helloEmail.setText("Hello, " + email);
    }

    /**
     * Creates new form MakeUrOwnTrip
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helloEmail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        myChart = new javax.swing.JButton();
        confirmTrip = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helloEmail.setText("Hello, ");
        helloEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helloEmailActionPerformed(evt);
            }
        });
        getContentPane().add(helloEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Make Your Own Trip");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        myChart.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        myChart.setText("My Chart");
        myChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myChartActionPerformed(evt);
            }
        });
        getContentPane().add(myChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        confirmTrip.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        confirmTrip.setText("Confirm Trip");
        confirmTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTripActionPerformed(evt);
            }
        });
        getContentPane().add(confirmTrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        logout.setBackground(new java.awt.Color(255, 102, 102));
        logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1106, 36, -1, -1));

        exit.setBackground(new java.awt.Color(255, 102, 102));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit.setText("EXIT");
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 36, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 24, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MakeUrOwnTrip.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_logoutActionPerformed

    private void confirmTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmTripActionPerformed

    private void helloEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helloEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helloEmailActionPerformed

    private void myChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myChartActionPerformed
        // TODO add your handling code here:
        MyChart my_chart = new MyChart(email);
        my_chart.setVisible(true);
    }//GEN-LAST:event_myChartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MakeUrOwnTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeUrOwnTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeUrOwnTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeUrOwnTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeUrOwnTrip("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmTrip;
    private javax.swing.JButton exit;
    private javax.swing.JButton helloEmail;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton myChart;
    // End of variables declaration//GEN-END:variables
}
