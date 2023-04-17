package com.example.ecommerce_be.controller;

import com.example.ecommerce_be.base.BaseResponse;
import com.example.ecommerce_be.constants.StatusCode;
import com.example.ecommerce_be.dto.CategoryDTO;
import com.example.ecommerce_be.dto.LoaiSP_DTO;
import com.example.ecommerce_be.service.CategoryService;
import com.example.ecommerce_be.service.LoaiSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/loaisp")
public class LoaiSP_Controller {
    @Autowired
    private LoaiSPService loaispService;
    @GetMapping("/getAllLoaiSP")
    public ResponseEntity getAllLoaiSP() {
        return ResponseEntity.ok(new BaseResponse(loaispService.getListLoaiSP(),"Thành công", StatusCode.SUCCESS));
    }

    @PostMapping("/addNewLoaiSP")
    public ResponseEntity addNewLoaiSP(@RequestBody LoaiSP_DTO loaispDTO){
        return  ResponseEntity.ok(new BaseResponse(loaispService.addNewLoaiSP(loaispDTO),"Thành công",StatusCode.SUCCESS));
    }
    @DeleteMapping("/deleteLoaiSP/{id}")
    public ResponseEntity deleteLoaiSP(@PathVariable(name = "id") Long id){
        return  ResponseEntity.ok(new BaseResponse(null,"Thành công",StatusCode.SUCCESS));
    }
}
