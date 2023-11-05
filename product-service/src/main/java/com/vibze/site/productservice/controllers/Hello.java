package com.vibze.site.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Hello {


    @GetMapping("/")
    public String hello(){
        return "hello from product-service";
    }

}
