package com.kp.service;

import com.kp.dto.CategoryDto;
import com.kp.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Long categoryId);
}
