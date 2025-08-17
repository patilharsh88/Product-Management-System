package com.ProductManagemmentSystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProductManagemmentSystem.entity.Product;
import com.ProductManagemmentSystem.service.ProductService;
import com.ProductManagemmentSystem.util.ResponseStructure;

@RequestMapping("/Product")
@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Product>> addProduct(Product p) {			
		return	service.addProduct(p);
	}
	
	@GetMapping("/find")
	public Optional<Product> findProduct(int id) {			
		return	service.find(id);
	}
	@Value("${my.prop}")
	public String key;
	
	@GetMapping("/a")
	public String print() {		
		
		System.out.println(key);
		return	"Hello";
	}

	
	
}