package com.huynhbaoloc.subscriberservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huynhbaoloc.subscriberservice.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
}
