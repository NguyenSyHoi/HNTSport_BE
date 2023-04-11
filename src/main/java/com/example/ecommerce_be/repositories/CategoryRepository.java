package com.example.ecommerce_be.repositories;

import com.example.ecommerce_be.entity.Category;
import com.example.ecommerce_be.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query(value = "select c.* from category c where c.status = 1 order by c.updated_date desc", nativeQuery = true)
    List<Category> getAllCategory();

    @Query(value = "SELECT c.* from Category c where p.isActive =1 and p.id = ?1",nativeQuery = true)
    Optional<Category> getCategoryById(Long id);

    @Modifying
    @Query(value = "update Category c set c.id = ?1 where c.status = 0", nativeQuery = true)
    void deleteCategoryById(Long id);
}
