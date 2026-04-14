package com.ProductManagemmentSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.ProductManagemmentSystem.entity.Category;
import com.ProductManagemmentSystem.repo.CategoryJPA;

@Repository
public class CategoryDAO {

	@Autowired
	CategoryJPA cjpa;
	
	public Category addCategory(Category p) {
		
		return cjpa.save(p);
	}

	public Optional<Category> findById(Integer i) {
		
		return cjpa.findById(i);
	}

	public Category update(Category c) {
		return cjpa.save(c);
	}

	public void deleteById(Integer integer) {
		
		 cjpa.deleteById(integer);
	}

	

}
