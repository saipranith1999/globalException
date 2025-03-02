package com.global.exception.handling.globalexception.controller;

import com.global.exception.handling.globalexception.dto.ProductDto;
import com.global.exception.handling.globalexception.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping(value="/getProductId",produces={"application/json"})
    public ProductDto fetchProductData(@RequestParam("productId") String productId){
        return productService.findByPrice(Integer.parseInt(productId));

        //http://localhost:8080/getProductId?productId=202


    }



}
