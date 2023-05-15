package com.example.ecommerce_be.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "products")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product_T {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String productCode;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private Long price;
    @JoinColumn(name = "categoryId")
    @ManyToOne
    private Category category;

//    @Column(nullable = false)
//    private String status;

//    @Column(nullable = false)
//    private String categoryCode;
   // private Integer isActive;
   // @ManyToMany(targetEntity = Color.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JoinTable(name = "color_product", joinColumns = @JoinColumn(name = "product_id"),
     //       inverseJoinColumns = @JoinColumn(name = "color_id"))
    //private List<Color> colors;


    //private String image;

    //private String image_overlay;



//    private Date createdDate;
//
//    private Date updatedDate;
//
//    private String createdBy;
//
//    private String updatedBy;
}
