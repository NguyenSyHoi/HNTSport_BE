package com.example.ecommerce_be.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "account_customer")
@Entity
@NoArgsConstructor
@Data
public class Account_Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String accountCustomerCode;

    @Column(nullable = false)
    private String user;

    @Column(nullable = false)
    private String password;
}
