package com.ecomerce.dao;

import com.ecomerce.model.Product;

import java.util.List;

public interface productDao {

void addProduct(Product product);

List<Product> GetAll();

void DeleteProduct(String id);

Product GetProduct(String id);




}
