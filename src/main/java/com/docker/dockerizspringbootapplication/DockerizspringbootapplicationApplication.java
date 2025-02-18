package com.docker.dockerizspringbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerizspringbootapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizspringbootapplicationApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to dockerize container";
	}

}
