package com.example.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Product;
import com.example.springapp.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public Product addProduct(Product product)
    {
        return productRepo.save(product);
    }
    public List<Product> getProduct()
    {
        return productRepo.findAll();
    }
    public Optional<Product>getProductByid(int Id)
    {
        return productRepo.findById(Id);
    }
   
}