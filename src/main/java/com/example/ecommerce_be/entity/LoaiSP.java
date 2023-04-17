package com.example.ecommerce_be.entity;

import java.util.Date;
import com.example.ecommerce_be.entity.Product;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "loaisp")
@Entity
@NoArgsConstructor
@Data
public class LoaiSP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String maLoai;

    @Column(nullable = false)
    private String tenLoai;
    @Column(nullable = false)
    private String status;

    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
}
