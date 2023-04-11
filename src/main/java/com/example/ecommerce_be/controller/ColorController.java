package com.example.ecommerce_be.controller;

import com.example.ecommerce_be.base.BaseResponse;
import com.example.ecommerce_be.constants.StatusCode;
import com.example.ecommerce_be.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/color")
public class ColorController {
    @Autowired
    private ColorService colorService;

    @GetMapping("/search")
    ResponseEntity getAll(@RequestParam(value = "name") String name){
        return ResponseEntity.ok(new BaseResponse(colorService.getColors(name),"Thành công", StatusCode.SUCCESS));
    }
}
