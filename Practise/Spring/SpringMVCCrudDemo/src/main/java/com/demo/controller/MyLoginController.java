package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.MyUser;
import com.demo.service.LoginService;


@Controller
@RequestMapping("/login")
public class MyLoginController {
	@Autowired
	LoginService loginService;
	@GetMapping("/")
	public String showloginform() {
		return "login";
	}
	
	@PostMapping("/validate")
	public ModelAndView validate(@RequestParam("uname") String unm,@RequestParam String passwd,HttpSession sess) {
		MyUser u=loginService.validateUser(unm,passwd);
			if(unm.equals("admin1") && passwd.equals("admin1")) {
				sess.setAttribute("user",u);
//				return new ModelAndView("redirect:/successAdmin.jsp");
				return new ModelAndView("successAdmin","adminmsg","successful login");
			}
			return new ModelAndView("successAdmin","adminmsg","unsuccessful login");
		
			
//		if{
		/*
		 * if(unm.equals("admin") && passwd.equals("admin") ) { return new
		 * ModelAndView("successAdmin","adminmsg","successful login as Admin"); } return
		 * new ModelAndView("successAdmin","adminmsg","unsuccessful login as Admin");
		 */
//		else {
//			if(unm.equals("user") && passwd.equals("user") ) {
//				return new ModelAndView("successUser","usermsg","successful login as User");
//			}
//			return new ModelAndView("successUser","adminmsg","unsuccessful login as User");
	}
		
	}

