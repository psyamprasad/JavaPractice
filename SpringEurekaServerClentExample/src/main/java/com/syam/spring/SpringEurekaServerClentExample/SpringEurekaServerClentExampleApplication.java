package com.syam.spring.SpringEurekaServerClentExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaServerClentExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerClentExampleApplication.class, args);
	}

}
