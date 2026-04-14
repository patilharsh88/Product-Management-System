package com.ProductManagemmentSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ProductManagemmentSystem.dao.CategoryDAO;
import com.ProductManagemmentSystem.entity.Category;

@Service
public class CategoryService {
	
	@Autowired
	CategoryDAO cdao;

	public Category addCategory(Category p) {
		
		return cdao.addCategory(p);
	}

	public Optional<Category> findById(Integer i) {
		
		return cdao.findById(i);
	}

	public Category update(Category c) {
		return cdao.update(c);
		
	}

	public void deleteById(Integer integer) {
		 cdao.deleteById(integer);
	}


}
