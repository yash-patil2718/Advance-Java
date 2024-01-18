package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginDao;
import com.demo.model.MyUser;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao ldao;

	@Override
	public MyUser validateUser(String uname, String passwd) {
		
		MyUser u =ldao.checkUser(uname,passwd);
		
		System.out.println(u);
		
		return u;
	}
	

}
