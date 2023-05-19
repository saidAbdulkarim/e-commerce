package com.kp.service;

import com.kp.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> deleteProduct(Long productId);
    List<Product> updateProduct(Product product);
    Product getProduct(Long productId);
    List<Product> getAllProducts();

}
