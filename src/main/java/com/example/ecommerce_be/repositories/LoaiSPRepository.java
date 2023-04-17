package com.example.ecommerce_be.repositories;
import com.example.ecommerce_be.entity.LoaiSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoaiSPRepository extends JpaRepository<LoaiSP, Long> {
    @Query(value = "select c.* from loaisp c where c.status = 1 order by c.updated_date desc", nativeQuery = true)
    List<LoaiSP> getAllLoaiSP();

    @Query(value = "SELECT c.* from LoaiSP c where p.isActive =1 and p.id = ?1",nativeQuery = true)
    Optional<LoaiSP> getLoaiById(Long id);

    @Modifying
    @Query(value = "update LoaiSP c set c.id = ?1 where c.status = 0", nativeQuery = true)
    void deleteLoaiSPById(Long id);
}
