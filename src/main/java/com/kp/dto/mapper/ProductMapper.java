package com.kp.dto.mapper;

import com.kp.dto.ProductDto;
import com.kp.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = CategoryTypeMapper.class)
public interface ProductMapper {
    @Mapping(source = "categoryType", target = "categoryTypeDto")
    ProductDto productToDto(Product product);
    @Mapping(source = "categoryTypeDto", target = "categoryType")
    Product DtoToProduct(ProductDto productDto);
    List<ProductDto> productsToDto(List<Product> products);
    List<Product> dtosToProducts(List<ProductDto> products);
}
