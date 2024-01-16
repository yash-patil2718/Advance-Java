package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.model.MyUser;


@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao ldao;
	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}

	@Override
	public MyUser validateUser(String unm, String passwd) {
		return ldao.validUser(unm, passwd);
	}

}
