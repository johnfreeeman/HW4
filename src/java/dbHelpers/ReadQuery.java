
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;


public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
        
     
        try{
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void doRead(){
        
        try {
            String query = "Select * from customers";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLTable(){
        
        String table = "";
        table += "<table border=1>";
        
        try {
            while(this.results.next()){
                
                Customers customer = new Customers();
                customer.setCustomerID(this.results.getInt("customerID"));
                customer.setCustomerName(this.results.getString("customerName"));
                customer.setEmailAddr(this.results.getString("emailAddr"));
                customer.setAge(this.results.getInt("age"));
                customer.setFavoriteBrand(this.results.getString("favoriteBrand"));
                
                table += "<tr>";
                table += "<td>";
                table += customer.getCustomerID();
                table += "</td>";
                
                table += "<td>";
                table += customer.getCustomerName();
                table += "</td>";
                
                table += "<td>";
                table += customer.getEmailAddr();
                table += "</td>";
                
                table += "<td>";
                table += customer.getAge();
                table += "</td>";
                
                table += "<td>";
                table += customer.getFavoriteBrand();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=delete?customerID=" + customer.getCustomerID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        table += "</table>";
            
            return table;
        
    }
   
    
}
