package com.example.ecommerce_be.service.impl;

import com.example.ecommerce_be.constants.Status;
import com.example.ecommerce_be.dto.CustomerDTO;
import com.example.ecommerce_be.dto.Product_DTO;
import com.example.ecommerce_be.entity.Customer;
import com.example.ecommerce_be.entity.Product_T;
import com.example.ecommerce_be.mapper.CutomerMapper;
import com.example.ecommerce_be.mapper.Product_Mapper;
import com.example.ecommerce_be.repositories.CustomerRepository;
import com.example.ecommerce_be.repositories.Product_Repository;
import com.example.ecommerce_be.service.CustomerService;
import com.example.ecommerce_be.service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService_impl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CutomerMapper cutomerMapper;

    //@Autowired
    //private ColorRepository colorRepository;
    @Override
    public List<CustomerDTO> getListCustomer() {
        return cutomerMapper.toDtos(customerRepository.getAllCustomer());
    }


    @Override
    @Transactional
    public CustomerDTO addNewCustomer(CustomerDTO customerDTO) {
        Customer customer = cutomerMapper.toEntity(customerDTO);
        customer.setName(customerDTO.getName());
        customer.setPhone(customerDTO.getPhone());
        customer.setAndress(customerDTO.getAndress());
        customer.setEmail(customerDTO.getEmail());
        return cutomerMapper.toDto(customerRepository.save(customer));

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
