package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.ProductDTO;
import com.example.ecommerce_be.entity.Color;
import com.example.ecommerce_be.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface ProductMapper {
    @Mapping(target = "code",source = "productCode")
    @Mapping(target = "name",source = "productName")
    @Mapping(target = "colors",ignore = true)
    Product toEntity(ProductDTO productDTO);

    @Mapping(target = "productCode",source = "code")
    @Mapping(target = "productName",source = "name")
    @Mapping(target = "colors",qualifiedByName = "toColorDTO")
    ProductDTO toDto(Product product);

    List<ProductDTO> toDtos(List<Product> datas);

    @Named(value = "toColorDTO")
    default List<String> toColorDTO(List<Color> colorList){
        return colorList.stream().map(item-> item.getCode()).collect(Collectors.toList());
    }

}
