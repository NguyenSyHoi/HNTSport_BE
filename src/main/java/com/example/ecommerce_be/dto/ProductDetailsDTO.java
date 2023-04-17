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
    private String productCode;
    private String size;
    private Long quantity;
    private String note;
    private String image;
    private String status;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
}
