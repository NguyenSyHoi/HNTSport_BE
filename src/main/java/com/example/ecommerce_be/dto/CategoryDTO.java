package com.example.ecommerce_be.dto;

import com.example.ecommerce_be.entity.Product;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDTO {
    private Long id;

    private String categoryCode;

    private String categoryName;

    private String description;

    private String status;

    private Date createdDate;

    private Date updatedDate;

    private String createdBy;

    private String updatedBy;
}
