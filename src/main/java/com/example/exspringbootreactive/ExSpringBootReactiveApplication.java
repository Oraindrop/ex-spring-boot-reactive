package com.example.exspringbootreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
public class ExSpringBootReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExSpringBootReactiveApplication.class, args);
	}

}
