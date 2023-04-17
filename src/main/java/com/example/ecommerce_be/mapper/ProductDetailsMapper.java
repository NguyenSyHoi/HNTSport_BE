package com.example.ecommerce_be.mapper;


import com.example.ecommerce_be.dto.ProductDetailsDTO;
import com.example.ecommerce_be.entity.ProductDetails;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface ProductDetailsMapper {
   // @Mapping(target = "code",source = "productCode")
    //@Mapping(target = "name",source = "productName")
    //@Mapping(target = "colors",ignore = true)
    ProductDetails toEntity(ProductDetailsDTO productDTO);

   // @Mapping(target = "productCode",source = "code")
    //@Mapping(target = "productName",source = "name")
    //@Mapping(target = "colors",qualifiedByName = "toColorDTO")
    ProductDetailsDTO toDto(ProductDetails product);

    List<ProductDetailsDTO> toDtos(List<ProductDetails> datas);

    //@Named(value = "toColorDTO")
    //default List<String> toColorDTO(List<Color> colorList){
     //   return colorList.stream().map(item-> item.getCode()).collect(Collectors.toList());
    //}

}
