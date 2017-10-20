/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.services;

import eshop.interfaces.ICart;
import eshop.models.Cart;
import eshop.technique.DataSource;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public class CartServices implements ICart{
    
    Connection connection;

    public CartServices() {
        connection = DataSource.getInsatance().getConnection();
    }

    @Override // l'ajout du panier se fait automatiquement en ajoutant un customer; chaque customer possède un seul panier dédié pour lui
    public void add(Cart t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override // c'est pour la mise à jour des produit qui se trouvent dans le panier
    public void update(Cart t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override // à ne pas travailler on ne pas supprimer un panier
    public void remove(Cart t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override // à ne pas travailler
    public Cart findById(Integer r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override // à ne pas travailler
    public List<Cart> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
