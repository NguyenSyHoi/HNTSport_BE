package com.example.ecommerce_be.service;
import com.example.ecommerce_be.dto.LoaiSP_DTO;

import java.util.List;

public interface LoaiSPService {
    List<LoaiSP_DTO> getListLoaiSP();

    LoaiSP_DTO addNewLoaiSP(LoaiSP_DTO loaiDTO);

    void deleteLoaiSP(Long id);
}
