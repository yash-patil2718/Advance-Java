package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	public ProductDao pdao;
	
	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}
	@Override
	public List<Product> getProducts() {
		return pdao.listProducts();
	}

}
