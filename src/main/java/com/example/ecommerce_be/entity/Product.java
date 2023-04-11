package com.example.ecommerce_be.entity;
import lombok.*;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Table(name = "product")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String status;
    private Integer isActive;
    @ManyToMany(targetEntity = Color.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "color_product", joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id"))
    private List<Color> colors;

    private Long price;

    private String image;

    private String image_overlay;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    private Date createdDate;

    private Date updatedDate;

    private String createdBy;

    private String updatedBy;
}
