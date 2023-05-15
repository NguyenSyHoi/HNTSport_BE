package com.example.ecommerce_be.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Table(name = "category")
@Entity
@NoArgsConstructor
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String categoryCode;

    @Column(nullable = false)
    private String categoryName;

//    @Column(nullable = false)
//    private String description;

//    @Column(nullable = false)
    //private String status;

//    private Date createdDate;
//    private Date updatedDate;
//    private String createdBy;
//    private String updatedBy;
}
