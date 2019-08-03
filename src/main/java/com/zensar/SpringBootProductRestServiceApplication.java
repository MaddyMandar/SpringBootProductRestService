package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProductRestServiceApplication {

	public static void main(String[] args) {
		//Bootstrapping method
		SpringApplication.run(SpringBootProductRestServiceApplication.class, args);
		System.out.println("Hello Universe");
	}

}
