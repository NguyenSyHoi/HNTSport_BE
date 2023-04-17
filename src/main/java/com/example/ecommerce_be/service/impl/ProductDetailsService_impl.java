package com.example.ecommerce_be.service.impl;

import com.example.ecommerce_be.constants.Status;
import com.example.ecommerce_be.dto.ProductDetailsDTO;
import com.example.ecommerce_be.entity.ProductDetails;
import com.example.ecommerce_be.mapper.ProductDetailsMapper;
import com.example.ecommerce_be.repositories.ProductDetailsRepository;
import com.example.ecommerce_be.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class ProductDetailsService_impl implements ProductDetailsService {

    @Autowired
    private ProductDetailsRepository productRepository;

    @Autowired
    private ProductDetailsMapper productMapper;

    //@Autowired
    //private ColorRepository colorRepository;
    @Override
    public List<ProductDetailsDTO> getListProductDetails() {
        return productMapper.toDtos(productRepository.getAllProductDetails());
    }


    @Override
    @Transactional
    public ProductDetailsDTO addNewProduct(ProductDetailsDTO productDTO) {
        ProductDetails product = productMapper.toEntity(productDTO);
        product.setProductCode(productDTO.getProductCode());
        product.setSize(productDTO.getSize());
        product.setQuantify(productDTO.getQuantity());
        product.setNote(productDTO.getNote());
        product.setImage(productDTO.getImage());
        product.setStatus(String.valueOf(Status.NEW));
        product.setCreatedDate(new Date());
        product.setUpdatedDate(new Date());
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
