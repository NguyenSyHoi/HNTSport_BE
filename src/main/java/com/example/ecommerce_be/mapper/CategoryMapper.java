package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.CategoryDTO;
import com.example.ecommerce_be.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface CategoryMapper {

    Category toEntity(CategoryDTO categoryDTO);

    CategoryDTO toDto(Category category);

    List<CategoryDTO> toListDto(List<Category> categories);
}
