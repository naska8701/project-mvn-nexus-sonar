package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		String name = "Nasir";

		System.out.println(name);

		Integer age = "37";

		System.out.println(age + 3);
		
	}

}
