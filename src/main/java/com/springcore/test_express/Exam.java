package com.springcore.test_express;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/test_express/testconfig.xml"); 
		Student st = context.getBean("student",Student.class);
		context.registerShutdownHook();
		System.out.println(st.getId());
		System.out.println(st.getName());
		st.getCheat().cheat();
		
	}

}
