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

@Entity(name="bmi")
@Table(name="bmi")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BMI extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100, name="height", nullable = false)
	private int height; //신장
	
	@Column(length = 100, name="weight", nullable = false)
	private int weight; //체중
	
	@Column(length = 100, name="bmiShame", nullable = false)
	private int bmiShame; //bmi 지수
	
	@Column(length = 100, name="bmiResults", nullable = false)
	private String bmiResults; //비만도 결과
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
