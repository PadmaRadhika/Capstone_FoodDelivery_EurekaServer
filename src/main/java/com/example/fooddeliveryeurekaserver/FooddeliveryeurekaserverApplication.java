package com.example.fooddeliveryeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FooddeliveryeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooddeliveryeurekaserverApplication.class, args);
	}

}
