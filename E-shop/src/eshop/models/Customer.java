/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.models;

import static java.sql.JDBCType.NULL;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public class Customer {
    private int customerId, customerPhoneNumber, customerCP;
    private String customerFirstName, customerLastName, customerSex, customerAdress, customerVille;
    private String customerMail, customerUserName, customerPassword,customerPicturePath;
    private Date customerRegistrationDate;
    private List<Product> productList;
    private List<Order> orderList;
    private List<Claim> claimList;
    private Cart panier;

    public Customer() {
    }

    public Customer(int customerId, int customerPhoneNumber, int customerCP, String customerFirstName, String customerLastName, String customerSex, String customerAdress, String customerVille, String customerMail, String customerUserName, String customerPassword, String customerPicturePath, Date customerRegistrationDate, Cart panier) {
        this.customerId = customerId;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerCP = customerCP;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerSex = customerSex;
        this.customerAdress = customerAdress;
        this.customerVille = customerVille;
        this.customerMail = customerMail;
        this.customerUserName = customerUserName;
        this.customerPassword = customerPassword;
        this.customerPicturePath = customerPicturePath;
        this.customerRegistrationDate = customerRegistrationDate;
        this.panier = panier;
    }
    
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public int getCustomerCP() {
        return customerCP;
    }

    public void setCustomerCP(int customerCP) {
        this.customerCP = customerCP;
    }

    public String getCustomerVille() {
        return customerVille;
    }

    public void setCustomerVille(String customerVille) {
        this.customerVille = customerVille;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerPicturePath() {
        return customerPicturePath;
    }

    public void setCustomerPicturePath(String customerPicturePath) {
        this.customerPicturePath = customerPicturePath;
    }

    public Date getCustomerRegistrationDate() {
        return customerRegistrationDate;
    }

    public void setCustomerRegistrationDate(Date customerRegistrationDate) {
        this.customerRegistrationDate = customerRegistrationDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Claim> getClaimList() {
        return claimList;
    }

    public void setClaimList(List<Claim> claimList) {
        this.claimList = claimList;
    }

    public Cart getPanier() {
        return panier;
    }

    public void setPanier(Cart panier) {
        this.panier = panier;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName + ", customerSex=" + customerSex + ", customerAdress=" + customerAdress + ", customerCP=" + customerCP + ", customerVille=" + customerVille + ", customerPhoneNumber=" + customerPhoneNumber + ", customerMail=" + customerMail + ", customerUserName=" + customerUserName + ", customerPassword=" + customerPassword + ", customerPicturePath=" + customerPicturePath + ", customerRegistrationDate=" + customerRegistrationDate + ", productList=" + productList + ", orderList=" + orderList + ", claimList=" + claimList + ", panier=" + panier + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    @Override
    public boolean equals(Object o){
      if(o==NULL) return false;
      if(o==this) return true;
      if(o instanceof Customer){
        final Customer c=(Customer)o;
        return customerId==c.customerId && customerMail.equals(c.customerMail) && customerPhoneNumber==c.customerPhoneNumber;
      }
        return false;
  }
            
}
