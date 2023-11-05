package com.vibze.site.orderservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "hello from order-service";
    }

}
