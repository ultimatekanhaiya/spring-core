package com.springcore.lifecycle;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("setting samosa price");
	}

	public Samosa() {
		super();
		System.out.println("using samosa default constructor");
	}

	public void init() {
		System.out.println(
				"I am Samosa init, and run after : bean creation -> bean initialization -> bean dependency Injection -> init");
	}

	public void destroy() {
		System.out.println("I am  Samosa Destroy and runs before close but to call me u need to call close method");
	}

}
