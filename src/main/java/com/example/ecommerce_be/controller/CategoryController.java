package com.example.ecommerce_be.controller;

import com.example.ecommerce_be.base.BaseResponse;
import com.example.ecommerce_be.constants.StatusCode;
import com.example.ecommerce_be.dto.CategoryDTO;
import com.example.ecommerce_be.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/getAllCategory")
    public ResponseEntity getAllCategory() {
        return ResponseEntity.ok(new BaseResponse(categoryService.getListCategory(),"Thành công", StatusCode.SUCCESS));
    }

    @PostMapping("/addNewCategory")
    public ResponseEntity addNewCategory(@RequestBody CategoryDTO categoryDTO){
        return  ResponseEntity.ok(new BaseResponse(categoryService.addNewCategory(categoryDTO),"Thành công",StatusCode.SUCCESS));
    }
    @DeleteMapping("/deleteCategory/{id}")
    public ResponseEntity deleteCategory(@PathVariable(name = "id") Long id){
        return  ResponseEntity.ok(new BaseResponse(null,"Thành công",StatusCode.SUCCESS));
    }

}
