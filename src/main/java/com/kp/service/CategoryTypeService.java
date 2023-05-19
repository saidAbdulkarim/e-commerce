package com.kp.service;

import com.kp.dto.CategoryTypeDto;
import com.kp.entity.CategoryType;


import java.util.List;

public interface CategoryTypeService {
    List<CategoryType> findAll();
    void addCategoryType(CategoryType categoryType);
    void updateCategoryType(CategoryType categoryType);
    void deleteCategoryType(Long CategoryTypeId);
}
