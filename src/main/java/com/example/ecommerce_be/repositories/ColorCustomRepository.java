package com.example.ecommerce_be.repositories;

import com.example.ecommerce_be.entity.Color;
import com.example.ecommerce_be.entity.Color_Custom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorCustomRepository extends JpaRepository<Color_Custom,Long> {

    @Query(value = "select c.*,count(p.id) as quantity from color c \n" +
            "\tinner  join  color_product cp on  cp.color_id  = c.id \n" +
            "\tinner join product p on cp.product_id = p.id \n" +
            "\twhere (?1 is null or c.name like %?1%)\n" +
            "\tgroup by c.code,c.name,c.id  ",nativeQuery = true)
    List<Color_Custom> searchColorLikeName(String code);
}
