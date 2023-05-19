package com.kp.service;

import com.kp.entity.Category;
import com.kp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
    @Override
    public void addCategory(Category category) {
        repository.save(category);
    }
    @Override
    public void updateCategory(Category category) {
        repository.save(category);
    }
    @Override
    public void deleteCategory(Long categoryId) {
         repository.deleteById(categoryId);
    }
}
