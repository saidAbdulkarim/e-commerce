package com.kp.dto.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.kp.dto.ProductDto;
import com.kp.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
 
    ProductDto productToDto(Product product);
    Product DtoToProduct(ProductDto productDto);
    List<ProductDto> productsToDto(List<Product> products);
    List<Product> dtosToProducts(List<ProductDto> products);
}
