package com.example.ecommerce_be.controller;

import com.example.ecommerce_be.base.BaseResponse;
import com.example.ecommerce_be.constants.StatusCode;
import com.example.ecommerce_be.dto.ProductDTO;
import com.example.ecommerce_be.dto.Product_DTO;
import com.example.ecommerce_be.payload.ProductPayloadSearch;
import com.example.ecommerce_be.service.ProductService;
import com.example.ecommerce_be.service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/productT")
public class Product_Controller {
    @Autowired
    private Product_Service productService;

   /* @PostMapping("/searchT")
    public  ResponseEntity searchProduct(@RequestBody ProductPayloadSearch payloadSearch, Pageable pageable){
        return ResponseEntity.ok(new BaseResponse(productService.searchProduct(payloadSearch,pageable),"Thành công", StatusCode.SUCCESS));
    }*/

    @PostMapping("/addProductT")
    @ResponseBody
    ResponseEntity addNewProduct(@RequestBody Product_DTO productDTO){
        return ResponseEntity.ok(new BaseResponse(productService.addNewProduct(productDTO),"Thêm mới sản phẩm thành công",StatusCode.SUCCESS));
    }
    @GetMapping("/getAllProducts")
    public ResponseEntity getAllProduct() {
        return ResponseEntity.ok(new BaseResponse(productService.getListProducts(),"Thành công", StatusCode.SUCCESS));
    }

    /*@PutMapping("/updateProductT")
    @ResponseBody
    ResponseEntity updateProduct(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(new BaseResponse(productService.updateProduct(productDTO),"Cập nhật sản phẩm thành công",StatusCode.SUCCESS));
    }

    @DeleteMapping("/deleteProductT/{id}")
    ResponseEntity deleteProduct(@PathVariable(name = "id") Long id){
        productService.deleteProduct(id);
        return  ResponseEntity.ok(new BaseResponse(null,"Xóa sản phẩm thành công",StatusCode.SUCCESS));
    }


    @GetMapping("/getByIdT/{id}")
    ResponseEntity getProductById(@PathVariable(name="id") Long id){
        return ResponseEntity.ok(new BaseResponse(productService.getProductById(id),"Thành công",StatusCode.SUCCESS));
    }*/
}
