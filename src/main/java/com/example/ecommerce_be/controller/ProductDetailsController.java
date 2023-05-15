package com.example.ecommerce_be.controller;

import com.example.ecommerce_be.base.BaseResponse;
import com.example.ecommerce_be.constants.StatusCode;
import com.example.ecommerce_be.dto.ProductDetailsDTO;
import com.example.ecommerce_be.dto.Product_DTO;
import com.example.ecommerce_be.entity.ProductDetails;
import com.example.ecommerce_be.entity.Product_T;
import com.example.ecommerce_be.service.ProductDetailsService;
import com.example.ecommerce_be.service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/productDetails")
public class ProductDetailsController {
    @Autowired
    private ProductDetailsService productService;

   /* @PostMapping("/searchT")
    public  ResponseEntity searchProduct(@RequestBody ProductPayloadSearch payloadSearch, Pageable pageable){
        return ResponseEntity.ok(new BaseResponse(productService.searchProduct(payloadSearch,pageable),"Thành công", StatusCode.SUCCESS));
    }*/

    @PostMapping("/addProductDetails")
    @ResponseBody
    ResponseEntity addNewProduct(@RequestBody ProductDetailsDTO productDetailsDTO){
        return ResponseEntity.ok(new BaseResponse(productService.addNewProduct(productDetailsDTO),"Thêm mới sản phẩm thành công",StatusCode.SUCCESS));
    }
    @GetMapping("/getAllProductDetails")
    public ResponseEntity getAllCategory() {
        return ResponseEntity.ok(new BaseResponse(productService.getListProductDetails(),"Thành công", StatusCode.SUCCESS));
    }
    @GetMapping("/getBySize/{product}/{size}")
    ResponseEntity getBySize(@PathVariable(name="product")Product_T product,@PathVariable(name = "size") String size){
        return ResponseEntity.ok(new BaseResponse(productService.getBySize(product,size),"Thành công",StatusCode.SUCCESS));
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
