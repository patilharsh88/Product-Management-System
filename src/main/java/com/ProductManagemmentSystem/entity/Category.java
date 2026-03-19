package com.ProductManagemmentSystem.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private	int id;
	private String name;
	
	
	private List<Product> product;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}
