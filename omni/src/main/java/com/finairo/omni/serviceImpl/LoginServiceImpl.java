package com.finairo.omni.serviceImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finairo.omni.entity.UserEntity;
import com.finairo.omni.repository.UserRepository;
import com.finairo.omni.service.LoginService;
import com.finairo.omni.vo.UserVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean validateSignUpRequest(UserEntity userVO) {
		
		try {
			
			if (userVO.getUserName().isBlank()) {
				throw new RuntimeException("UserName Cannot Be Blank"); 
			}else if (userVO.getPassword().isBlank()) {
				throw new RuntimeException("password Cannot Be Blank");
			}else if (userVO.getEmailId().isBlank()) {
				throw new RuntimeException("Email Cannot Be Blank");
			}else if (userVO.getContactNo().isBlank()) {
				throw new RuntimeException("Mobile Number Cannot Be Blank");
			}else if (userVO.getGender().isBlank()) {
				throw new RuntimeException("Gender Cannot Be Blank");
			}
			
			if (!isValidEmail(userVO.getEmailId())) {
				throw new RuntimeException("Inavlid Email Id");
			}
						
			
		}catch(Exception e){
			throw new RuntimeException(e.getMessage());
		}
		return true;
	}
	
	@Override
	public boolean validateLoginRequest(UserEntity userVO) {
		
		try {
			
			if (userVO.getUserName().isBlank()) {
				throw new RuntimeException("UserName Cannot Be Blank"); 
			}else if (userVO.getPassword().isBlank()) {
				throw new RuntimeException("password Cannot Be Blank");
			}
		}catch(Exception e){
			throw new RuntimeException(e.getMessage());
		}
		return true;
	}
	
	public boolean isValidEmail(String email) {
		
		String email_Pattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+.-]+$";
		Pattern pattern = Pattern.compile(email_Pattern);
		Matcher matcher = pattern.matcher(email);		
		
		return matcher.matches();
	}

	@Override
	public boolean createUser(UserEntity userRequest) {
							
		try 
		{	
			UserEntity userEntity = userRepository.findByUserName(userRequest.getUserName());
			if (null == userEntity) {
				userRepository.save(userRequest);
			}else {
				throw new RuntimeException("Username Already Exist , Try With Different Username");
			} 
			
		}catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return true;
	}

	@Override
	public UserVO loginUser(UserEntity userRequest) {	
		
		UserVO userVO = new UserVO();
		
		try {
			UserEntity userEntity = userRepository.findByUserName(userRequest.getUserName());
			if (null == userEntity || !userEntity.getPassword().equals(userRequest.getPassword())) {
				throw new RuntimeException("Invalid Username / Password");
			}
			if (userEntity.getPassword().equals(userRequest.getPassword())) {
				userVO.setToken("=2KNbsJSJBBJ=");			
			}
			
		}catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return userVO;
	}
}
