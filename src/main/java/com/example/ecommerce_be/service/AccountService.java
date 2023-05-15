package com.example.ecommerce_be.service;

import com.example.ecommerce_be.dto.AccountDTO;
import com.example.ecommerce_be.dto.CustomerDTO;

import java.util.List;

public interface AccountService {


    List<AccountDTO> getListAccount();
    AccountDTO addNewAccount(AccountDTO accountDTO);

    //Product_DTO updateProduct (Product_DTO productDTO);

    //Product_DTO getProductById(Long id);

    //void deleteProduct(Long id);

    //Page<ProductDTO> searchProduct(ProductPayloadSearch payloadSearch, Pageable pageable);
}
