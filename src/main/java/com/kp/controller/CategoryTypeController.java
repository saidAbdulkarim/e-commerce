package com.kp.controller;

import com.kp.dto.CategoryTypeDto;
import com.kp.dto.mapper.CategoryTypeMapper;
import com.kp.entity.CategoryType;
import com.kp.service.CategoryTypeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/categoryTypes")
public class CategoryTypeController {
    CategoryTypeService service;
    CategoryTypeMapper mapper;
    public CategoryTypeController(CategoryTypeService service, CategoryTypeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<CategoryTypeDto> getAll() {
        List<CategoryType> categoriesType = service.findAll();
        return mapper.categoriesTypeToCategoriesTypeDto(categoriesType) ;
    }
    @PostMapping
    public void addCategoryType(@RequestBody CategoryTypeDto categoryTypeDto){
        CategoryType categoryType = mapper.categoryTypeDtoToCategoryType(categoryTypeDto);
        service.addCategoryType(categoryType);
    }
    @PutMapping
    public void updateCategoryType(@RequestBody CategoryTypeDto categoryTypeDto){
        CategoryType categoryType = mapper.categoryTypeDtoToCategoryType(categoryTypeDto);
        service.updateCategoryType(categoryType);
    }
    @DeleteMapping("/{CategoryTypeId}")
    public void removeCategoryType(@PathVariable Long CategoryTypeId){
        service.deleteCategoryType(CategoryTypeId);
    }
}
