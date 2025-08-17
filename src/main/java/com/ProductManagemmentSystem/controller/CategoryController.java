package com.ProductManagemmentSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProductManagemmentSystem.entity.Category;
import com.ProductManagemmentSystem.entity.Product;
import com.ProductManagemmentSystem.service.CategoryService;
import com.ProductManagemmentSystem.service.ProductService;
import com.ProductManagemmentSystem.util.ResponseStructure;

@RequestMapping("/Category")
@RestController
public class CategoryController {

	@Autowired
	CategoryService service;
	
	@PostMapping("/save")
	public Category addCategory(Category p) {			
		return	service.addCategory(p);
	}
	
	
}