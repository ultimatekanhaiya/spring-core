package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LifeCycleTestApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
//		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
//		ac.close();
//		FileSystemXmlApplicationContext fc = new FileSystemXmlApplicationContext();
//		fc.close();
//		ClassPathXmlApplicationContext cc = new ClassPathXmlApplicationContext();
//		cc.close();
//		AbstractApplicationContext ab = new ClassPathXmlApplicationContext();
//		ab.registerShutdownHook();
		
		Samosa s = context.getBean("samosa", Samosa.class);
		Pepsi p = context.getBean("pepsi", Pepsi.class);
		Chips chips = context.getBean("chips", Chips.class);
		
		// closing context
		//as ApplicationContext doesn't have close therefore downCasting to ClassPathXmlApplicationContext which contain close method.
		((ClassPathXmlApplicationContext)context).close();
		
		System.out.println(s.getPrice());
		System.out.println(p.getPrice());
		System.out.println(chips.getBrand());
	}

}
