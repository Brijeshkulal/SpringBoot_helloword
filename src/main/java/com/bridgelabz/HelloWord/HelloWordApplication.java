package com.bridgelabz.HelloWord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWordApplication {

	public static void main(String[] args) {
		System.out.print("Hello from bridgelbz"); 
		SpringApplication.run(HelloWordApplication.class, args);
	}

}
