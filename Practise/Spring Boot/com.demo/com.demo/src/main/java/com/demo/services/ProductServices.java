package com.demo.services;

import java.util.List;

import com.demo.model.Product;

public interface ProductServices {

	List<Product> getProducts();

	void addnewProduct(Product p);

}
