package com.example.demo.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="user")
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 생성
	private Long userNm;

	@Column(length = 100, name="userId", nullable = false)
	private String userId;
	
	@Column(length = 100, name="password", nullable = false)
	private String password;
	
	@CreatedDate
	private LocalDateTime joinDate;
	
	

}
