package com.example.ecommerce_be.service.impl;

import com.example.ecommerce_be.base.NotFoundException;
import com.example.ecommerce_be.constants.Constants;
import com.example.ecommerce_be.constants.Status;
import com.example.ecommerce_be.dto.ProductDTO;
import com.example.ecommerce_be.dto.ProductDetailsDTO;
import com.example.ecommerce_be.dto.Product_DTO;
import com.example.ecommerce_be.entity.Category;
import com.example.ecommerce_be.entity.Color;
import com.example.ecommerce_be.entity.Product;
import com.example.ecommerce_be.entity.Product_T;
import com.example.ecommerce_be.mapper.ProductMapper;
import com.example.ecommerce_be.mapper.Product_Mapper;
import com.example.ecommerce_be.payload.ProductPayloadSearch;
import com.example.ecommerce_be.repositories.ColorRepository;
import com.example.ecommerce_be.repositories.ProductRepository;
import com.example.ecommerce_be.repositories.Product_Repository;
import com.example.ecommerce_be.service.ProductService;
import com.example.ecommerce_be.service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Product_Service_impl implements Product_Service {

    @Autowired
    private Product_Repository productRepository;

    @Autowired
    private Product_Mapper productMapper;

    //@Autowired
    //private ColorRepository colorRepository;
    @Override
    public List<Product_DTO> getListProducts() {
        return productMapper.toDtos(productRepository.getAllProduct());
    }

    @Override
    public List<Product_DTO> getListProductByCategory(Category category) {
        return productMapper.toDtos(productRepository.getAllProduct_ByCategory(category));
    }
    @Override
    public Product_DTO getProductById(Long id){
        return productMapper.toDto(productRepository.getProduct_ById(id).orElseThrow(() -> new NotFoundException("Product by id" + id + "not found")));
    }
    @Override
    public Product_DTO getProductByName(String productName){
        return productMapper.toDto(productRepository.getProduct_ByName(productName).orElseThrow(() -> new NotFoundException("Product by id" + productName + "not found")));
    }


    @Override
    @Transactional
    public Product_DTO addNewProduct(Product_DTO productDTO) {
        Product_T product = productMapper.toEntity(productDTO);
        product.setProductCode(productDTO.getProductCode());
        product.setProductName(productDTO.getProductName());
        product.setDescription(productDTO.getDescription());
        product.setBrand(productDTO.getBrand());
        //product.setCategory(productDTO.getCategory());
        product.setPrice(productDTO.getPrice());
        return productMapper.toDto(productRepository.save(product));
    }

    /*@Override
    @Transactional
    public Product_DTO updateProduct(Product_DTO productDTO) {
        Optional<Product_T> product = checkProduct(productDTO.getId());
        if (product.isPresent()) {
            return  productMapper.toDto(productRepository.save(productMapper.toEntity(productDTO)));

        } else {
            throw new NotFoundException("Product not found");
        }
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productMapper.toDto(productRepository.getProductById(id).orElseThrow(() -> new NotFoundException("Product by id" + id + "not found")));
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        Optional<Product> product = checkProduct(id);
        if (product.isPresent()) {
            productRepository.deleteProductById(id);
        } else {
            throw new NotFoundException("Product not found");
        }
    }

    @Override
    public Page<ProductDTO> searchProduct(ProductPayloadSearch payloadSearch, Pageable pageable) {
        if(payloadSearch.getColors() != null && payloadSearch.getColors().isEmpty()){
            payloadSearch.setColors(null);
        }
        return productRepository.searchProduct(payloadSearch.getFromPrice(),payloadSearch.getToPrice(),payloadSearch.getColors(),pageable).map(item -> productMapper.toDto(item));
    }

    public Optional<Product> checkProduct(Long id) {
        return productRepository.getProductById(id);
    }*/

}
