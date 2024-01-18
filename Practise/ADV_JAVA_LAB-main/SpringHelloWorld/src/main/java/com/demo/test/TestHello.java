package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.HelloWorld;
import com.demo.model.MyUser;

public class TestHello {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		
//		System.out.println("Before");
//		HelloWorld hello = (HelloWorld) ctx.getBean("hw");
//		System.out.println("After");
//		System.out.println(hello.sayHello());
		
		MyUser user1 = (MyUser) ctx.getBean("u1");
		System.out.println(user1);
		
		MyUser user2 = (MyUser) ctx.getBean("u2");
		System.out.println(user2);
		
		MyUser user3 = (MyUser) ctx.getBean("u3");
		System.out.println(user3);
		
		
		
		
	}
	
	

	

}
