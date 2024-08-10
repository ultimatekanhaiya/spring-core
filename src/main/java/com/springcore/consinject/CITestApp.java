package com.springcore.consinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CITestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/consinject/ciconfig.xml");
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);
	}

}
