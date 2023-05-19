package com.kp.service;

import com.kp.entity.Product;
import com.kp.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }
    @Override
    public void addProduct(Product product) {
         repository.save(product);
    }

    @Override
    public List<Product> deleteProduct(Long productId) {
        repository.deleteById(productId);
        return getAllProducts();
    }

    @Override
    public List<Product> updateProduct(Product product) {
        repository.save(product);
        return getAllProducts();
    }

    @Override
    public Product getProduct(Long id) {
        Product product = repository.findById(id).get();
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
    	return repository.findAll();
    }
}
