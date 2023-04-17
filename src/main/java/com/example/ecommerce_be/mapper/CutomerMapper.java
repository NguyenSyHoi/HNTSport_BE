package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.CustomerDTO;
import com.example.ecommerce_be.dto.Product_DTO;
import com.example.ecommerce_be.entity.Customer;
import com.example.ecommerce_be.entity.Product_T;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface CutomerMapper {
    //@Mapping(target = "code",source = "productCode")
    //@Mapping(target = "name",source = "productName")
    //@Mapping(target = "colors",ignore = true)
    Customer toEntity(CustomerDTO customerDTO);

    //@Mapping(target = "productCode",source = "code")
    //@Mapping(target = "productName",source = "name")
    //@Mapping(target = "colors",qualifiedByName = "toColorDTO")
    CustomerDTO toDto(Customer customer);

    List<CustomerDTO> toDtos(List<Customer> datas);

   // @Named(value = "toColorDTO")
    //default List<String> toColorDTO(List<Color> colorList){
       // return colorList.stream().map(item-> item.getCode()).collect(Collectors.toList());
    //}

}
