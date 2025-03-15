package com.finairo.omni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finairo.omni.entity.UserEntity;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findByUserName(String userName);
}
