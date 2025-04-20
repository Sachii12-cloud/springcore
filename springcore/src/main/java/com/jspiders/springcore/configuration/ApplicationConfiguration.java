package com.jspiders.springcore.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;


import com.jspiders.springcore.bean.DatabaseConnection;
import com.jspiders.springcore.bean.DatabaseOperation;



@ComponentScan("com.jspiders.springcore.bean")
public class ApplicationConfiguration {
	
	@Bean
	@Scope("singleton")
	protected DatabaseConnection getDatabaseConnection() {
		System.out.println("getDatabaseConnection() is invoked");
		DatabaseConnection databaseConnection = new DatabaseConnection();
		databaseConnection.setDb_url("jdbc:mysql://localhost:3306");
		databaseConnection.setUser_name("root");
		databaseConnection.setPassword("root");
		return databaseConnection;
	}

	@Bean
	@Scope("singleton")
	protected DatabaseOperation getDatabaseOperation() {
		System.out.println("getDatabaseOperation() is invoked");
		DatabaseOperation databaseOperation = new DatabaseOperation();
		databaseOperation.setQuery("create database test");
		return databaseOperation;
	}


}
