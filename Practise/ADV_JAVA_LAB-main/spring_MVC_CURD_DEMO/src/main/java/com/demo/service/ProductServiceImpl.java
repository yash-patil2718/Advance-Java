package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pdao;
	
	@Override
	public List<Product> getAllProducts() {
		
		return pdao.findAll();
	}

	@Override
	public void addNewP(Product p) {
		
		pdao.addProduct(p);
	}

	@Override
	public void deleteProduct(int pid) {
		pdao.deleteP(pid);
		
	}

	@Override
	public Product getById(int pid) {
		
		return pdao.findById(pid);
	}

	@Override
	public void updateProduct(Product p) {
		
		pdao.modifyprod(p);
		
	}

}
