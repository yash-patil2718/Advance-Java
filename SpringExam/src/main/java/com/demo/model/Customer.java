package com.demo.model;

public class Customer {
	
	public String customerId;
	public String basePack;
	public String addPack;
	
	
	public Customer() {
		super();
	}


	public Customer(String customerId, String basePack, String addPack) {
		super();
		this.customerId = customerId;
		this.basePack = basePack;
		this.addPack = addPack;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getBasePack() {
		return basePack;
	}


	public void setBasePack(String basePack) {
		this.basePack = basePack;
	}


	public String getAddPack() {
		return addPack;
	}


	public void setAddPack(String addPack) {
		this.addPack = addPack;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", basePack=" + basePack
				+ ", addPack=" + addPack + "]";
	}
	
	

}
