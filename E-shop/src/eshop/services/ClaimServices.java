/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.services;

import eshop.interfaces.IClaim;
import eshop.models.Claim;
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
public class ClaimServices implements IClaim {
    
    Connection connection;

    public ClaimServices() {
        connection = DataSource.getInsatance().getConnection();
    }

    @Override
    public Claim findByDateClaim(Date dateClaim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Claim c) {
        String req = "insert into claim (date,id_commande,text) values (?,?,?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setDate(1, c.getDate());
            preparedStatement.setInt(2, 1);
            preparedStatement.setString(3, c.getText());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override // à ne pas travailler, on ne peut pas mettre à jour une réclamation
    public void update(Claim c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Claim c) {
        String req = "delete from claim where id =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, c.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
     public void afficher() {
        String req = "select * from claim";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               //Claim c = new Claim(resultSet.getInt("id"), resultSet.getDate(2), resultSet.getDate("date"));
                System.out.println( resultSet.getInt("id") );
                System.out.println( resultSet.getDate("date") );

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public Claim findById(Integer id) {
    Claim c =null;
        String req = "select * from claim where id =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                c = new Claim( resultSet.getInt("id"),resultSet.getDate("date"), resultSet.getString("text"));
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return c;
    }

    @Override
    public List<Claim> getAll() {
        List<Claim> claims = new ArrayList<>();
        String req = "select * from claim";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(req);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Claim c = new Claim( resultSet.getInt("id"),resultSet.getDate("date"), resultSet.getString("text"));
                claims.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return claims;
    }

    @Override
    public List<Claim> getByCustomer(Customer c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
