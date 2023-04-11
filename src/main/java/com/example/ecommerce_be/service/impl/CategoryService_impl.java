package com.example.ecommerce_be.service.impl;

import com.example.ecommerce_be.base.NotFoundException;
import com.example.ecommerce_be.constants.Constants;
import com.example.ecommerce_be.constants.Status;
import com.example.ecommerce_be.dto.CategoryDTO;
import com.example.ecommerce_be.entity.Category;
import com.example.ecommerce_be.entity.Product;
import com.example.ecommerce_be.mapper.CategoryMapper;
import com.example.ecommerce_be.repositories.CategoryRepository;
import com.example.ecommerce_be.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService_impl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDTO> getListCategory() {
        return categoryMapper.toListDto(categoryRepository.getAllCategory());
    }

    @Override
    @Transactional
    public CategoryDTO addNewCategory(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toEntity(categoryDTO);
        category.setCategoryCode(categoryDTO.getCategoryCode());
        category.setCategoryName(categoryDTO.getCategoryName());
        category.setDescription(categoryDTO.getDescription());
        category.setStatus(String.valueOf(Constants.ACTIVE));
        category.setCreatedDate(new Date());
        category.setUpdatedDate(new Date());
        return categoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    public void deleteCategory(Long id) {
        Optional<Category> category = checkExistCategory(id);
        if (category.isPresent()) {
            categoryRepository.deleteCategoryById(id);
        } else {
            throw new NotFoundException("Category not found");
        }
    }


    public Optional<Category> checkExistCategory(Long id) {
        return categoryRepository.getCategoryById(id);
    }
}
