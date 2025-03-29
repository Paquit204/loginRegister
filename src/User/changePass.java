/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import LoginRegister.Login;
import config.Session;
import config.dbConnect;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author CYBER SECURITY
 */
public class changePass extends javax.swing.JFrame {

    /**
     * Creates new form UsersDashboard
     */
    public changePass() {
        initComponents();
           this.setLocationRelativeTo(null); // Make Jframe Center allighnment
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        u_id = new javax.swing.JLabel();
        header2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Acc_lname = new javax.swing.JLabel();
        Acc_fname = new javax.swing.JLabel();
        header6 = new javax.swing.JPanel();
        header7 = new javax.swing.JPanel();
        Unavbar = new javax.swing.JPanel();
        confirmpass = new javax.swing.JTextField();
        username1 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        firstname = new javax.swing.JLabel();
        oldpass = new javax.swing.JTextField();
        lastname1 = new javax.swing.JLabel();
        save = new javax.swing.JPanel();
        save2 = new javax.swing.JLabel();
        backs = new javax.swing.JPanel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header1.setBackground(new java.awt.Color(0, 48, 96));
        header1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGOUT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        header1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, -4, 110, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CHANGE PASSWORD");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 60));

        u_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_id.setForeground(new java.awt.Color(255, 255, 255));
        u_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        u_id.setText("User ID:");
        header1.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 120, 60));

        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        header2.setBackground(new java.awt.Color(5, 92, 157));
        header2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-removebg-preview (1).png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 110));

        Acc_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Acc_lname.setForeground(new java.awt.Color(255, 255, 255));
        Acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acc_lname.setText("LastName:");
        Acc_lname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header2.add(Acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, 40));

        Acc_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Acc_fname.setForeground(new java.awt.Color(255, 255, 255));
        Acc_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acc_fname.setText("FirstName:");
        Acc_fname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header2.add(Acc_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, 40));

        getContentPane().add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, 420));

        header6.setBackground(new java.awt.Color(126, 200, 227));
        header6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header7.setBackground(new java.awt.Color(0, 12, 102));
        header7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Unavbar.setBackground(new java.awt.Color(0,0,0,60));
        Unavbar.setForeground(new java.awt.Color(102, 102, 102));
        Unavbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmpass.setBackground(new java.awt.Color(204, 204, 204));
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        Unavbar.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 230, -1));

        username1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username1.setText("Enter New Pass:");
        Unavbar.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, -1));

        newpass.setBackground(new java.awt.Color(204, 204, 204));
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        Unavbar.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, -1));

        firstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstname.setText("Type Old Pass:");
        Unavbar.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 130, -1));

        oldpass.setBackground(new java.awt.Color(204, 204, 204));
        oldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpassActionPerformed(evt);
            }
        });
        Unavbar.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 230, -1));

        lastname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastname1.setForeground(new java.awt.Color(255, 255, 255));
        lastname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastname1.setText("Confirm Pass:");
        Unavbar.add(lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 110, -1));

        save.setBackground(new java.awt.Color(102, 102, 255));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.setLayout(null);

        save2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save2.setText("Save");
        save2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save2MouseClicked(evt);
            }
        });
        save.add(save2);
        save2.setBounds(0, 0, 100, 30);

        Unavbar.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, 30));

        backs.setBackground(new java.awt.Color(102, 102, 255));
        backs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backsMouseClicked(evt);
            }
        });
        backs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        backs.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        Unavbar.add(backs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 100, 30));

        header7.add(Unavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, 360));

        header6.add(header7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 400));

        getContentPane().add(header6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 620, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
                 Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session ses = Session.getInstance();
       
        u_id.setText(""+ses.getA_id());
           Acc_fname.setText(""+ses.getFirstame());
        Acc_lname.setText(""+ses.getLastnmae());
        
    }//GEN-LAST:event_formWindowActivated

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void oldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpassActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         
        
        accountDetails ad = new   accountDetails ();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backsMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        
    }//GEN-LAST:event_saveMouseClicked

    private void save2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save2MouseClicked
        
        
     try {
    dbConnect con = new dbConnect();
    Session ses = Session.getInstance();

    String query = "SELECT * from accounts WHERE a_id = '" + ses.getA_id() + "'";
    ResultSet rs = con.getData(query);

    if (rs.next()) {
        String olddbpass = rs.getString("password");
        String oldhash = passwordHasher.hashPassword(oldpass.getText());

        if (olddbpass.equals(oldhash)) {
            // Validation: Check if newpass and confirmpass match
            if (!newpass.getText().equals(confirmpass.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!");
                return; // Exit the function if passwords don't match
            }

            String npass = passwordHasher.hashPassword(newpass.getText());
            con.updateData("UPDATE accounts SET password = '" + npass + "'");
            JOptionPane.showMessageDialog(null, "wohoah Updates Succesfully!");
            Login lg = new Login();
            lg.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Old password is incorrect!");
        }
    }
} catch (SQLException | NoSuchAlgorithmException ex) {
    System.out.println("" + ex);
}



        
        
        
    }//GEN-LAST:event_save2MouseClicked

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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acc_fname;
    private javax.swing.JLabel Acc_lname;
    private javax.swing.JPanel Unavbar;
    private javax.swing.JLabel back;
    private javax.swing.JPanel backs;
    public javax.swing.JTextField confirmpass;
    private javax.swing.JLabel firstname;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JPanel header6;
    private javax.swing.JPanel header7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lastname1;
    public javax.swing.JTextField newpass;
    public javax.swing.JTextField oldpass;
    private javax.swing.JPanel save;
    private javax.swing.JLabel save2;
    private javax.swing.JLabel u_id;
    private javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
}
