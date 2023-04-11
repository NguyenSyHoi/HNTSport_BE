package com.example.ecommerce_be.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ProductPayloadSearch {
    private List<String> colors;
    private Long fromPrice;
    private Long toPrice;
}
