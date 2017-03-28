
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;

public class AddQuery {
    
    private Connection conn;
    
    public AddQuery(){
        
        try{
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doAdd (Customers customer){
        
        try {
            String query = "INSERT INTO customers (customerName, emailAddr, age, favoriteBrand) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, customer.getCustomerName());
            ps.setString(2, customer.getEmailAddr());
            ps.setInt(3, customer.getAge());    
            ps.setString(4, customer.getFavoriteBrand());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
