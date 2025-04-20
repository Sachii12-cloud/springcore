package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.Browser;
import com.jspiders.springcore.configuration.ApplicationConfiguration;

public class BrowserMain {
	
	public static void main(String[] args) {

//		 ApplicationContext applicationContext = new
//		 AnnotationConfigApplicationContext("com.jspiders.springcore.bean");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Browser browser = applicationContext.getBean(Browser.class);
		System.out.println(browser);
		((AnnotationConfigApplicationContext) applicationContext).close();
	}

}
