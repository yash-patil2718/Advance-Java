package com.demo.model;

public class MyUser {
	
	private String username;
	private String password;
	private String role;
	
	
	public MyUser() {
		super();
	}


	public MyUser(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	

}
