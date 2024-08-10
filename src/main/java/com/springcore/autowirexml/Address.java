package com.springcore.autowirexml;

public class Address {

	private String street;
	private String city;
	
	/* 
	 * 
	 * No need to add default constructor as Java compiler adds it for us but only when you don't provide any other constructor. 
	 * This means it becomes the developers' responsibility to add a no-argument constructor if he is adding explicit constructor. 
	 * Now, Why it's important to provide default constructor in Java, What happens if your class doesn't have a no-argument constructor? 
	 * Well, this is how it's asked in many Java interviews, most commonly as part of Spring and Hibernate interviews.
	 * You should always define a no argument constructor in your Java class, even if you are writing an explicitly constructor, 
	 * until you are absolutely sure that, it's won't be instantiated using reflection and instantiating it with no argument constructor is a bug. 
	 * 
	 * 
	 * */
	
//	public Address() {
//		super();
//		System.out.println("address class default constructor");
//	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
		System.out.println("adress setstreet");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("adress setCity");
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
