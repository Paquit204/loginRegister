/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CYBER SECURITY
 */
public class dbConnect {

    
          
    private Connection connect;
             public Connection getConnection() {
        return connect;
    }
       
       // constructor to connect to our database
        public dbConnect(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_Adoption", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
        
           
    
         
          //Function to save data
        public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }
    
      //Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
         //Function to update data
        public boolean updateData(String sql){ // Changed from 'public void updateData(String sql)'
        PreparedStatement pst = null;
        try{
            pst = connect.prepareStatement(sql);
            int rowsAffected = pst.executeUpdate();
             
            return rowsAffected > 0;  
        }catch(SQLException ex){
            System.out.println("Error executing update in dbConnect: "+ex.getMessage());  
            
            return false;  
        } finally {
            try {
                if (pst != null) pst.close();
            } catch (SQLException e) {
                System.out.println("Error closing PreparedStatement: " + e.getMessage());
            }
        }
    }

       public void closeConnection() {
        if (connect != null) {
            try {
                connect.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
                e.printStackTrace();
            }
        }
       }
}
