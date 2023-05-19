package com.kp.dto.mapper;

import com.kp.dto.CategoryTypeDto;
import com.kp.entity.CategoryType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface CategoryTypeMapper {
	@Mapping(source = "category", target = "categoryDto")
    CategoryTypeDto categoryTypeToDto(CategoryType categoryType);
	@Mapping(source = "categoryDto", target = "category")
    CategoryType categoryTypeDtoToCategoryType(CategoryTypeDto categoryTypeDto);
    List<CategoryTypeDto> categoriesTypeToCategoriesTypeDto(List<CategoryType> categoriesType);
    List<CategoryType> categoriesTypeDtoToCategoriesType(List<CategoryTypeDto> categoriesTypeDto);
}
