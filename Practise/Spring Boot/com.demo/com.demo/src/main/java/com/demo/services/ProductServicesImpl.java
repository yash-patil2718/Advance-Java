package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
@Service
public class ProductServicesImpl implements ProductServices{
	@Autowired
	private ProductDao pdao;
	@Override
	public List<Product> getProducts() {
		System.out.println("dadada : " + pdao);
		return pdao.findAll();
	}
	@Override
	public void addnewProduct(Product p) {
		pdao.save(p);
		
	}

}
