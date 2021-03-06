package com.procopio.ajcatalog.tests;

import java.time.Instant;

import com.procopio.ajcatalog.dto.CategoryDTO;
import com.procopio.ajcatalog.dto.ProductDTO;
import com.procopio.ajcatalog.entities.Category;
import com.procopio.ajcatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 2190.0, "http://img.com/img.png",Instant.parse("2020-10-20T03:00:00Z")); 
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createdProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(1L, "Electronics");
	}
	
	public static CategoryDTO createCategoryDTO() {
		Category category = createCategory();
		return new CategoryDTO(category);
	}
}
