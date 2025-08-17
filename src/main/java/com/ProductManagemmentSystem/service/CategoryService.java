package com.ProductManagemmentSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
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

}
