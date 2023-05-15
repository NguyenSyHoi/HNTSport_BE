package com.example.ecommerce_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class AccountDTO implements Serializable {
    private Long id;
    private String user;
    private String pass;
}
