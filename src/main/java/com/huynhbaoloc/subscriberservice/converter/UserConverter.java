package com.huynhbaoloc.subscriberservice.converter;

import org.springframework.stereotype.Component;

import com.huynhbaoloc.subscriberservice.dto.UserDTO;
import com.huynhbaoloc.subscriberservice.entity.UserEntity;
@Component
public class UserConverter {

	public UserDTO toDTO(UserEntity entity) {
		UserDTO dto = new UserDTO();
		dto.setId(entity.getId());
		dto.setFirstName(entity.getFirstName());
		dto.setMiddleName(entity.getMiddleName());
		dto.setLastName(entity.getLastName());
		dto.setPhoneNumber(entity.getPhoneNumber());
		dto.setEmail(entity.getEmail());
		dto.setCurrentAddress(entity.getCurrentAddress());
		dto.setCompany(entity.getCompany());
		dto.setPassword(entity.getPassword());
		return dto;
	}
	
	public UserEntity toEntity(UserDTO dto) {
		UserEntity entity = new UserEntity();
		entity.setFirstName(dto.getFirstName());
		entity.setMiddleName(dto.getMiddleName());
		entity.setLastName(dto.getLastName());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setEmail(dto.getEmail());
		entity.setCurrentAddress(dto.getCurrentAddress());
		entity.setCompany(dto.getCompany());
		entity.setPassword(dto.getPassword());
		return entity;
	}
}
