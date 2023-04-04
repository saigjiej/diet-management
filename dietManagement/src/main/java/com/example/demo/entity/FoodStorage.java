package com.example.demo.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name="foodStorage")
@Table(name="foodStorage")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class FoodStorage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100, name="foodName", nullable = false)
	private String foodName; //음식명
	
	@Column(length = 100, name="kcal", nullable = false)
	private int kcal; //칼로리
	
	@Column(length = 100, name="standard", nullable = false)
	private int standard; //기준(g)
	
	@Column(length = 100, name="registrant", nullable = false)
	private String registrant; //등록자

}
