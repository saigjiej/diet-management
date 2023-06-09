package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name="user")
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class User extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100, name="userId", nullable = false)
	private String userId;
	
	@Column(length = 100, name="password", nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<FoodStorage> foodStorage = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<BMI> bmiList = new ArrayList<>();
}
