package com.ProductManagemmentSystem.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductManagemmentSystem.entity.Category;

public interface CategoryJPA extends JpaRepository<Category, Integer>{


public Optional findById(Integer i);
	
}
