/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.services;

import eshop.interfaces.ICatalog;
import eshop.models.Catalog;
import eshop.technique.DataSource;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public class CatalogServices implements ICatalog{
    
    Connection connection;

    public CatalogServices() {
        connection = DataSource.getInsatance().getConnection();
    }

    @Override // il faut prendre en considération que l'attribut nameCatalog est unique 
    public Catalog findByNameCatalog(String nameCatalog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Catalog t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Catalog t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Catalog t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Catalog findById(Integer r) { // rechercher le catalogue par la référence = IdCatalog
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Catalog> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
