package com.morningdev.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.morningdev.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long > {
    
    List<Product> findByNameContains(String name);
}
