/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.models;

import static java.sql.JDBCType.NULL;

/**
 *
 * @author Gold Solution
 */
public class Product {
    private int productId, productStock;
    private String productDescption, productDesignation, productPicturePath,productBrand, productColor;
    private double productprice;

    public Product() {
    }

    public Product(int productId, int productStock, String productDescption, String productDesignation, String productPicturePath, String productBrand, String productColor, double productprice) {
        this.productId = productId;
        this.productStock = productStock;
        this.productDescption = productDescption;
        this.productDesignation = productDesignation;
        this.productPicturePath = productPicturePath;
        this.productBrand = productBrand;
        this.productColor = productColor;
        this.productprice = productprice;
    }
    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductDescption() {
        return productDescption;
    }

    public void setProductDescption(String productDescption) {
        this.productDescption = productDescption;
    }

    public String getProductDesignation() {
        return productDesignation;
    }

    public void setProductDesignation(String productDesignation) {
        this.productDesignation = productDesignation;
    }

    public String getProductPicturePath() {
        return productPicturePath;
    }

    public void setProductPicturePath(String productPicturePath) {
        this.productPicturePath = productPicturePath;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productStock=" + productStock + ", productDescption=" + productDescption + ", productDesignation=" + productDesignation + ", productPicturePath=" + productPicturePath + ", productBrand=" + productBrand + ", productColor=" + productColor + ", productprice=" + productprice + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object o){
      if(o==NULL) return false;
      if(o==this) return true;
      if(o instanceof Product){
        final Product p=(Product)o;
        return productId==p.productId;
      }
      return false;
    }
  
    
    
    
}
