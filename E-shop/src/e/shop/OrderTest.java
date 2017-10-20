/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.shop;

import eshop.interfaces.IOrder;
import eshop.models.Customer;
import eshop.models.Order;
import eshop.models.Product;
import eshop.services.OrderServices;
import java.util.Date;

/**
 *
 * @author Gold Solution
 */
public class OrderTest {

    public static void main(String[] args) {
       IOrder iorder =new OrderServices();
        
        
        Date date = new Date();

        Customer c = new Customer();
        Product p = new Product();
        Order or = new Order(45, 3, date, c, p,"en cours");
        System.out.println(or);
       // iorder.add(or);
          //  for (Order o : iorder.getAll()) {
          //  System.out.println(o);}
        
    }
}
