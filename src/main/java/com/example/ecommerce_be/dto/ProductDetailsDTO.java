package com.example.ecommerce_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProductDetailsDTO {
    private Long id;
    private String size;
    private Long quantify;
   // private String note;
    private String image;
    private Product_DTO product;
    //private String status;
}
