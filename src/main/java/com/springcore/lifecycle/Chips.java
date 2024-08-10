package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chips {
	private String brand;

	public Chips() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//Deprecated from java 9
	@PostConstruct
	public void start() {
		System.out.println("I am chips init using annotation");
	}
	
	//Deprecated from java 9
	@PreDestroy
	public void end() {
		System.out.println("I am chips destroy using annotation");
	}
}
