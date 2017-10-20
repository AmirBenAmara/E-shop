/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.interfaces;

import eshop.models.Claim;
import eshop.models.Customer;
import eshop.models.Order;
import eshop.models.Product;
import java.util.List;

/**
 *
 * @author Gold Solution
 */
public interface ICustomer extends IService<Customer,Integer>{
    Customer findById(Customer c, String mail);
    Customer findByUserName(Customer c, String userName);
    Customer findByMail(Customer c, String mail);
    List<Customer> getByProduct(Product p);
    Customer getByOrder(Order o);
    Customer getByClaim(Claim c);
    List<Customer> findByCodePostal(int codePostal);

}
