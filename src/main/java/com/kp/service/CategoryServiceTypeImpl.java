package com.kp.service;

import com.kp.entity.CategoryType;
import com.kp.repository.CategoryTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceTypeImpl implements CategoryTypeService{

    CategoryTypeRepository repository;
    public CategoryServiceTypeImpl(CategoryTypeRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<CategoryType> findAll() {
        return repository.findAll();
    }

    @Override
    public void addCategoryType(CategoryType categoryType) {
        repository.save(categoryType);
    }

    @Override
    public void updateCategoryType(CategoryType categoryType) {
          repository.save(categoryType);
    }

    @Override
    public void deleteCategoryType(Long CategoryTypeId) {
       repository.deleteById(CategoryTypeId);
    }
}
