package com.example.productmanagement.controller;

import com.example.productmanagement.serivce.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products/")
public class ProductController {
    @Autowired
    private  ProductService productService;
    @GetMapping()
    public Object getAllProducts(){
        return productService.getAllProducts();
    }
}
