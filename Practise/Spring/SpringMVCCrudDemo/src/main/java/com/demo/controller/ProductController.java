package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProductService;


@Controller
@RequestMapping
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@GetMapping("/getProduct")
	public ModelAndView getProducts(HttpSession session) {
		List<Product> plist = ps.getProducts();
		return new ModelAndView("displayProduct","plist",plist);
		
	}
	
//	@GetMapping("/addProduct")
//	public ModelAndView addProduct(HttpSession session) {
//		return new ModelAndView("addProducts");
//	}
}
