package com.idat.MSPizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfRicardoLeonMsPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfRicardoLeonMsPizzeriaApplication.class, args);
	}

}
