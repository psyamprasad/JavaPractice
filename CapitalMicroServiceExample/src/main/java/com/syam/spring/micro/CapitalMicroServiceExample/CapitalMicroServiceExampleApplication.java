package com.syam.spring.micro.CapitalMicroServiceExample;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients 
@RibbonClient(name="countries-service", configuration = RibbonConfiguration.class)
public class CapitalMicroServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapitalMicroServiceExampleApplication.class, args);
	}

}
