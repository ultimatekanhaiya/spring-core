package com.springcore.autowireannotation;

public class Engine {
	private String name;
	
	public Engine() {
		System.out.println("Engine default constructor");
	}
	
	public Engine(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}

}
