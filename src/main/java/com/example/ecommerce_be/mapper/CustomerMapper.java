package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.CategoryDTO;
import com.example.ecommerce_be.dto.CustomerDTO;
import com.example.ecommerce_be.entity.Category;
import com.example.ecommerce_be.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerDTO customerDTO);

    CustomerDTO toDto(Customer customer);

    List<CustomerDTO> toListDto(List<Customer> customers);
}
