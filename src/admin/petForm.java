/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import Config.Logs;
import config.Session;
import config.dbConnect;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.red;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author CYBER SECURITY
 */
public class petForm extends javax.swing.JFrame {
     
    /**
     * Creates new form adminDashboard
     */ 
       

    public petForm() {
        initComponents();
         this.setLocationRelativeTo(null); // Make Jframe Center allighnment
        displayData();
       
        
    } 
    
      boolean checkadd = true;
                  
       Color nc=new Color( 0,10,48);
       Color hc=new Color(0,152,153);
       
        void displayData(){
        try{
            dbConnect dbc = new dbConnect();
            ResultSet rst = dbc.getData("SELECT p_id, p_type, p_status FROM pet");
            ptable.setModel(DbUtils.resultSetToTableModel(rst));
             rst.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

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

        header = new javax.swing.JPanel();
        Uback = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ptable = new javax.swing.JTable();
        header6 = new javax.swing.JPanel();
        U_id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        U_id2 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        addlabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        addlabel3 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        addlabel2 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        addlabel = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        username1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        ptype = new javax.swing.JComboBox<>();
        User_status = new javax.swing.JLabel();
        pstatus = new javax.swing.JComboBox<>();
        header8 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        pprice = new javax.swing.JTextField();
        header1 = new javax.swing.JPanel();

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        Uback.setBackground(new java.awt.Color(126, 200, 227));
        Uback.setForeground(new java.awt.Color(5, 92, 157));
        Uback.setPreferredSize(new java.awt.Dimension(760, 60));
        Uback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BACK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Uback.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 60, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("PET FORM");
        Uback.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 60));

        getContentPane().add(Uback);
        Uback.setBounds(0, 0, 760, 60);

