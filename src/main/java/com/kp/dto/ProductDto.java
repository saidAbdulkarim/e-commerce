package com.kp.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private CategoryTypeDto categoryTypeDto;
}
