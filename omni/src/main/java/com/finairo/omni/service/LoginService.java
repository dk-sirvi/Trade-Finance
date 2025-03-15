package com.finairo.omni.service;

import com.finairo.omni.entity.UserEntity;
import com.finairo.omni.vo.UserVO;

public interface LoginService {
	
	public boolean validateSignUpRequest(UserEntity userVO);
	
	public boolean createUser(UserEntity userVO);
	
	public UserVO loginUser(UserEntity userVO);
	
	public boolean validateLoginRequest(UserEntity userVO);

}
