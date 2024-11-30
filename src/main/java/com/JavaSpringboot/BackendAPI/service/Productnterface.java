package com.JavaSpringboot.BackendAPI.service;

import com.JavaSpringboot.BackendAPI.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Productnterface {
    Page<Product> getAllProducts(Pageable pageable);
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    boolean deleteProduct(Long id);
}

