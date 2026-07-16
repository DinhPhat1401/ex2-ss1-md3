package com.example.productmanagement.serivce;

import com.example.productmanagement.model.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public boolean deleteProductById(int id);
}
