package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.LoaiSP_DTO;
import com.example.ecommerce_be.entity.LoaiSP;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface LoaiSPMapper {

    LoaiSP toEntity(LoaiSP_DTO loaispDTO);

    LoaiSP_DTO toDto(LoaiSP loaisp);

    List<LoaiSP_DTO> toListDto(List<LoaiSP> dsloaisp);
}
