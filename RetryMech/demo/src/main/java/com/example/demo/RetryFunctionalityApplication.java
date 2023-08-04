package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class RetryFunctionalityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetryFunctionalityApplication.class, args);
	}

}
