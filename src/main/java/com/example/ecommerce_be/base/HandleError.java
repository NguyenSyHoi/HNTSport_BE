package com.example.ecommerce_be.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@Slf4j
@ControllerAdvice
public class HandleError  {
    @ExceptionHandler(Exception.class)
    public ResponseEntity handleServerError(Exception ex) {
        log.error(ex.getMessage(),ex);
        //    --> Có thể dùng cái này thay thế
//        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
//        headers.add("Content-Type", "application/json; charset=utf-8");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body(null);
    }
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleRuntimeException(Exception ex) {
        log.error(ex.getMessage(),ex);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body(null);
    }
}
