package com.jspiders.springcore.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.DatabaseConnection;
import com.jspiders.springcore.bean.DatabaseOperation;
import com.jspiders.springcore.configuration.ApplicationConfiguration;
public class DatabaseConnectionMain {
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		DatabaseConnection databaseConnection1 = applicationContext.getBean(DatabaseConnection.class);
		System.out.println(databaseConnection1);
		DatabaseConnection databaseConnection2 = applicationContext.getBean(DatabaseConnection.class);
		System.out.println(databaseConnection2);
		DatabaseOperation databaseOperation1 = applicationContext.getBean(DatabaseOperation.class);
		System.out.println(databaseOperation1);
		DatabaseOperation databaseOperation2 = applicationContext.getBean(DatabaseOperation.class);
		System.out.println(databaseOperation2);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}
