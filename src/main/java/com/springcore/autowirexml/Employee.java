package com.springcore.autowirexml;

public class Employee {
	private Address address;
	private String name;

	/*
	 * Here we have added default constructor explicitly because we have added other
	 * argument constructor as well so java compiler will not add default
	 * constructor which can lead us into problems as default constructor is needed
	 * for object creation in many cases
	 */

	public Employee() {
		super();
		System.out.println("default employee constructor");
	}
	
	public Employee(String name) {
		super();
		System.out.println("name single argument constructor");
		this.name = name;
	}

	public Employee(Address address1) {
		super();
		System.out.println("single argument constructor");
		this.address = address1;
	}

	public Employee(Address address, String name) {
		super();
		System.out.println("double argument constructor");
		this.address = address;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress2(Address address) {
		System.out.println("using setter injection");
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", name=" + name + "]";
	}

}
