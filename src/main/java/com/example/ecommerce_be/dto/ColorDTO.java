package com.example.ecommerce_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ColorDTO {
    private Long id;

    private String code;

    private  String name;
    private List<ProductDTO> productList;

}
