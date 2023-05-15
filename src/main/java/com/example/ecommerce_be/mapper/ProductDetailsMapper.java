package com.example.ecommerce_be.mapper;


import com.example.ecommerce_be.dto.ProductDetailsDTO;
import com.example.ecommerce_be.entity.ProductDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface ProductDetailsMapper {
    @Mapping(target = "product",source = "product")
    ProductDetails toEntity(ProductDetailsDTO productDTO);
    @Mapping(target = "product",source = "product")
    ProductDetailsDTO toDto(ProductDetails product);

    List<ProductDetailsDTO> toDtos(List<ProductDetails> datas);

    //@Named(value = "toColorDTO")
    //default List<String> toColorDTO(List<Color> colorList){
     //   return colorList.stream().map(item-> item.getCode()).collect(Collectors.toList());
    //}

}
