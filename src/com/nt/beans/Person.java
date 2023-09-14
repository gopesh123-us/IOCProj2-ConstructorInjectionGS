package com.nt.beans;

public class Person {
	//Spring bean properties
	private int pid;
	private String pname;
	private String padders;
	private float income;
	
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
	public String getPadders() {
		return padders;
	}
	public void setPadders(String padders) {
		this.padders = padders;
	}
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", padders=" + padders + ", income=" + income + "]";
	}
	
	
	
	
	
	
}
