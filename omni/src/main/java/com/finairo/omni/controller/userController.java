package com.finairo.omni.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finairo.omni.entity.UserEntity;

@RestController
public class userController {

	@PostMapping("/createUser")
	public String createUser(UserEntity userEntity) {
		
		return null;		
	}
	
	@PostMapping("/updateUser")
	private String updateUser(UserEntity userEntity) {
		return null;
	}

	@PostMapping("/deleteUser")
	private String deleteUser(UserEntity userEntity) {
		return null;
	}

	@PostMapping("/changePassword")
	private String changePassword(UserEntity userEntity) {
		return null;
	}
	
	@PostMapping("/forgotPassword")
	private String forgotPassword(UserEntity userEntity) {
		return null;
	}
}
