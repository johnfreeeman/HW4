
package model;

public class Customers {
    
    private int customerID;
    private String customerName;
    private String emailAddr;
    private int age;
    private String favoriteBrand;

    public Customers() {
        this.customerID = 0;
        this.customerName = "";
        this.emailAddr = "";
        this.age = 0;
        this.favoriteBrand = "";
    }
    
    public Customers(int customerID, String customerName, String emailAddr, int age, String favoriteBrand) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.emailAddr = emailAddr;
        this.age = age;
        this.favoriteBrand = favoriteBrand;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteBrand() {
        return favoriteBrand;
    }

    public void setFavoriteBrand(String favoriteBrand) {
        this.favoriteBrand = favoriteBrand;
    }

    @Override
    public String toString() {
        return "Customers{" + "customerID=" + customerID + ", customerName=" + customerName + ", emailAddr=" + emailAddr + ", age=" + age + ", favoriteBrand=" + favoriteBrand + '}';
    }
    
    
    
}
