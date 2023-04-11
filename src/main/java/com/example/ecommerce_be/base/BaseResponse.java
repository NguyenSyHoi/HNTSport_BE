package com.example.ecommerce_be.base;

import com.example.ecommerce_be.constants.StatusCode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseResponse<T> {
    private  T data;
    private String errorCode = StatusCode.SUCCESS;
    private  String message = "";

    public BaseResponse(T data ,String meessage ,String errorCode){
        this.data = data;
        this.message = meessage;
        this.errorCode = errorCode;
    }

}
