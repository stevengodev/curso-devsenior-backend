package com.foliaco.steven.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foliaco.steven.product.entity.Product;
import com.foliaco.steven.product.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product producto) {
        return productRepository.save(producto);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
    
}
