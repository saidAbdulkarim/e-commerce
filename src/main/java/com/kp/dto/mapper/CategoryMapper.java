package com.kp.dto.mapper;

import com.kp.dto.CategoryDto;
import com.kp.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto categoryToDto(Category category);
    Category categoryDtoToCategory(CategoryDto categoryDto);
    List<CategoryDto> categoriesToDtos(List<Category> categories);
    List<Category> categoryDtosToCategories(List<CategoryDto> categoryDtos);
}
