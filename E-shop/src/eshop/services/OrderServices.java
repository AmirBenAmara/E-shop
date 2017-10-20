/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.services;

import eshop.interfaces.IOrder;
import eshop.models.Customer;
import eshop.models.Order;
import eshop.technique.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public class OrderServices implements IOrder {

    Connection connection;

    public OrderServices() {
        connection = DataSource.getInsatance().getConnection();
    }

    @Override
    public List<Order> findByOrderDate(Date orderDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> getByCustomer(Customer c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Order t) {
        String req = "insert into commande (id,id_product,quantity,id_customer,etat) values (?,?,?,?,?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, t.getOrderId());
            preparedStatement.setInt(2, t.getProduct().getProductId());
            preparedStatement.setInt(3, t.getOrderQuantity());
            preparedStatement.setInt(4, t.getCustomer().getCustomerId());
            preparedStatement.setString(5, t.getEtat());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

    @Override
    public Order findById(Integer id) {
        Order or = null;
        String req = "select * from commande where id =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                or = new Order( resultSet.getInt("id"),resultSet.getInt(1), resultSet.getDate(2),new CustomerServices().findById(resultSet.getInt(3)),new ProductServices().findById(resultSet.getInt(4)),resultSet.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return or;
    }

    @Override
    public List<Order> getAll() {
         List<Order> orders = new ArrayList<>();
          String req = "select * from commande";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Order or = new Order( resultSet.getInt("id"),resultSet.getInt(1), resultSet.getDate(2),new CustomerServices().findById(resultSet.getInt(3)),new ProductServices().findById(resultSet.getInt(4)),resultSet.getString(3));
                orders.add(or);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return orders;
         
    }

    @Override
    public void update(Order t) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Order t) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
