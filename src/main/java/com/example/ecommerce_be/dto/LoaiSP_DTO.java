package com.example.ecommerce_be.dto;

import java.util.Date;
import com.example.ecommerce_be.entity.Product;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor

public class LoaiSP_DTO {
    private Long id;

    private String maLoai;

    private String tenLoai;

    private String status;

    private Date createdDate;

    private Date updatedDate;

    private String createdBy;

    private String updatedBy;
}
