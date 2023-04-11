package com.example.ecommerce_be.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "color")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private  String name;
    @ManyToMany(mappedBy = "colors",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Product> productList;
}
