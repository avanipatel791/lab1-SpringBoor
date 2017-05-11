package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4Application {

	public static void main(String[] args) {

		SpringApplication.run(Lab4Application.class, args);
	}
}
