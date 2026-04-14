package com.ProductManagemmentSystem.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.ProductManagemmentSystem.entity.Category;

public interface CategoryJPA extends JpaRepository<Category, Integer>{


public Optional findById(Integer i);


public Category update(Category c);
	
public Category save();

public void deleteById(Integer integer);

}
