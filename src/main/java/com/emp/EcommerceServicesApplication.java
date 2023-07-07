package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EcommerceServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceServicesApplication.class, args);
		System.out.println("Employee Application Started Successfully!!!!!");
	}

}
