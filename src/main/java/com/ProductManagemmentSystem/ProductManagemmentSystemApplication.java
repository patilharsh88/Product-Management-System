package com.ProductManagemmentSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;

@SpringBootApplication
public class ProductManagemmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagemmentSystemApplication.class, args);
	}
	
	@Bean
	public OpenAPI getopenApi() {
		return new OpenAPI();
	}

}
