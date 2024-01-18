package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> findAll();

	void addProduct(Product p);

	void deleteP(int pid);

	Product findById(int pid);

	void modifyprod(Product p);

}
