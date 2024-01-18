package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Product> findAll() {
		
		return jdbcTemplate.query("select * from product", (rs,num)->{
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			return p;
			
		});
	}


	@Override
	public void addProduct(Product p) {
		
		String str="insert into product values(?,?,?,?)";
		jdbcTemplate.update(str,new Object[] {
				p.getPid(),p.getPname(),p.getQty(),p.getPrice()
		});
		
	}


	@Override
	public void deleteP(int pid) {
		String str="delete from product where pid=?";
		jdbcTemplate.update(str,new Object[] {pid});
	}


	@Override
	public Product findById(int pid) {
		
		try {
		    return jdbcTemplate.queryForObject("select * from product where pid=?",new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}


	@Override
	public void modifyprod(Product p) {
		
		String str = "update product set pname=? , qty=?, price=? where pid=?";
		
		jdbcTemplate.update(str, new Object[] {p.getPname(),p.getQty(),p.getPrice(),p.getPid()});
		
	}

}
