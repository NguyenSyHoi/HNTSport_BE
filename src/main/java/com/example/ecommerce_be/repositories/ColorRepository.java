package com.example.ecommerce_be.repositories;

import com.example.ecommerce_be.entity.Color;
import com.example.ecommerce_be.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorRepository extends JpaRepository<Color,Long> {
//    @Query(value = "select * from color c where (?1 is null or c.name like %?1%)",nativeQuery = true)



    @Query(value = "select c.code, c.name from color c where c.code = ?1",nativeQuery = true)
    Color searchColorByCode(String code);

    //cach 2: dung jpa
//    Color findByCode(String code);
}
