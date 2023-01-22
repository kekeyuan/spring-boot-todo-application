package com.wazooinc.springboottodoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="controllers")
public class SpringBootTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTodoApplication.class,args);
	}

}
