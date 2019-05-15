package com.devhoss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RccServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RccServiceApplication.class, args);
	}

}
