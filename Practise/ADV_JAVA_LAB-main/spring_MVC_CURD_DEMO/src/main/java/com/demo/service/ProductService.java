package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	void addNewP(Product p);

	void deleteProduct(int pid);

	Product getById(int pid);

	void updateProduct(Product p);
	
	

}
