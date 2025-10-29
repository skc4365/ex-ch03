package com.skc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@ComponentScan(basePackages = { "com.skc.demo", "com.skc.mybatis", "com.skc.ex_thymleaf" })
//@MapperScan("com.skc.mybatis")
@SpringBootApplication
public class ExCh03Application {

	public static void main(String[] args) {
		SpringApplication.run(ExCh03Application.class, args);
	}

}
