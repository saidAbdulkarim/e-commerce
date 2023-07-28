package com.kp.controller;

import com.kp.dto.CategoryDto;
import com.kp.dto.mapper.CategoryMapper;
import com.kp.entity.Category;
import com.kp.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {

	CategoryService service;
	CategoryMapper mapper;

	public CategoryController(CategoryService service, CategoryMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	@GetMapping
	public List<CategoryDto> getCategories() {
		List<Category> categories = service.findAll();
		return mapper.categoriesToDtos(categories);
	}

	@PostMapping
	public void addCategory(@RequestBody CategoryDto categoryDto) {
		Category category = mapper.categoryDtoToCategory(categoryDto);
		service.addCategory(category);
	}

	@PutMapping
	public void updateCategory(@RequestBody CategoryDto categoryDto) {
		Category category = mapper.categoryDtoToCategory(categoryDto);
		service.updateCategory(category);
	}

	@DeleteMapping("/{categoryId}")
	public void removeCategory(@PathVariable Long categoryId) {
		service.deleteCategory(categoryId);
	}
}
