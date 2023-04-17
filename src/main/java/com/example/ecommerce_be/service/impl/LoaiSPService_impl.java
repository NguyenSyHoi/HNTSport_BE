package com.example.ecommerce_be.service.impl;

import com.example.ecommerce_be.base.NotFoundException;
import com.example.ecommerce_be.constants.Constants;
import com.example.ecommerce_be.dto.CategoryDTO;
import com.example.ecommerce_be.dto.LoaiSP_DTO;
import com.example.ecommerce_be.entity.Category;
import com.example.ecommerce_be.entity.LoaiSP;
import com.example.ecommerce_be.mapper.CategoryMapper;
import com.example.ecommerce_be.mapper.LoaiSPMapper;
import com.example.ecommerce_be.repositories.CategoryRepository;
import com.example.ecommerce_be.repositories.LoaiSPRepository;
import com.example.ecommerce_be.service.CategoryService;
import com.example.ecommerce_be.service.LoaiSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LoaiSPService_impl implements LoaiSPService {
    @Autowired
    private LoaiSPRepository loaispRepository;
    @Autowired
    private LoaiSPMapper loaiSPMapper;

    @Override
    public List<LoaiSP_DTO> getListLoaiSP() {
        return loaiSPMapper.toListDto(loaispRepository.getAllLoaiSP());
    }

    @Override
    @Transactional
    public LoaiSP_DTO addNewLoaiSP(LoaiSP_DTO loaispDTO) {
        // Hởi đã ghé qua đây
        LoaiSP loaisp = loaiSPMapper.toEntity(loaispDTO);
        loaisp.setMaLoai(loaispDTO.getMaLoai());
        loaisp.setTenLoai(loaispDTO.getTenLoai());
        loaisp.setStatus(String.valueOf(Constants.ACTIVE));
        loaisp.setCreatedDate(new Date());
        loaisp.setUpdatedDate(new Date());
        return loaiSPMapper.toDto(loaispRepository.save(loaisp));
    }

    @Override
    public void deleteLoaiSP(Long id) {
        Optional<LoaiSP> loaisp = checkExistLoaiSP(id);
        if (loaisp.isPresent()) {
            loaispRepository.deleteLoaiSPById(id);
        } else {
            throw new NotFoundException("Category not found");
        }
    }
    
    public Optional<LoaiSP> checkExistLoaiSP(Long id) {
        return loaispRepository.getLoaiById(id);
    }
}
