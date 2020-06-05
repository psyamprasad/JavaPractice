package com.example.springbootexample2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"com.example.springbootexample2.model"} )
public class SpringbootExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExample2Application.class, args);
	}

}
