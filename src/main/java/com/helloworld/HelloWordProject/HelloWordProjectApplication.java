package com.helloworld.HelloWordProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.helloworld.HelloWordProject.repository")
@EntityScan(basePackages = "com.helloworld.HelloWordProject.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class HelloWordProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWordProjectApplication.class, args);
	}

}
