package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.ProductDTO;
import com.example.ecommerce_be.dto.Product_DTO;
import com.example.ecommerce_be.entity.Color;
import com.example.ecommerce_be.entity.Product;
import com.example.ecommerce_be.entity.Product_T;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface Product_Mapper {
    @Mapping(target = "code",source = "productCode")
    @Mapping(target = "name",source = "productName")
    //@Mapping(target = "colors",ignore = true)
    Product_T toEntity(Product_DTO productDTO);

    @Mapping(target = "productCode",source = "code")
    @Mapping(target = "productName",source = "name")
    //@Mapping(target = "colors",qualifiedByName = "toColorDTO")
    Product_DTO toDto(Product_T product);

    List<Product_DTO> toDtos(List<Product_T> datas);

   // @Named(value = "toColorDTO")
    //default List<String> toColorDTO(List<Color> colorList){
       // return colorList.stream().map(item-> item.getCode()).collect(Collectors.toList());
    //}

}
