package com.finairo.omni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finairo.omni.entity.UserEntity;
import com.finairo.omni.service.LoginService;
import com.finairo.omni.vo.UserVO;
import com.finairo.omni.vo.responseVO;

@RestController
public class LoginController {
	
	
	@Autowired
	private LoginService loginService;

	@PostMapping("/signUp")
	private ResponseEntity<?> userSignUp(@RequestBody UserEntity userRquest) {
				
		try {
			
			Boolean validRequest = loginService.validateSignUpRequest(userRquest);
			
			if (validRequest) {				
				
				loginService.createUser(userRquest);				
			}
			
									
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);			
		}		
		
		return new ResponseEntity<>("User Created Succesfully!", HttpStatus.OK);
	}
	

	@PostMapping("/login")
	private ResponseEntity<?> userLogin(@RequestBody UserEntity userRquest) {			
		
		UserVO userVO = new UserVO();
		try {
			
			Boolean validRequest = loginService.validateLoginRequest(userRquest);
			
			if (validRequest) {								
				
				userVO = loginService.loginUser(userRquest);	
				
				if (null != userVO) {
					return new ResponseEntity<>(new responseVO("Successfull Login", userVO.getToken(),HttpStatus.OK), HttpStatus.OK);
				}
			}
											
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);			
		}		
		
		return new ResponseEntity<>("Successfull Login", HttpStatus.OK);
	}


}
