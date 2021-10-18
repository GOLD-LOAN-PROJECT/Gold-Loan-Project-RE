package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ReGoldLoanProjectApplication {

	public static void main(String[] args) {
		System.out.println("relational exe");
		SpringApplication.run(ReGoldLoanProjectApplication.class, args);
	}

}
