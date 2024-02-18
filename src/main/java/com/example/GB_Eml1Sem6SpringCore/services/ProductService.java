package com.example.GB_Eml1Sem6SpringCore.services;

import com.example.GB_Eml1Sem6SpringCore.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Product product);
    Product createProduct(Product product);
    void deleteProduct(Long id);
}
