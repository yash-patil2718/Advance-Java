package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.MyUser;
import com.demo.model.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService pservice;
	
	@GetMapping("/getproducts")
	public ModelAndView diplayProduct(HttpSession session) {
		
		MyUser u = (MyUser) session.getAttribute("user");
		
		if(u!=null)
		{
			List<Product> plist=pservice.getAllProducts();
			return new ModelAndView("displayproduct","plist",plist);
		}else
		{
			return new ModelAndView("redirect:/login/");
		}
	}
	
	@GetMapping("/addproduct")
	public String displayAddForm(HttpSession session)
	{
		MyUser u = (MyUser) session.getAttribute("user");
		if(u!=null)
		{
			return "addproduct";
		}
		return "redirect:/login/";
	}
	
	
	
	@PostMapping("/insertproduct")
	public ModelAndView insertNewProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam double price)
	{
		Product p = new Product(pid,pname,qty,price);
		pservice.addNewP(p);
		return new ModelAndView("redirect:/product/getproducts");
	}
	
	@GetMapping("delete/{pid}")
	public ModelAndView deleteProduct(@PathVariable int pid)
	{
			pservice.deleteProduct(pid);
			return new ModelAndView("redirect:/product/getproducts");
	}
	
	@GetMapping("edit/{pid}")
	public ModelAndView editProduct(@PathVariable int pid)
	{
			Product p = pservice.getById(pid);
			return new ModelAndView("editproduct","p",p);
	}
	
	
	@PostMapping("/updateProduct")
	public ModelAndView updateProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam double price)
	{
		Product p = new Product(pid,pname,qty,price);
		pservice.updateProduct(p);
		return new ModelAndView("redirect:/product/getproducts");
	}
	
}
