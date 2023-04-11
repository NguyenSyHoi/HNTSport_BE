package com.example.ecommerce_be.service.impl;

import com.example.ecommerce_be.dto.ColorDTO;
import com.example.ecommerce_be.entity.Color;
import com.example.ecommerce_be.entity.Color_Custom;
import com.example.ecommerce_be.mapper.ColorMapper;
import com.example.ecommerce_be.repositories.ColorCustomRepository;
import com.example.ecommerce_be.repositories.ColorRepository;
import com.example.ecommerce_be.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService_impl implements ColorService {
    @Autowired
    private ColorCustomRepository colorCustomRepository;
    @Autowired
    private ColorMapper colorMapper;

    @Override
    public List<Color_Custom> getColors(String code) {
        return colorCustomRepository.searchColorLikeName(code);
    }
}
