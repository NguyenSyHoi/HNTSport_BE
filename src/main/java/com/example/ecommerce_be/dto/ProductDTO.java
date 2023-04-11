package com.example.ecommerce_be.dto;

import com.example.ecommerce_be.entity.Color;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO implements Serializable {
    private Long id;
    private String productCode;
    private String productName;
    private String description;
    private String status;
    private List<String> colors;
    private Long price;
    private Integer isActive;
    private String image;
    private String image_overlay;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
}
