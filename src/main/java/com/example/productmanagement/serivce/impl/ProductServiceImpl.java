package com.example.productmanagement.serivce.impl;

import com.example.productmanagement.model.entity.Product;
import com.example.productmanagement.serivce.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private static List<Product> products = new ArrayList<>();
    static {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1,"iPhone 14 Pro Max",15000000.00);
        Product product2 = new Product(2,"MacBook Pro 16",20000000.00);
        Product product3 = new Product(3,"iPad Pro 12.9",10000000.00);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}
