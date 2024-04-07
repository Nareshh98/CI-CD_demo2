package com.Docker2.Docker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Docker2Application {

	@GetMapping("/hello")
	public String greetings(){
		return "hello naresh";
	}

	public static void main(String[] args) {
		SpringApplication.run(Docker2Application.class, args);
	}

}
