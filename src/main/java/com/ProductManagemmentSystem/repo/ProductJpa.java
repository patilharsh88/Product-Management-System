package com.ProductManagemmentSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductManagemmentSystem.entity.Product;

public interface ProductJpa extends JpaRepository<Product, Integer> {

}
