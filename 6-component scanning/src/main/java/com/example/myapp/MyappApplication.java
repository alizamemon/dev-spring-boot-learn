package com.example.myapp;

import org.springframework.boot.SpringApplication;
//enables autoconfig, component scanning and additional configuration
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.example.myapp.util", "com.example.myapp.rest"})
@SpringBootApplication
public class MyappApplication {


	 public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
}