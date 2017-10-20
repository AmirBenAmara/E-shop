/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.services;

import eshop.interfaces.ICustomer;
import eshop.models.Claim;
import eshop.models.Customer;
import eshop.models.Order;
import eshop.models.Product;
import eshop.technique.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public class CustomerServices implements ICustomer{
    
    Connection connection;

    public CustomerServices() {
        connection = DataSource.getInsatance().getConnection();
    }

    @Override
    public Customer findById(Customer c, String mail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer findByUserName(Customer c, String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Customer c) {
        String req = "insert into t_customer (customer Id,CustomerFirstName,cutomerLastName,customerMail,csutomerPhoneNumber,customerSex,customerAdress,cutomerCP,cutomerVille,customerUserName,customerPassword,customerPicturePath,customerRegistrationDate) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, c.getCustomerId());
            preparedStatement.setString(2, c.getCustomerFirstName());
            preparedStatement.setString(3, c.getCustomerLastName());
            preparedStatement.setString(4, c.getCustomerMail());
            preparedStatement.setInt(5, c.getCustomerPhoneNumber());
            preparedStatement.setString(6, c.getCustomerSex());
            preparedStatement.setString(7, c.getCustomerAdress());
            preparedStatement.setInt(8, c.getCustomerCP());
            preparedStatement.setString(9, c.getCustomerVille());
            preparedStatement.setString(10, c.getCustomerUserName());
            preparedStatement.setString(11, c.getCustomerPassword());
            preparedStatement.setString(12, c.getCustomerPicturePath());
            preparedStatement.setDate(13, (Date) c.getCustomerRegistrationDate());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer findById(Integer r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer findByMail(Customer c, String mail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getByProduct(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getByOrder(Order o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getByClaim(Claim c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> findByCodePostal(int codePostal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
