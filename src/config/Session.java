/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author CYBER SECURITY
 */
public class Session {
    private static Session instance;
    private int a_id;
    private String firstame;
    private String lastnmae;
    private String email;
    private String type;
    private String username;
    private String status;     
    private String contact;
            private String password;
            private String sq;
            private String ans;
              private String adoption_id;
            private String p_id;
            private String date;
              
    
    
    private Session(){
     // privatecon. prevent instance
        
    }

    public String getAdoption_id() {
        return adoption_id;
    }

    public void setAdoption_id(String adoption_id) {
        this.adoption_id = adoption_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
     
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
    
    
    
    public static synchronized Session getInstance() {
        if (instance == null){
            instance = new Session();
        }
        return instance;
    }

    public static boolean isInstanceEEmpty() {
       return instance == null;
    }
      public int getA_id() {
        return a_id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
  
    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getFirstame() {
        return firstame;
    }

    public void setFirstame(String firstame) {
        this.firstame = firstame;
    }

    public String getLastnmae() {
        return lastnmae;
    }

    public void setLastnmae(String lastnmae) {
        this.lastnmae = lastnmae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String usernmae) {
        this.username = usernmae;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
