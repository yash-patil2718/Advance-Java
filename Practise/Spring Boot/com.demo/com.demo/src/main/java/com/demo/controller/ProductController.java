package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.services.ProductServices;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductServices pservice;
	
	public ProductController() {
		System.out.println("ProductController");
	}
	
	@GetMapping("/")
	public ModelAndView getProducts(HttpSession session) {
		System.out.println("display product ");
		List<Product> plist = pservice.getProducts();
		System.out.println("plist : " + plist);
		return new ModelAndView("displayproduct","plist",plist);
	}
	
	@GetMapping("/addproduct")
	public String displayaddform(HttpSession session) {
		  return "addproduct";
		
	}
	
	@PostMapping("/insertProduct")
	public ModelAndView insertProduct(@RequestParam int pid, @RequestParam String pname,@RequestParam int qty,@RequestParam double price) {
		Product p=new Product(pid,pname,qty,price);
		pservice.addnewProduct(p);
		return new ModelAndView("redirect:/product/getproducts");
}
}
