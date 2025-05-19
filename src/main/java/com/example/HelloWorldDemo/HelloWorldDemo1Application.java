package com.example.HelloWorldDemo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class HelloWorldDemo1Application {
	public static final Logger logger =LoggerFactory.getLogger(HelloWorldDemo1Application.class);
	
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(HelloWorldDemo1Application.class, args);
//		logger.debug("Checking Context :{}",context.getBean(EmployeeBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
		EmployeeBean empBean = context.getBean(EmployeeBean.class);
		empBean.setId(102);
		empBean.setName("Spring FrameWork");
		empBean.showEmployeeDetails();
		
//		SpringApplication.run(HelloWorldDemo1Application.class, args);
	}

}



