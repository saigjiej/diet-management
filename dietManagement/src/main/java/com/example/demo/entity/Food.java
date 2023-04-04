package com.example.demo.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name="food")
@Table(name="food")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Food extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100, name="foodName", nullable = false)
	private String foodName; //음식명
	
	@Column(length = 100, name="kcal", nullable = false)
	private int kcal; //칼로리
	
	@Column(length = 100, name="standard", nullable = false)
	private int standard; //기준(g)
	
	@Column(length = 100, name="status", nullable = false)
	private int status; //상태
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
}
