package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 어노테이션 활성화
@SpringBootApplication
public class DietManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DietManagementApplication.class, args);
	}

}
