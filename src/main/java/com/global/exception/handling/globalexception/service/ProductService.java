package com.global.exception.handling.globalexception.service;

import com.global.exception.handling.globalexception.dto.ProductDto;

public interface ProductService {
    public ProductDto findByPrice(Integer price);

}
