package com.springcore.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationTestApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowireannotation/autowireAnnoconfig.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
	}

}
