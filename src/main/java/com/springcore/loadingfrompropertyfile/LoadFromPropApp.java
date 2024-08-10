package com.springcore.loadingfrompropertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadFromPropApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/loadingfrompropertyfile/loadfrompropconfig.xml");
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
	}

}
