package com.example.ecommerce_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class CustomerDTO implements Serializable {
    private Long id;
    private String name;
    private String phone;
    private String andress;
    private String email;
}
