package com.adinfost.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AdinfostApplication{

	public static void main(String[] args) {
		SpringApplication.run(AdinfostApplication.class, args);
	}
}
