package com.kp.dto.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.kp.dto.CategoryTypeDto;
import com.kp.entity.CategoryType;

@Mapper(componentModel = "spring")
public interface CategoryTypeMapper {

    CategoryTypeDto categoryTypeToDto(CategoryType categoryType);
    CategoryType categoryTypeDtoToCategoryType(CategoryTypeDto categoryTypeDto);
    List<CategoryTypeDto> categoriesTypeToCategoriesTypeDto(List<CategoryType> categoriesType);
    List<CategoryType> categoriesTypeDtoToCategoriesType(List<CategoryTypeDto> categoriesTypeDto);
}
