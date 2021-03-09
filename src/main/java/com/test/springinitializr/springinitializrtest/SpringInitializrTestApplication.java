package com.test.springinitializr.springinitializrtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringInitializrTestApplication {

	public static void main(String[] args) {
		System.out.println("start.......");
		SpringApplication.run(SpringInitializrTestApplication.class, args);
	}

}
