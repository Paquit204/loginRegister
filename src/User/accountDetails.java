/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.Session;
import java.awt.Color;


/**
 *
 * @author CYBER SECURITY
 */
public class accountDetails extends javax.swing.JFrame {

    /**
     * Creates new form UsersDashboard
     */
    public accountDetails() {
        initComponents();
           this.setLocationRelativeTo(null); // Make Jframe Center allighnment
    }
      Color nc=new Color( 0,12,102);
       Color hc=new Color(0,0,0,60);
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
        header2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Acc_lname = new javax.swing.JLabel();
        Acc_fname = new javax.swing.JLabel();
        header6 = new javax.swing.JPanel();
        header7 = new javax.swing.JPanel();
        Unavbar = new javax.swing.JPanel();
        lastname = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username1 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        usertype = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        utype = new javax.swing.JComboBox<>();
        fname = new javax.swing.JTextField();
        ustatus = new javax.swing.JComboBox<>();
        User_status = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        u_id = new javax.swing.JTextField();
        jpanelEmail1 = new javax.swing.JLabel();
        changepass = new javax.swing.JPanel();
        a_request = new javax.swing.JLabel();

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
        jLabel1.setText("Back");
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
        jLabel4.setText("ACCOUNT INFORMATION");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 60));

        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        header2.setBackground(new java.awt.Color(5, 92, 157));
        header2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-removebg-preview (1).png"))); // NOI18N
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

        lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastname.setText("Last Name:");
        Unavbar.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lname.setBackground(new java.awt.Color(204, 204, 204));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        Unavbar.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, -1));

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        Unavbar.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 280, -1));

        username1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username1.setText("Username:");
        Unavbar.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        uname.setBackground(new java.awt.Color(204, 204, 204));
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        Unavbar.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 230, -1));

        usertype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usertype.setForeground(new java.awt.Color(255, 255, 255));
        usertype.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usertype.setText("UserType:");
        Unavbar.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        firstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstname.setText("First Name:");
        Unavbar.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        utype.setBackground(new java.awt.Color(204, 204, 204));
        utype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select UserType", "User", "Admin" }));
        Unavbar.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, -1));

        fname.setBackground(new java.awt.Color(204, 204, 204));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        Unavbar.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 230, -1));

        ustatus.setBackground(new java.awt.Color(204, 204, 204));
        ustatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ustatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        Unavbar.add(ustatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 230, -1));

        User_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        User_status.setForeground(new java.awt.Color(255, 255, 255));
        User_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User_status.setText("User Status:");
        Unavbar.add(User_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 20));

        uid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uid.setForeground(new java.awt.Color(255, 255, 255));
        uid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uid.setText("User ID:");
        Unavbar.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, -1));

        u_id.setBackground(new java.awt.Color(204, 204, 204));
        u_id.setEnabled(false);
        u_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_idActionPerformed(evt);
            }
        });
        Unavbar.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, -1));

        jpanelEmail1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpanelEmail1.setForeground(new java.awt.Color(255, 255, 255));
        jpanelEmail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpanelEmail1.setText("Email:");
        Unavbar.add(jpanelEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        changepass.setBackground(new java.awt.Color(0,0,0,60));
        changepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changepassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changepassMouseExited(evt);
            }
        });
        changepass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a_request.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        a_request.setForeground(new java.awt.Color(255, 255, 255));
        a_request.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        a_request.setText("Change Password");
        a_request.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        a_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_requestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_requestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_requestMouseExited(evt);
            }
        });
        changepass.add(a_request, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 7, 110, 20));

        Unavbar.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 200, 40));

        header7.add(Unavbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 540, 360));

        header6.add(header7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 400));

        getContentPane().add(header6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 620, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
                 UsersDashboard ud = new UsersDashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session ses = Session.getInstance();
       
        u_id.setText(""+ses.getA_id());
        fname.setText(""+ses.getFirstame());
        lname.setText(""+ses.getLastnmae());
        uname.setText(""+ses.getUsername());
        email.setText(""+ses.getEmail());
        
         Acc_fname.setText(""+ses.getFirstame());
        Acc_lname.setText(""+ses.getLastnmae());
        
    }//GEN-LAST:event_formWindowActivated

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void u_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_idActionPerformed

    private void a_requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_requestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_a_requestMouseClicked

    private void a_requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_requestMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_a_requestMouseEntered

    private void a_requestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_requestMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_a_requestMouseExited

    private void changepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseClicked
        changePass cp = new changePass();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changepassMouseClicked

    private void changepassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseEntered

        changepass.setBackground(nc);

    }//GEN-LAST:event_changepassMouseEntered

    private void changepassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassMouseExited
        changepass.setBackground(hc);
    }//GEN-LAST:event_changepassMouseExited

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
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Acc_fname;
    public javax.swing.JLabel Acc_lname;
    private javax.swing.JPanel Unavbar;
    private javax.swing.JLabel User_status;
    public javax.swing.JLabel a_request;
    private javax.swing.JPanel changepass;
    public javax.swing.JTextField email;
    private javax.swing.JLabel firstname;
    public javax.swing.JTextField fname;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JPanel header6;
    private javax.swing.JPanel header7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jpanelEmail1;
    private javax.swing.JLabel lastname;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField u_id;
    private javax.swing.JLabel uid;
    public javax.swing.JTextField uname;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel usertype;
    public javax.swing.JComboBox<String> ustatus;
    public javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
