/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.models;

import java.util.Date;

/**
 *
 * @author Gold Solution
 */
public class Order {
    private int orderId,orderQuantity;
    private Date orderDate;
    private Customer customer;
    private Product product;
    private String etat;
    
    public Order(){
        
    }

    public Order(int orderId, int orderQuantity, Date orderDate, Customer customer, Product product, String etat) {
        this.orderId = orderId;
        this.orderQuantity = orderQuantity;
        this.orderDate = orderDate;
        this.customer = customer;
        this.product = product;
        this.etat = etat;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", orderQuantity=" + orderQuantity + ", orderDate=" + orderDate + ", customerid=" + customer.getCustomerId() + ", product=" + product.getProductId() + ", etat=" + etat + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (this.orderId != other.orderId) {
            return false;
        }
        return true;
    }

   
   
}
