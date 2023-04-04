package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// AuditionEntityListener 사용하기 위하여 어플리케이션 구동 클래스에 작성
@EnableJpaAuditing
@SpringBootApplication
public class DietManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DietManagementApplication.class, args);
	}

}
