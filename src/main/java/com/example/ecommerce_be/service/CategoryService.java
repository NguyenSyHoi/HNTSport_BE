package com.example.ecommerce_be.service;

import com.example.ecommerce_be.dto.CategoryDTO;
import com.example.ecommerce_be.entity.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getListCategory();

    CategoryDTO addNewCategory(CategoryDTO categoryDTO);

   // void deleteCategory(Long id);
}
