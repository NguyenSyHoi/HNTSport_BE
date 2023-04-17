package com.example.ecommerce_be.entity;

import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "product_details")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String productCode;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private Long quantify;
    @Column(nullable = false)
    private String note;
    @Column(nullable = false)
    private String image;
    private String status;
    private Date createdDate;

    private Date updatedDate;

    private String createdBy;

    private String updatedBy;
}
