package com.example.ecommerce_be.service;

import com.example.ecommerce_be.dto.ColorDTO;
import com.example.ecommerce_be.entity.Color_Custom;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ColorService {
    List<Color_Custom> getColors (String code);
}
