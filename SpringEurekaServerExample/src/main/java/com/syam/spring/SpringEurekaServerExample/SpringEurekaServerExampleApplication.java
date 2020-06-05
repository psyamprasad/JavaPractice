package com.syam.spring.SpringEurekaServerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerExampleApplication.class, args);
	}

}
