package com.kp.controller;

import com.kp.dto.ProductDto;
import com.kp.dto.mapper.ProductMapper;
import com.kp.entity.Product;
import com.kp.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

    ProductService service;
    ProductMapper mapper;

    public ProductController(ProductService service, ProductMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto productDto) {
        Product product = mapper.DtoToProduct(productDto);
        service.addProduct(product);
    }

    @GetMapping
    public List<ProductDto> getProducts() {
    	List<Product> products = service.getAllProducts();
        return mapper.productsToDto(products) ;
    }
    @PutMapping("/{productId}")
    public List<ProductDto> updateProduct(@RequestBody ProductDto productDto) {
    	Product product = mapper.DtoToProduct(productDto);
    	List<Product> products = service.updateProduct(product);
      return mapper.productsToDto(products);
    }
    @DeleteMapping("/{productId}")
    public List<ProductDto> deleteProduct(@PathVariable Long productId) {
        List<Product> products =  service.deleteProduct(productId);
        return mapper.productsToDto(products);
    }
}
