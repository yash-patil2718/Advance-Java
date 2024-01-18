package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public MyUser checkUser(String uname, String passwd) {

		  try
		  {
			  String str="select username,password,role from user where username=? and password=?";
			  return jdbcTemplate.queryForObject(str, new Object[] {uname,passwd},BeanPropertyRowMapper.newInstance(MyUser.class));
		  }
		  catch(EmptyResultDataAccessException e) {
			  System.out.println("not found"+e.getMessage());
			  return null;
		  }
		
	
	
	}

}
