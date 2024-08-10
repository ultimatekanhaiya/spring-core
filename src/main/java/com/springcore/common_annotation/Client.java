package com.springcore.common_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		//we use ClassPathXMlApplication class when we are using xml based configuration
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/common_annotation/annotationconfig.xml");		
//		College college = context.getBean("college", College.class);
//		System.out.println(college);
		
		//We are not using xml based configuartaion we should use AnnotationConfigApplicationContext
		ApplicationContext context1 = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college1 = context1.getBean("collegeBean", College.class);
		
		System.out.println(college1.getCollegeName());
		college1.getPrincipal().principalInfo();
		college1.getTeacher().teach();
	}

}
