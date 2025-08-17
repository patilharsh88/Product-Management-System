package com.ProductManagemmentSystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ProductManagemmentSystem.dao.ProductDAO;
import com.ProductManagemmentSystem.entity.Product;
import com.ProductManagemmentSystem.util.ResponseStructure;

@Service
public class ProductService {

	@Autowired
	ProductDAO pdao;
	
	public ResponseEntity<ResponseStructure<Product>> addProduct(Product p) {		
		
		pdao.addProduct(p);
		
		ResponseStructure<Product> rs=new ResponseStructure<Product>();
		rs.setData(p);
		rs.setDate(LocalDateTime.now());
		rs.setMessage("Added Succesfully");
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		
			
	
		return	new ResponseEntity<ResponseStructure<Product>>(rs,HttpStatus.ACCEPTED);
	}
	
}

