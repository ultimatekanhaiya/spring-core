package com.springcore.bean;

public class Teacher {
	private String name;

	public Teacher() {
		super();
		System.out.println("teacher no-arg constructor");
	}

	public Teacher(String name) {
		super();
		this.name = name;
		System.out.println("teacher arg constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("teacher setter method");
		this.name = name;
	}

}
