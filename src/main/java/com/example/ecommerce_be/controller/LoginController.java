package com.example.ecommerce_be.controller;

import com.example.ecommerce_be.base.BaseResponse;
import com.example.ecommerce_be.constants.StatusCode;
import com.example.ecommerce_be.dto.AccountDTO;
import com.example.ecommerce_be.entity.Account;
import com.example.ecommerce_be.repositories.AccountRepository;
import com.example.ecommerce_be.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/login")
public class LoginController {

        @Autowired
        private AccountService accountService;
//        private AccountDTO accountDTO;

        @PostMapping
        public ResponseEntity login(@RequestBody Account account) {
            return  ResponseEntity.ok(new BaseResponse(accountService.checkLogin(account.getUser(), account.getPass()), "Thành công", StatusCode.SUCCESS));
        }
    }
