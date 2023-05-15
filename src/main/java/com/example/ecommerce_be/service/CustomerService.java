package com.example.ecommerce_be.service;

import com.example.ecommerce_be.dto.CustomerDTO;
import com.example.ecommerce_be.dto.Product_DTO;

import java.util.List;

public interface CustomerService {


    List<CustomerDTO> getListCustomer();
    CustomerDTO addNewCustomer(CustomerDTO customerDTO);

    //Product_DTO updateProduct (Product_DTO productDTO);

    //Product_DTO getProductById(Long id);

    //void deleteProduct(Long id);

    //Page<ProductDTO> searchProduct(ProductPayloadSearch payloadSearch, Pageable pageable);
}
