/*
 * Lets think of a scenario where u have a mobile and it support only one company sim like Airtel.
 * Now if u want to use another company sim u have to buy another phone, which is not good at all.
 * What if u can just pull out old company sim and insert a new company sim like Jio.
 * For that, the phone company have to design its model like it can support any sim.
 * They just provide a specification to sim companies, that we have build a socket using a particular architecture
 * please design ur sim according to it so that our sim slot can hold that and use it.
 * */
package com.springcore.dependency_injection_inversionofcontrol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		
		//this approach is like a phone which can support only single company sim.
		//making code tightly coupled
		Airtel a = new Airtel();
		a.calling();
		a.data();
		
		//this approach is good and also loosely coupled
		//but we don't want to hard code sim object each time
		Sim sim = new Jio();
		sim.calling();
		sim.data();
		
		//Best, Spring approach
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/dependency_injection_inversionofcontrol/iocconfig.xml");
		//AnnotationConfigApplicationContext
		Sim sim1 = context.getBean("jio",Sim.class);
		sim1.calling();
		sim1.data();
		
		/*
		 * As a developer writing business logic is our job not deleting or creating object
		 * Just think u have thousand classes and thousands of object require to be change by business
		 * In such Scenarios 'Spring' can help us, it can do lot of things for us like :
		 * 1. creating Object
		 * 2. Manage the Object
		 * 3.Help our application to be configurable
		 * 4.Manage Dependencies
		 * 
		 * We just need to create a config file and mention the classes which we want to create object for.
		 * Spring will read the config file create the object of mention classes and store/ manage them in it IOC container.
		 * The object which Spring create for us called 'beans'.
		 * Just call getBean() pass the required class name/id in it spring will provide it to u.
		 * 
		 * */
		
		
		
	} 

}
