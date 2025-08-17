package com.ProductManagemmentSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
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
	

}
