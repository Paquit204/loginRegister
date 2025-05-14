/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static LoginRegister.Register.email;
import static LoginRegister.Register.usname;
import config.dbConnect;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author CYBER SECURITY
 */
public class AddUsersForm extends javax.swing.JFrame {

    /**
     * Creates new form AddUsersForm
     */
    public AddUsersForm() {
        initComponents();
    }
    
         public String destination="";
         File selectedFile;
         public String oldpath;
          public String path;
          
           
           public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
           
public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
                public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
         ImageIcon MyImage = null;
             if(ImagePath !=null){
                 MyImage = new ImageIcon(ImagePath);
             }else{
                 MyImage = new ImageIcon(pic);
             }

         int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

         Image img = MyImage.getImage();
         Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
         ImageIcon image = new ImageIcon(newImg);
         return image;
}  
                public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }



       
        public boolean duplicateCheck(){
          dbConnect dbc =  new dbConnect();
          try{
              String query = "SELECT * FROM accounts WHERE username ='"+uname.getText()+ "' OR  email = '"+em.getText()+"'";
                ResultSet resultSet = dbc.getData(query);
              
                 if (resultSet.next()){
                     email=resultSet.getString("email");
                        if(email.equals(em.getText())){
                             JOptionPane.showMessageDialog(null,"Email is already used!");
                             em.setText("");  
                             return true;}
                             usname=resultSet.getString("username");
                          if(usname.equals(uname.getText())){
                             JOptionPane.showMessageDialog(null,"Username is already used!");}
                             uname.setText("");
                           return true;}
                 else{
                         return false;}
                
                }catch(SQLException ex){
                  System.out.println("" + ex);
                     return false;
                 }
      
      }  
        
        
          public boolean updateCheck(){
              
          dbConnect dbc =  new dbConnect();
          try{
              String query = "SELECT * FROM accounts WHERE (username ='"+uname.getText()+ "' OR  email = '"+em.getText()+"') AND a_id!= '"+u_id.getText()+"'";
                ResultSet resultSet = dbc.getData(query);
              
                 if (resultSet.next()){
                     email=resultSet.getString("email");
                        if(email.equals(em.getText())){
                             JOptionPane.showMessageDialog(null,"Email is already used!");
                             em.setText("");  
                             return true;}
                        
                             usname=resultSet.getString("username");
                          if(usname.equals(uname.getText())){
                             JOptionPane.showMessageDialog(null,"Username is already used!");}
                             uname.setText("");
                           return true;}
                 else{
                         return false;}
                
                }catch(SQLException ex){
                  System.out.println("" + ex);
                     return false;
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

        header4 = new javax.swing.JPanel();
        header8 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        header7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        u_add = new javax.swing.JButton();
        u_update = new javax.swing.JButton();
        u_delete = new javax.swing.JButton();
        u_cancel = new javax.swing.JButton();
        u_clear = new javax.swing.JButton();
        header6 = new javax.swing.JPanel();
        u_refresh = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        User_status = new javax.swing.JLabel();
        ustatus = new javax.swing.JComboBox<>();
        usertype = new javax.swing.JLabel();
        utype = new javax.swing.JComboBox<>();
        header9 = new javax.swing.JPanel();
        em = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        firstname = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        jpanelEmail = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        username1 = new javax.swing.JLabel();
        nu = new javax.swing.JTextField();
        username2 = new javax.swing.JLabel();
        u_id = new javax.swing.JTextField();
        uid = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        select = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header4.setBackground(new java.awt.Color(5, 10, 48));
        header4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header8.setBackground(new java.awt.Color(0, 12, 102));
        header8.setLayout(null);
        header8.add(image);
        image.setBounds(10, 10, 270, 290);

        header4.add(header8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 290, 310));

        header7.setBackground(new java.awt.Color(126, 200, 227));
        header7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("ADD FORM");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 50));

        header4.add(header7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 50));

        u_add.setBackground(new java.awt.Color(0, 204, 255));
        u_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_add.setForeground(new java.awt.Color(255, 255, 255));
        u_add.setText("ADD");
        u_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_addActionPerformed(evt);
            }
        });
        header4.add(u_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 110, 40));

        u_update.setBackground(new java.awt.Color(0, 204, 255));
        u_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_update.setForeground(new java.awt.Color(255, 255, 255));
        u_update.setText("UPDATE");
        u_update.setEnabled(false);
        u_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_updateActionPerformed(evt);
            }
        });
        header4.add(u_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 40));

        u_delete.setBackground(new java.awt.Color(0, 204, 255));
        u_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_delete.setForeground(new java.awt.Color(255, 255, 255));
        u_delete.setText("DELETE");
        u_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_deleteActionPerformed(evt);
            }
        });
        header4.add(u_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 110, 40));

        u_cancel.setBackground(new java.awt.Color(0, 204, 255));
        u_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_cancel.setForeground(new java.awt.Color(255, 255, 255));
        u_cancel.setText("CANCEl");
        u_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_cancelActionPerformed(evt);
            }
        });
        header4.add(u_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 247, 110, 40));

        u_clear.setBackground(new java.awt.Color(0, 204, 255));
        u_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_clear.setForeground(new java.awt.Color(255, 255, 255));
        u_clear.setText("CLEAR");
        u_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_clearActionPerformed(evt);
            }
        });
        header4.add(u_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 297, 110, 40));

        header6.setBackground(new java.awt.Color(0, 12, 102));
        header6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        u_refresh.setBackground(new java.awt.Color(0, 204, 255));
        u_refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_refresh.setForeground(new java.awt.Color(255, 255, 255));
        u_refresh.setText("REFRESH");
        u_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_refreshActionPerformed(evt);
            }
        });
        header6.add(u_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 110, 40));

        header4.add(header6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 120, 410));

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("Password:");
        header4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 30));

        User_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        User_status.setForeground(new java.awt.Color(255, 255, 255));
        User_status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User_status.setText("User Status:");
        header4.add(User_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, 30));

        ustatus.setBackground(new java.awt.Color(204, 204, 204));
        ustatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ustatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        header4.add(ustatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 180, 30));

        usertype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usertype.setForeground(new java.awt.Color(255, 255, 255));
        usertype.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usertype.setText("UserType:");
        header4.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 100, 30));

        utype.setBackground(new java.awt.Color(204, 204, 204));
        utype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select UserType", "User", "Admin" }));
        header4.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 180, 30));

        header9.setBackground(new java.awt.Color(126, 200, 227));
        header9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        em.setBackground(new java.awt.Color(204, 204, 204));
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        header9.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, 30));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        header9.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 180, 30));

        firstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstname.setText("First Name:");
        header9.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        fname.setBackground(new java.awt.Color(204, 204, 204));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        header9.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, 30));

        lname.setBackground(new java.awt.Color(204, 204, 204));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        header9.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 180, 30));

        lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastname.setText("Last Name:");
        header9.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 30));

        jpanelEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jpanelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jpanelEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpanelEmail.setText("Email:");
        header9.add(jpanelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 30));

        uname.setBackground(new java.awt.Color(204, 204, 204));
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        header9.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 180, 30));

        username1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username1.setText("Username:");
        header9.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 30));

        nu.setBackground(new java.awt.Color(204, 204, 204));
        nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuActionPerformed(evt);
            }
        });
        header9.add(nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 180, 30));

        username2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username2.setForeground(new java.awt.Color(255, 255, 255));
        username2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username2.setText("Contact");
        header9.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        u_id.setBackground(new java.awt.Color(204, 204, 204));
        u_id.setEnabled(false);
        u_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_idActionPerformed(evt);
            }
        });
        header9.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 180, 30));

        uid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uid.setForeground(new java.awt.Color(255, 255, 255));
        uid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uid.setText("User ID:");
        header9.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        header4.add(header9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 320, 390));

        remove.setBackground(new java.awt.Color(0, 204, 255));
        remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        header4.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 110, 40));

        select.setBackground(new java.awt.Color(0, 204, 255));
        select.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setText("SELECT");
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        header4.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 110, 40));

        getContentPane().add(header4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void u_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_addActionPerformed

        dbConnect dbc=new dbConnect();

        if

        (fname.getText().isEmpty() || lname.getText().isEmpty()
            || em.getText().isEmpty()
            || utype.getSelectedIndex()==0
            || uname.getText().isEmpty()
            || nu.getText().isEmpty()
            || password.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"All fields are required!");

            return ;

        }else if (password.getText().length()< 8){
            JOptionPane.showMessageDialog(null," Password should contain atleast 8 character above!");
            password.setText("");
            return;}

        String email = this.em.getText();
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern patternEmail = Pattern.compile(emailRegex);
        Matcher matcherEmail = patternEmail.matcher(email);

        if (!matcherEmail.matches()) {
            JOptionPane.showMessageDialog(this, "Invalid email format. Please use a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            this.em.setText("");
            this.em.requestFocus();

        }

        else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");

        }
         
      
        
        else if (dbc. insertData("INSERT INTO accounts(firstname, lastname, email, type, username, password,contact, status,u_image) "
            + "VALUES('"+fname.getText()+"',"
            + "'"+lname.getText()+"',"
            + "'"+this.em.getText()+"',"
            + "'"+utype.getSelectedItem()+"',"
            + "'"+uname.getText()+"',"
            + "'"+ password.getText()+"',"
                     + "'"+nu.getText()+"',"
                    + "'"+ustatus.getSelectedItem()+"','"+destination+"')") ==1)

    {
        try{
        Files.copy(selectedFile.toPath(),new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING );
       
        JOptionPane.showMessageDialog(null, " User Succesfully Added");
        UsersForm uf= new UsersForm();
        uf.setVisible(true);
        this.dispose();
    
        }catch(IOException ex){
            System.out.println("Connection Error! "+ ex );
        }
        
        } else {
            JOptionPane.showMessageDialog(null,"Connection error!!");
        }
    }//GEN-LAST:event_u_addActionPerformed

    private void u_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_updateActionPerformed

        if

        (fname.getText().isEmpty() || lname.getText().isEmpty()
            || em.getText().isEmpty()
            || utype.getSelectedIndex()==0
            || uname.getText().isEmpty()
                 || nu.getText().isEmpty()
            || password.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"All fields are required!"); //validation for register...

            return ;

        }else if (password.getText().length()< 8){
            JOptionPane.showMessageDialog(null," Password should contain atleast 8 character above!");
            password.setText("");
            return;}

        String email = this.em.getText();
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern patternEmail = Pattern.compile(emailRegex);
        Matcher matcherEmail = patternEmail.matcher(email);

        if (!matcherEmail.matches()) {
            JOptionPane.showMessageDialog(this, "Invalid email format. Please use a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            this.em.setText("");
            this.em.requestFocus();

        }

        else if(updateCheck()){
            System.out.println("Duplicate Exist!");
        }else{

            dbConnect dbc = new dbConnect();
            dbc.updateData("UPDATE accounts SET firstname='"+fname.getText()+"',lastname ='"+lname.getText()+"'"
                    + ",email ='"+em.getText()+"'"
                    + ",type ='"+utype.getSelectedItem()+"'"
                    + ",username ='"+uname.getText()+"'"
                    + ",contact ='"+nu.getText()+"'"
                    + ",status ='"+ustatus.getSelectedItem()+"'"
                    + ",u_image='"+destination+"' WHERE a_id = '"+u_id.getText()+"'  ");
            
            if (destination.isEmpty()){
                File existingFile = new File (oldpath);
               if(existingFile.exists()){
                   existingFile.delete();
               }
            }else{
                if(!(oldpath.equals(path))){
                    imageUpdater(oldpath,path);
                }
            }

            UsersForm uf= new UsersForm();
            uf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_u_updateActionPerformed

    private void u_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_deleteActionPerformed

    private void u_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_cancelActionPerformed
        UsersForm uf = new UsersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_u_cancelActionPerformed

    private void u_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_clearActionPerformed

    private void u_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_refreshActionPerformed

    private void u_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_idActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed

    }//GEN-LAST:event_emActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
       remove.setEnabled(false);
       select.setEnabled(true);
       image.setIcon(null);
       destination = "";
       path = "";
       
    }//GEN-LAST:event_removeActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }


        
    }//GEN-LAST:event_selectActionPerformed

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_selectMouseClicked

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
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel User_status;
    public javax.swing.JTextField em;
    private javax.swing.JLabel firstname;
    public javax.swing.JTextField fname;
    private javax.swing.JPanel header4;
    private javax.swing.JPanel header6;
    private javax.swing.JPanel header7;
    private javax.swing.JPanel header8;
    private javax.swing.JPanel header9;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jpanelEmail;
    private javax.swing.JLabel lastname;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField nu;
    public javax.swing.JPasswordField password;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JButton u_add;
    private javax.swing.JButton u_cancel;
    private javax.swing.JButton u_clear;
    private javax.swing.JButton u_delete;
    public javax.swing.JTextField u_id;
    private javax.swing.JButton u_refresh;
    public javax.swing.JButton u_update;
    private javax.swing.JLabel uid;
    public javax.swing.JTextField uname;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel username2;
    private javax.swing.JLabel usertype;
    public javax.swing.JComboBox<String> ustatus;
    public javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
