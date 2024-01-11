package com.product.service;

import java.util.ArrayList;
import java.util.List;

import com.product.dao.Empdao;
import com.product.dao.EmpdaoImpl;
import com.products.model.Product;

public class EmpServiceImpl implements EmpService{
	
	public static Empdao edao;
	public EmpServiceImpl() {
		this.edao = new EmpdaoImpl();
	}
	
	@Override
	public List<Product> findallProducts() {
		List<Product> list=new ArrayList<Product>();
		list=edao.getAllProducts();
		System.out.println(list);
		return list;
	}

}
