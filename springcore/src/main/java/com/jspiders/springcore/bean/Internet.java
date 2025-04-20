package com.jspiders.springcore.bean;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Component
@Data

public class Internet {
	
	{
		System.out.println("Internet is created");
	}

	@Value("100 mbps")
	private String speed;

}
