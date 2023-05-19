package com.kp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CategoryTypeDto {
    private Long id;
    private String name;
    private CategoryDto categoryDto;

}