        body.setBackground(new java.awt.Color(0, 10, 48));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ptable);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 320, 400));

        header6.setBackground(new java.awt.Color(0, 152, 153));
        header6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        U_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        U_id.setForeground(new java.awt.Color(255, 255, 255));
        U_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U_id.setText("ID");
        U_id.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        U_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U_idMouseClicked(evt);
            }
        });
        header6.add(U_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-removebg-preview (1).png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        U_id2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        U_id2.setForeground(new java.awt.Color(255, 255, 255));
        U_id2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U_id2.setText("Current User ID");
        U_id2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        U_id2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U_id2MouseClicked(evt);
            }
        });
        header6.add(U_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, 40));

        clear.setBackground(new java.awt.Color(0, 152, 153));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addlabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addlabel1.setForeground(new java.awt.Color(255, 255, 255));
        addlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addlabel1.setText("CLEAR");
        addlabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addlabel1MouseClicked(evt);
            }
        });
        clear.add(addlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, 10));

        header6.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 130, 40));

        delete.setBackground(new java.awt.Color(0, 152, 153));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addlabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addlabel3.setForeground(new java.awt.Color(255, 255, 255));
        addlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addlabel3.setText("DELETE");
        addlabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addlabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addlabel3MouseClicked(evt);
            }
        });
        delete.add(addlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 10));

        header6.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 130, 40));

        update.setBackground(new java.awt.Color(0, 152, 153));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addlabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addlabel2.setForeground(new java.awt.Color(255, 255, 255));
        addlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addlabel2.setText("UPDATE");
        addlabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addlabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addlabel2MouseClicked(evt);
            }
        });
        update.add(addlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 10));

        header6.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 130, 40));

        add.setBackground(new java.awt.Color(0, 152, 153));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addlabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addlabel.setForeground(new java.awt.Color(255, 255, 255));
        addlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addlabel.setText("ADD");
        addlabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addlabelMouseClicked(evt);
            }
        });
        add.add(addlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 10));

        header6.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 130, 40));

        body.add(header6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 420));

        uid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uid.setForeground(new java.awt.Color(255, 255, 255));
        uid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uid.setText("Pet id:");
        body.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 90, 30));

        pid.setBackground(new java.awt.Color(204, 204, 204));
        pid.setEnabled(false);
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        body.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 160, 30));

        username1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username1.setText("Price:");
        body.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 90, 30));

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("Type:");
        body.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 90, 30));

        ptype.setBackground(new java.awt.Color(204, 204, 204));
        ptype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Dog", " ", "German Dog", "Austillian Dog", "Bulldog", "Labrador Retriever", "Golden Retriever", "Beagle", "Poodle", "Chihuahua" }));
        body.add(ptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 160, 30));

        User_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        User_status.setForeground(new java.awt.Color(255, 255, 255));
        User_status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User_status.setText("User Status:");
        body.add(User_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 120, 30));

        pstatus.setBackground(new java.awt.Color(204, 204, 204));
        pstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available \t", "Out of Stocks" }));
        pstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pstatusActionPerformed(evt);
            }
        });
        body.add(pstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 160, 30));

        header8.setBackground(new java.awt.Color(0,0,0,60));
        header8.setLayout(null);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        header8.add(image);
        image.setBounds(30, 10, 240, 180);

        body.add(header8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 280, 200));

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
        body.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 110, 40));

        remove.setBackground(new java.awt.Color(0, 204, 255));
        remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        body.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 110, 40));

        pprice.setBackground(new java.awt.Color(204, 204, 204));
        pprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppriceActionPerformed(evt);
            }
        });
        body.add(pprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 160, 30));

        getContentPane().add(body);
        body.setBounds(0, 60, 760, 420);

        header1.setBackground(new java.awt.Color(204, 204, 204));
        header1.setLayout(null);
        getContentPane().add(header1);
        header1.setBounds(0, 0, 760, 50);

        setSize(new java.awt.Dimension(770, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
           
      
        AdminDashboard adb = new AdminDashboard();
        adb.setVisible(true);
        this.dispose();
    
             
    }//GEN-LAST:event_jLabel1MouseClicked

    private void U_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_U_idMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
         Session ses = Session.getInstance(); 
        U_id.setText(""+ses.getA_id());
        
    }//GEN-LAST:event_formWindowActivated

    private void addlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addlabelMouseClicked
        
    }//GEN-LAST:event_addlabelMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        
        
       
        
        add.setBackground(nc);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(hc);
    }//GEN-LAST:event_addMouseExited

    private void U_id2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U_id2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_U_id2MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if (checkadd){
            
            if(pprice.getText().isEmpty() || ptype.getSelectedIndex()==0){
             JOptionPane.showMessageDialog(null,"All fields are required!");
            }else{
                dbConnect dbc=new dbConnect();
                dbc.insertData("INSERT INTO pet (p_type , p_price, p_status,p_image)VALUES ('"+ptype.getSelectedItem()+"', '"+pprice.getText()+"','"+pstatus.getSelectedItem()+"','') ");
                 JOptionPane.showMessageDialog(null,"Added Successfully!");
                   Logs.logFunctionCall("Admin Added pet with ID: " );  
                 displayData();
                    checkadd=true; 
                 addlabel.setForeground(black);
                pid.setText("");
                pprice.setText("");
                ptype.setSelectedItem("");
                pstatus.setSelectedIndex(0);
                 
            }    
        }else{
            JOptionPane.showMessageDialog(null,"clear up all fields!");
        }
         
        
        
    }//GEN-LAST:event_addMouseClicked

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void pstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pstatusActionPerformed

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_selectMouseClicked

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed

      
    }//GEN-LAST:event_selectActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
       
    }//GEN-LAST:event_removeActionPerformed

    private void ptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptableMouseClicked
         
            int rowIndex  = ptable.getSelectedRow();
           if(rowIndex < 0){
               JOptionPane.showMessageDialog(null,"Please Select Item!");
           }else{
               
               try{
               dbConnect dbc = new dbConnect();
                 TableModel tbl= ptable.getModel();
              ResultSet rs=dbc.getData("SELECT * FROM pet WHERE p_id ='"+tbl.getValueAt(rowIndex, 0)+"'"); 
            if(rs.next()){  
                 
              pid.setText(""+rs.getInt("p_id"));
              pprice.setText(""+rs.getString("p_price"));
              ptype.setSelectedItem(""+rs.getString("p_type"));
              pstatus.setSelectedItem(""+rs.getString("p_status"));
            
                add.setEnabled(false);
                addlabel.setForeground(red);
                 checkadd=false;
               }
               }catch(SQLException ex){
                   System.out.println("Connection Error!"+ex);
               }
               
           }
       
        
    }//GEN-LAST:event_ptableMouseClicked

    private void addlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addlabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addlabel1MouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
          
            checkadd=true; 
            addlabel.setForeground(black);
              pid.setText("");
              pprice.setText("");
              ptype.setSelectedItem("");
              pstatus.setSelectedIndex(0);
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
  
             clear.setBackground(nc);
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
           clear.setBackground(hc);
    }//GEN-LAST:event_clearMouseExited

    private void ppriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppriceActionPerformed

    private void addlabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addlabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addlabel2MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
            
                    if(pid.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please select a pet first!");
    }else{
                    if(pprice.getText().isEmpty() || ptype.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(null,"All fields are required!");
            }else{
                   dbConnect dbc = new dbConnect();
                   dbc.updateData("UPDATE pet SET p_type = '"+ptype.getSelectedItem()+"', p_price = '"+pprice.getText()+"'"
                    + ",p_status = '"+pstatus.getSelectedItem()+"' WHERE p_id = '"+pid.getText()+"'  ");
                   JOptionPane.showMessageDialog(null,"Updated Successfully!");
                    Logs.logFunctionCall("Admin Updated a pet with ID: "+ptype );  
                     displayData();
                    checkadd=true; 
                    addlabel.setForeground(black);
                    pid.setText("");
                    pprice.setText("");
                    ptype.setSelectedItem("");
                    pstatus.setSelectedIndex(0);
             }
            
        }
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
      
         update.setBackground(nc);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
         update.setBackground(hc);
    }//GEN-LAST:event_updateMouseExited

    private void addlabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addlabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addlabel3MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       String idToDeleteString = pid.getText().trim(); // Use pid.getText() since this is petForm

    if (idToDeleteString.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a pet to delete.", "Input Required", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int idToDelete;
    try {
        idToDelete = Integer.parseInt(idToDeleteString);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid ID format. Please select a valid pet.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Removed the confirmation dialog as requested

    dbConnect db = new dbConnect();
    java.sql.Connection connection = null;
    PreparedStatement pstmt = null;

    try {
        connection = db.getConnection();

        if (connection == null || connection.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is not available.", "Database Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

         
        String sql = "DELETE FROM pet WHERE p_id = ?";

        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, idToDelete);

        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Pet with ID " + idToDelete + " deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            Logs.logFunctionCall("Admin deleted pet with ID: " + idToDelete);  

             
            pid.setText("");
            pprice.setText("");
            ptype.setSelectedIndex(0);
            pstatus.setSelectedIndex(0);
            
            displayData();  

        } else {
            JOptionPane.showMessageDialog(this, "No pet found with ID " + idToDelete + " or deletion failed.", "Deletion Failed", JOptionPane.WARNING_MESSAGE);
        }

    } catch (SQLException e) {
        System.err.println("SQL Error during pet deletion: " + e.getMessage());
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();  
            }
        } catch (SQLException e) {
            System.err.println("Error closing resources: " + e.getMessage());
        }
    }
        
        
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
          delete.setBackground(nc);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(hc);
    }//GEN-LAST:event_deleteMouseExited

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
            java.util.logging.Logger.getLogger(petForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel U_id;
    private javax.swing.JLabel U_id2;
    private javax.swing.JPanel Uback;
    private javax.swing.JLabel User_status;
    private javax.swing.JPanel add;
    private javax.swing.JLabel addlabel;
    private javax.swing.JLabel addlabel1;
    private javax.swing.JLabel addlabel2;
    private javax.swing.JLabel addlabel3;
    private javax.swing.JPanel body;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header6;
    private javax.swing.JPanel header8;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField pid;
    public javax.swing.JTextField pprice;
    public javax.swing.JComboBox<String> pstatus;
    private javax.swing.JTable ptable;
    public javax.swing.JComboBox<String> ptype;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    private javax.swing.JLabel uid;
    private javax.swing.JPanel update;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
}
