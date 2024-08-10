package com.springcore.dependency_injection_inversionofcontrol;

public class Jio implements Sim{
	
	public int price;
	

	@Override
	public void calling() {
		System.out.println("calling using Jio sim");
		
	}

	@Override
	public void data() {
		System.out.println("using Internet of Jio sim");
		
	}

}
