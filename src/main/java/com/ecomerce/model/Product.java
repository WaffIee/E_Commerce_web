package com.ecomerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by bajjouk wafaa on 16/5/2021.
 */
@Entity
public class Product {

    @Id
    // @Id for importing primary key on the table

    @GeneratedValue(strategy= GenerationType.AUTO)
    // Generated value tells the system that when you create a new instance any persist to the data base , the product ID will be generated
    private String productId;
    private String productName;
    private String productCategory;
    private String productDescription;
    private double productPrice;
    private String productCondition;
    private int unitInStock;

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }



    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }


}
