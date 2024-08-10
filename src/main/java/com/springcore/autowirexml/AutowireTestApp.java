package com.springcore.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTestApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowirexml/autowireconfig.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);

	}

}
