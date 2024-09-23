package com.vcm.app.service;

import com.vcm.app.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(long id);
    Product update(Product product);
    void deleteById(long id);
}
