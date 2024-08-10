package com.springcore.dependency_injection_inversionofcontrol;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("calling using Airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("using Internet of Airtel sim");
		
	}

}
