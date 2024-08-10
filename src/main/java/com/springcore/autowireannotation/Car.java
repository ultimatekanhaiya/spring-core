package com.springcore.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier("engine1")
	private Engine engine;

	private String name;
	
	public Car() {
		System.out.println("car default constructor");
	}
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	
	public Car(Engine engine, String name) {
		super();
		this.engine = engine;
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", name=" + name + "]";
	}

}
