package com.example.ecommerce_be.service;

import com.example.ecommerce_be.dto.ProductDTO;
import com.example.ecommerce_be.entity.Product;
import com.example.ecommerce_be.payload.ProductPayloadSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {


    ProductDTO addNewProduct(ProductDTO productDTO);

    ProductDTO updateProduct (ProductDTO productDTO);

    ProductDTO getProductById(Long id);

    void deleteProduct(Long id);

    Page<ProductDTO> searchProduct(ProductPayloadSearch payloadSearch, Pageable pageable);
}
