/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.interfaces;

import eshop.models.Catalog;
import eshop.models.Category;
import eshop.models.Customer;
import eshop.models.Product;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public interface IProduct extends IService<Product,Integer>{
    List<Product> getByCustomer(Customer user);
    List<Product> getByCatalog(Catalog catalogue);
    List<Product> getByCategory(Category categorie);
    
}
