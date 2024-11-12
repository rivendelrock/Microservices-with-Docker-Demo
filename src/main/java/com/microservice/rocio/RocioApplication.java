package com.microservice.rocio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class RocioApplication {

	@GetMapping ("/weatherForecast")
	public String getMessage(){
		return "Today is a great sunny day for a Java Service";
	}

	public static void main(String[] args) {
		SpringApplication.run(RocioApplication.class, args);
	}

}
