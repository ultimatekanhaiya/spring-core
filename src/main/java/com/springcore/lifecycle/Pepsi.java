package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private int price;

	public Pepsi() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("I am pepsi init from InitializingBean Interface");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("I am pepsi destroy from DisposableBean Interface");
		
	}
	
}
