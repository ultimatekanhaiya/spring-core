package com.springcore.common_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.springcore.common_annotation")
@PropertySource("student-info.properties")
public class CollegeConfig {
//	
//	@Bean
//	public Teacher mathTeacherBean() {
//		return new MathTeacher();
//	}
//	
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}
//	
//	@Bean(name = "college")
//	public College collegeBean() { // method name will be ur bean reference name otherwise provide name in @Bean("name")
//		
//		//Setter injection
////		College college = new College();
////		college.setPrincipal(principalBean());
//		
//		//constructor injection
//		return new College(principalBean(),mathTeacherBean());		
//		
//	}
	

}
