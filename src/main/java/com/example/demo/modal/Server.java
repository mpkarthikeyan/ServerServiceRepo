package com.example.demo.modal;

public class Server {
	
	public Server(String name,String region,String customer) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.region=region;
		this.customer=customer;
	}
	private String name;
	
	private String region;
	
	private String customer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	
	

}
