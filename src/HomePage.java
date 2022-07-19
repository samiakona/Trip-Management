
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USer
 */
public class HomePage extends javax.swing.JFrame {
    String email;

    /**
     * Creates new form HomePage
     */
    public HomePage(String _email) {
        initComponents();
        this.email = _email;
        helloemail.setText("hello, "+email);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helloemail = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hot_package = new javax.swing.JButton();
        make_own_trip = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        classic_package = new javax.swing.JButton();
        premium = new javax.swing.JButton();
        back = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helloemail.setBackground(new java.awt.Color(0, 0, 0));
        helloemail.setForeground(new java.awt.Color(255, 255, 255));
        helloemail.setText("Hello");
        helloemail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                helloemailInputMethodTextChanged(evt);
            }
        });
        getContentPane().add(helloemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Home Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        hot_package.setBackground(new java.awt.Color(0, 0, 0));
        hot_package.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hot-package-logo-symbol-icon-260nw-1796112262.jpg"))); // NOI18N
        hot_package.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hot_packageActionPerformed(evt);
            }
        });
        getContentPane().add(hot_package, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, -1));

        make_own_trip.setBackground(new java.awt.Color(0, 0, 0));
        make_own_trip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/make ur own.jpg"))); // NOI18N
        make_own_trip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                make_own_tripActionPerformed(evt);
            }
        });
        getContentPane().add(make_own_trip, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 140, -1));

        setting.setBackground(new java.awt.Color(0, 0, 0));
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Setting.jpg"))); // NOI18N
        getContentPane().add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 140, -1));

        classic_package.setBackground(new java.awt.Color(0, 0, 0));
        classic_package.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/classic.jpg"))); // NOI18N
        classic_package.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classic_packageActionPerformed(evt);
            }
        });
        getContentPane().add(classic_package, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 140, 150));

        premium.setBackground(new java.awt.Color(0, 0, 0));
        premium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/premium.jpg"))); // NOI18N
        getContentPane().add(premium, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 160, 140, 150));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Homepage.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hot_packageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hot_packageActionPerformed
        // TODO add your handling code here:
        HotPackage hot_package = new HotPackage(email);
        hot_package.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_hot_packageActionPerformed

    private void classic_packageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classic_packageActionPerformed
        // TODO add your handling code here:
        // classic_package 
    }//GEN-LAST:event_classic_packageActionPerformed

    private void make_own_tripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_make_own_tripActionPerformed
        // TODO add your handling code here:
        MakeYourOwnTrip make_own_trip = new MakeYourOwnTrip(email);
        make_own_trip.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_make_own_tripActionPerformed

    private void helloemailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_helloemailInputMethodTextChanged
        // TODO add your handling code here:
        helloemail.setText(email);
    }//GEN-LAST:event_helloemailInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton classic_package;
    private javax.swing.JButton helloemail;
    private javax.swing.JButton hot_package;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton make_own_trip;
    private javax.swing.JButton premium;
    private javax.swing.JButton setting;
    // End of variables declaration//GEN-END:variables
}
