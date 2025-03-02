package com.global.exception.handling.globalexception.service.impl;

import com.global.exception.handling.globalexception.dto.ProductDto;
import com.global.exception.handling.globalexception.exception.ProductNotFoundException;
import com.global.exception.handling.globalexception.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductDto findByPrice(Integer price) {
        if(price==201){
            return new ProductDto("000000060629202001","Shirt","201");
        }
        else {
            throw new ProductNotFoundException("No product found");
        }
    }
}
