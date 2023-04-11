package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.ColorDTO;
import com.example.ecommerce_be.entity.Color;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ColorMapper {

    @Mapping(target = "productList",ignore = true)
    Color toColorDto(ColorDTO colorDTO);

    @Mapping(target = "productList",ignore = true)
    ColorDTO toEntityColor(Color color);

    List<ColorDTO> toListColorDTO(List<Color> colorList);
}
