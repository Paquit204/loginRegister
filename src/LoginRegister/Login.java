package LoginRegister;



import ForgotPassword.forgotPassword;
import User.UsersDashboard;
import admin.AdminDashboard;
import config.Session;
import config.dbConnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CYBER SECURITY
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); 
    } 
       Color nc=new Color(0,0,0,60);
       Color hc=new Color(255,255,255);
     static String status; 
       static String atype; 
     
    public static boolean LoginAcc(String username, String pass){
        dbConnect  connect = new dbConnect();
        
        try{
        String query = "SELECT * FROM accounts WHERE username ='"+username+ "' ";
            ResultSet resultSet = connect.getData(query);
            if(resultSet.next()){
                
             
                String hashedPass= resultSet.getString("password");
                String rehashedPass = passwordHasher.hashPassword(pass);
                
                  
                     
                  if ( hashedPass.equals(rehashedPass )){
                       status = resultSet.getString("status");
                        atype = resultSet.getString("type");
                   
                    Session ses = Session.getInstance();
                    ses.setA_id(resultSet.getInt("a_id") );
                    ses.setFirstame(resultSet.getString("firstname") );
                    ses.setLastnmae(resultSet.getString("lastname") );
                    ses.setEmail(resultSet.getString("email") );
                    ses.setType(resultSet.getString("type") );
                    ses.setUsername(resultSet.getString("username") );
                    ses.setStatus(resultSet.getString("status") );
              
                 return true;
                  }else{
                  return false;
                  }
                  
                } else{
                 return false;
            }
            
        }catch(SQLException | NoSuchAlgorithmException ex){
            return false ;
        }
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        ULform1 = new javax.swing.JLabel();
        ps = new javax.swing.JPasswordField();
        username1 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        jLabel2Registration1 = new javax.swing.JLabel();
        jLabel2Registration = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fpass = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        header9 = new javax.swing.JPanel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(null);

        ULform1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ULform1.setForeground(new java.awt.Color(255, 204, 0));
        ULform1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ULform1.setText("LOGIN FORM");
        ULform1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ULform1);
        ULform1.setBounds(60, 60, 280, 70);

        ps.setBackground(new java.awt.Color(204, 204, 204));
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        getContentPane().add(ps);
        ps.setBounds(90, 220, 230, 30);

        username1.setBackground(new java.awt.Color(204, 204, 204));
        username1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username1.setText("Username:");
        getContentPane().add(username1);
        username1.setBounds(100, 130, 75, 17);

        uname.setBackground(new java.awt.Color(204, 204, 204));
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname);
        uname.setBounds(90, 150, 230, 30);

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Password:");
        getContentPane().add(username);
        username.setBounds(90, 200, 80, 17);

        jLabel2Registration1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2Registration1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2Registration1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2Registration1.setText("sign up");
        jLabel2Registration1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2Registration1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2Registration1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2Registration1);
        jLabel2Registration1.setBounds(240, 370, 52, 20);

        jLabel2Registration.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2Registration.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2Registration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2Registration.setText("Didn't have an account? ");
        jLabel2Registration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2Registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2RegistrationMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2Registration);
        jLabel2Registration.setBounds(70, 370, 180, 20);

        showpass.setBackground(new java.awt.Color(0,0,0,60));
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        getContentPane().add(showpass);
        showpass.setBounds(205, 270, 115, 20);

        login.setBackground(new java.awt.Color(0, 204, 255));
        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(140, 320, 90, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pet.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 60, 390, 370);

        fpass.setBackground(new java.awt.Color(255, 255, 255));
        fpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpassMouseExited(evt);
            }
        });
        fpass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        users.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        users.setText("Forgot Password");
        users.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });
        fpass.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        getContentPane().add(fpass);
        fpass.setBounds(90, 270, 100, 30);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgound (1).png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 720, 450);

        header9.setBackground(new java.awt.Color(0, 0, 102));
        header9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                header9MouseClicked(evt);
            }
        });
        header9.setLayout(null);
        getContentPane().add(header9);
        header9.setBounds(0, 0, 760, 490);

        setSize(new java.awt.Dimension(774, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void jLabel2RegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2RegistrationMouseClicked

       
    }//GEN-LAST:event_jLabel2RegistrationMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        if (LoginAcc(uname.getText(),ps.getText() ) ){
            if (!status.equals("Active")){
                JOptionPane.showMessageDialog(null,"Only active User can login");

            }else{

                if (atype.equals("Admin")){
                    JOptionPane.showMessageDialog(null, "Login Succesfully!");
                    AdminDashboard ut = new AdminDashboard();
                    ut.setVisible(true);
                    this.dispose();
                }else if (atype.equals("User")){
                    JOptionPane.showMessageDialog(null, "Login Succesfully!");
                    UsersDashboard adb = new UsersDashboard();
                    adb.setVisible(true);
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(null,"No account type found, Contact the Admin");
                }

            }
        }else if (uname.getText().isEmpty() || ps.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null,"please fill out all fields!"); //validation for login...

        }  else {
            JOptionPane.showMessageDialog(null,"Invalid Account!");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jLabel2Registration1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2Registration1MouseClicked
          Register rg = new Register();
        rg.show();  
        dispose(); 
    }//GEN-LAST:event_jLabel2Registration1MouseClicked

    private void header9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header9MouseClicked

    }//GEN-LAST:event_header9MouseClicked

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        
        if (showpass.isSelected()){
            ps.setEchoChar((char)0);
        }else{
            ps.setEchoChar('*');
        }
            
    }//GEN-LAST:event_showpassActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
    forgotPassword fp=new forgotPassword ();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersMouseClicked

    private void fpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpassMouseClicked

     

    }//GEN-LAST:event_fpassMouseClicked

    private void fpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpassMouseEntered

        fpass.setBackground(nc);
    }//GEN-LAST:event_fpassMouseEntered

    private void fpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpassMouseExited
        fpass.setBackground(hc);
    }//GEN-LAST:event_fpassMouseExited
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ULform1;
    private javax.swing.JPanel fpass;
    private javax.swing.JPanel header9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Registration;
    private javax.swing.JLabel jLabel2Registration1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField ps;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
