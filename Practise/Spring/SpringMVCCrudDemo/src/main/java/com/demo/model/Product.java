package com.demo.model;

public class Product {
	private int pid;
	private String pname;
	private int qty;
	private int cost;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, int cost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.cost = cost;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", cost=" + cost + "]";
	}
	
	
	
}
