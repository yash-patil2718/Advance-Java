package com.demo.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private int uid;
	private String uname;
//	@OneToOne
	
	@Embedded
//	@JoinColumn(name="addrid")
	private Address addr;
	public User() {
		super();
	}
	public User(int uid, String uname, Address addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
	}
	public User(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", addr=" + addr + "]";
	}
	
	
}
