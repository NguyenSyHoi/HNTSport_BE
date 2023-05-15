package com.example.ecommerce_be.service;

import com.example.ecommerce_be.dto.ProductDTO;
import com.example.ecommerce_be.dto.ProductDetailsDTO;
import com.example.ecommerce_be.entity.ProductDetails;
import com.example.ecommerce_be.entity.Product_T;
import com.example.ecommerce_be.payload.ProductPayloadSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductDetailsService {


    //@Autowired
    //private ColorRepository colorRepository;
    List<ProductDetailsDTO> getListProductDetails();
    ProductDetailsDTO getBySize(Product_T product, String size);

    ProductDetailsDTO addNewProduct(ProductDetailsDTO productDTO);
    //List<ProductDetailsDTO> getListProductDetails(ProductDetailsDTO productDetailsDTO);
    //ProductDTO updateProduct (ProductDTO productDTO);

    //ProductDTO getProductById(Long id);

    //void deleteProduct(Long id);

    //Page<ProductDTO> searchProduct(ProductPayloadSearch payloadSearch, Pageable pageable);
}
