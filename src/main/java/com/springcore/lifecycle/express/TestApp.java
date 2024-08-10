package com.springcore.lifecycle.express;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/express/config.xml");
		StudentDAO dao = context.getBean("student", StudentDAO.class);
		context.registerShutdownHook();
		try {
			dao.getAllData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
