package com.example.ecommerce_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Product_DTO implements Serializable {
    private Long id;
    private String productCode;
    private String productName;
    //private String categoryCode;
    private String description;
    private String brand;
    //private String status;
    private Long price;
    private String image;
    //@ManyToOne
    private CategoryDTO category;
//    private Date createdDate;
//    private Date updatedDate;
//    private String createdBy;
//    private String updatedBy;
}
