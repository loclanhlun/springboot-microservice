package com.huynhbaoloc.subscriberservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huynhbaoloc.subscriberservice.converter.UserConverter;
import com.huynhbaoloc.subscriberservice.dto.UserDTO;
import com.huynhbaoloc.subscriberservice.entity.UserEntity;
import com.huynhbaoloc.subscriberservice.repository.UserRepository;
import com.huynhbaoloc.subscriberservice.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserConverter userConverter;

	@Override
	public UserDTO save(UserDTO dto) {
		UserEntity entity = new UserEntity();
		entity = userConverter.toEntity(dto);
		entity = userRepo.save(entity);
		return userConverter.toDTO(entity);
	}

}
