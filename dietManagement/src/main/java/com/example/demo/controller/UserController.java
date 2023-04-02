package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 회원가입 이동
	@GetMapping("/join")
	public String joinView() {
		return "signUp";
	}
	
	// 회원가입
	@RequestMapping(value = "/signUp.do", method = RequestMethod.POST)
	public String join(User user, HttpServletRequest request,
			@RequestParam(value="userId", required=true) String userId) {
		
		List<User> joinId = userService.findByUserId(userId);
		// 중복확인
		int idCheck = joinId.size();
		
		if(idCheck != 0) {
			request.setAttribute("msg", "아이디를 사용하실 수 없습니다.");
			request.setAttribute("url", "/join");
			
			return "alert";
		}
		
		userService.joinUser(user);
		
		return "login";
	}
	
	// 로그인 이동
	@GetMapping("/login")
	public String loginView() {
		return "login";
	}
	
	// 로그인 id, password 확인
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request,
			@RequestParam(value="userId", required=true) String userId,
			@RequestParam(value="password", required=false) String password) {
			
		List<User> user = userService.findByUserIdAndPassword(userId, password);
		// id, password 확인(수정)
		int sizeCheck = user.size();
			
		if(sizeCheck == 0) {
			request.setAttribute("msg", "아이디 혹은 비밀번호가 일치하지 않습니다");
			request.setAttribute("url", "/login");
			return "alert";
		}
			
		return "main";
	}
	
}
