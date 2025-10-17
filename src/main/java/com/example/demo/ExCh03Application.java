package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.skc.ex_thymleaf", "com.example.demo", "com.skc"})
public class ExCh03Application {

	public static void main(String[] args) {
		SpringApplication.run(ExCh03Application.class, args);
	}

}
