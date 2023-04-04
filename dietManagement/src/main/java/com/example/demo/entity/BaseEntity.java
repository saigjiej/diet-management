package com.example.demo.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@EntityListeners(AuditingEntityListener.class)
//해당 클래스를 상속받는 엔티티에서 해당 클래스의 필드를 컬럼으로 사용가능함
@MappedSuperclass
@Data
public class BaseEntity {
	@CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
