package com.elliot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootAddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAddApplication.class, args);
	}
}
