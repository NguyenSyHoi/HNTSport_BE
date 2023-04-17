package com.example.ecommerce_be.repositories;

import com.example.ecommerce_be.entity.Product;
import com.example.ecommerce_be.entity.Product_T;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Product_Repository extends JpaRepository<Product_T, Long> {
    @Query(value ="SELECT p.* from products p", nativeQuery = true)
    List<Product_T> getAllProduct();


   // @Query("SELECT p from Product p where p.isActive =1 and p.id = ?1")
    //Optional<Product> getProductById(Long id);

    //@Modifying
    //@Query(value = "update Product p set p.id = ?1 where p.isActive = 1", nativeQuery = true)
    //void deleteProductById(Long id);

    /*@Query(value = "select  p.* from product p \n" +
            "\tleft join color_product cp  on p.id = cp.product_id \n" +
            "\tleft join color c  on c.id  = cp.color_id \n" +
            "\twhere p.is_active =1 \n" +
            "\t\tand (?1 is null or p.price  >= ?1 )\n" +
            "\t\tand (?2 is null or p.price <= ?2)\n" +
            "\t\tand (coalesce (?3) is null or c.name in (?3)) " +
            "group by p.id"
           ,countQuery = "select  count(1) from product p \n" +
            "\tleft join color_product cp  on p.id = cp.product_id \n" +
            "\tleft join color c  on c.id  = cp.color_id \n" +
            "\twhere p.is_active =1 \n" +
            "\t\tand (?1 is null or p.price  >= ?1 )\n" +
            "\t\tand (?2 is null or p.price <= ?2)\n" +
            "\t\tand (coalesce (?3) is null or c.name in (?3)) " +
            "group by p.id",
            nativeQuery = true)
    Page<Product> searchProduct(Long fromPrice,Long toPrice, List<String> colors, Pageable pageable);*/

}
