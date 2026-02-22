package com.mk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdProjectApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to GitHub CI/CD Project!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdProjectApplication.class, args);
	}

}
