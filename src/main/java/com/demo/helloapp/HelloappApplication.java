package com.demo.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HelloappApplication {

	 @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot Jenkins Pipeline!";
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloappApplication.class, args);
	}

}
