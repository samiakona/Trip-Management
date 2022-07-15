
import javax.swing.JOptionPane;
import model.User;
import project.InsertBooked;
import project.SelectUserQuery;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USer
 */
public class SajekHotPack extends javax.swing.JFrame {

    String email;

    /**
     * Creates new form CoxHotPack
     */
    public SajekHotPack(String _email) {
        initComponents();
        this.email = _email;
        helloEmail.setText("hello, "+email);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helloEmail = new javax.swing.JButton();
        picture4 = new javax.swing.JLabel();
        picture3 = new javax.swing.JLabel();
        picture2 = new javax.swing.JLabel();
        picture1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();
        hotelNameValue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        costValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        durationValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        forward = new javax.swing.JButton();
        backward = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helloEmail.setText("jButton1");
        getContentPane().add(helloEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        picture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sajekpic4.jpg"))); // NOI18N
        getContentPane().add(picture4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        picture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sajekpic3.jpg"))); // NOI18N
        getContentPane().add(picture3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sajekpic2.jpg"))); // NOI18N
        getContentPane().add(picture2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sajekpic1.jpg"))); // NOI18N
        getContentPane().add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 540, 80, -1));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, -1, -1));

        hotelNameValue.setBackground(new java.awt.Color(255, 255, 255));
        hotelNameValue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        hotelNameValue.setText("Salka Eco Resort");
        getContentPane().add(hotelNameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, 180, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Hotels Name       :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 190, -1));

        costValue.setBackground(new java.awt.Color(255, 255, 255));
        costValue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        costValue.setText("15000");
        getContentPane().add(costValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, 100, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Amount of Cost   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 200, -1));

        durationValue.setBackground(new java.awt.Color(255, 255, 255));
        durationValue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        durationValue.setText("4 days , 3 nights");
        getContentPane().add(durationValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 190, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Time Duration   :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 180, -1));

        forward.setBackground(new java.awt.Color(0, 0, 0));
        forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/forward.jpg"))); // NOI18N
        getContentPane().add(forward, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        backward.setBackground(new java.awt.Color(0, 0, 0));
        backward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.jpg"))); // NOI18N
        getContentPane().add(backward, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sajekcover(3).jpg"))); // NOI18N
        background.setText("jLabel8");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        HotPackage hot_pack = new HotPackage(email);
        hot_pack.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String duration = durationValue.getText();
        int cost = Integer.parseInt(costValue.getText());
        String hotelName = hotelNameValue.getText();
        
        if (duration.equals("") || cost == 0 || hotelName.equals(""))
            JOptionPane.showMessageDialog(null, "Every Field is Required");
        else {
            String getQuery = ("select * from users where email = '" + email + "';");
            String findEmail = SelectUserQuery.getData(getQuery).getEmail();
            
            System.out.println(findEmail);

            if (findEmail != null) {
                User userInfo = SelectUserQuery.getData(getQuery);
                
                InsertBooked.insertBooked(userInfo.getEmail(), userInfo.getName(), userInfo.getPhone(), hotelName, duration, cost, hotelName+" booked successfully.");
            } else {
                login ln = new login();
                JOptionPane.showMessageDialog(null, "please login first...");
                setVisible(false);
                ln.setVisible(true);
            }
        }
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(SajekHotPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SajekHotPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SajekHotPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SajekHotPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SajekHotPack("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton backward;
    private javax.swing.JLabel costValue;
    private javax.swing.JLabel durationValue;
    private javax.swing.JButton forward;
    private javax.swing.JButton helloEmail;
    private javax.swing.JLabel hotelNameValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel picture1;
    private javax.swing.JLabel picture2;
    private javax.swing.JLabel picture3;
    private javax.swing.JLabel picture4;
    // End of variables declaration//GEN-END:variables
}
