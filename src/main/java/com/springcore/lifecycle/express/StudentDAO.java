/*
 * Why we need init and destroy methods for a bean lifeCycle?
 * first in each method getAllData() and deleteData() we have to load class and create connection again and again.
 * To solve above issue we create a separate method createConnection()
 * but now we need to call createConnection() method in every method to create connection, what if we can just
 * call createConnection method once when ever bean is created and also it close connection after bean work is done automatically.
 * This thing we can achieve by using init and destroy methods provided by spring framework.
 * 
 * */

package com.springcore.lifecycle.express;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class StudentDAO {
	
	/*
	 * It is neither setter injection nor constructor but field injection.
	 * In this case, Spring will use reflection to access the private field and set its value.
	 * This is a form of field injection. The value will be initialized after the bean is instantiated, but before it's put into service.
	 * */
	@Value("${connection.driver}")
	private String driver;
	@Value("${connection.url}")
	private String url;
	@Value("${connection.username}")
	private String username;
	@Value("${connection.password}")
	private String password;

	private Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("set driver");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	public void createConnection() throws ClassNotFoundException, SQLException {

		System.out.println("creating connection for StudentDB");

		// load the class
		Class.forName(driver);

		// create connection
		con = DriverManager.getConnection(url, username, password);
	}

	public void getAllData() throws SQLException {

		// without init
		
		// load the class
		// Class.forName(driver);

		// create connection
		// con = DriverManager.getConnection(url, username, password);
		
		//calling create connection in every method again and again
		// createConnection();

		// create statement
		Statement createStatement = con.createStatement();

		// Resultset
		ResultSet resultSet = createStatement.executeQuery("select * from student");

		while (resultSet.next()) {
			int studentId = resultSet.getInt(1);
			String course = resultSet.getString(2);
			String duration = resultSet.getString(3);
			String city = resultSet.getString(4);
			String name = resultSet.getString(5);

			System.out.println(studentId + " " + course + " " + duration + " " + city + " " + name);
		}

	}

	public void deleteData(int studentId) throws SQLException {
		
		//calling create connection in every method again and again
		// createConnection();
		
		// create statement
		Statement createStatement = con.createStatement();

		createStatement.executeUpdate("delete from student s where s.student_id = " + studentId);

		System.out.println("Record deleted with the id " + studentId);
	}

	@PreDestroy
	public void closeConnection() throws SQLException {

		System.out.println("closing conection for StudentDB");

		con.close();
	}

}
