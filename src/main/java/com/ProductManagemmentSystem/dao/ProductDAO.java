package com.ProductManagemmentSystem.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ProductManagemmentSystem.entity.Product;
import com.ProductManagemmentSystem.repo.ProductJpa;

@Repository
public class ProductDAO {
	
	@Autowired
	ProductJpa pjpa;
	
	
	public Product addProduct(Product p) {
		return pjpa.save(p);
	}
	
	public Optional<Product> find(int id) {
		return pjpa.findById(id);
	}



}
