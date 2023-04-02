package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	// 회원가입 id 중복확인
	List<User> findByUserId(String userId);

	// 로그인 id, pw 확인
	List<User> findByUserIdAndPassword(String userId, String password);

}
