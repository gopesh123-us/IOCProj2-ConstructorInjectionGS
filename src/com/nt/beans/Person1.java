package com.nt.beans;

public class Person1 {
	//Spring bean properties
	private int pid;
	private String pname;
	private String padders;
	private float income;
	

	public Person1(int pid, String pname, String padders, float income) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.padders = padders;
		this.income = income;
	}



	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", padders=" + padders + ", income=" + income + "]";
	}
	
	
	
	
	
	
}
