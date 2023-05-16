package com.example.ecommerce_be.service;

import com.example.ecommerce_be.dto.AccountDTO;
import com.example.ecommerce_be.dto.CustomerDTO;
import com.example.ecommerce_be.entity.Account;

import javax.transaction.Transactional;
import java.util.List;

public interface AccountService {


    List<AccountDTO> getListAccount();
    @Transactional
    AccountDTO addNewAccount(AccountDTO accountDTO);

    boolean checkLogin(String username, String password);


    //Product_DTO updateProduct (Product_DTO productDTO);

    //Product_DTO getProductById(Long id);

    //void deleteProduct(Long id);

    //Page<ProductDTO> searchProduct(ProductPayloadSearch payloadSearch, Pageable pageable);
}
