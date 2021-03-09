package com.huynhbaoloc.subscriberservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynhbaoloc.subscriberservice.dto.UserDTO;
import com.huynhbaoloc.subscriberservice.service.IUserService;

@RestController
@RequestMapping(value = "/api")
public class UserController {
	@Autowired
	private IUserService userService;
	
//	@PostMapping(value = "/user")
//	public UserDTO addUser(@Valid @RequestBody UserDTO dto ){
//		
//		return userService.save(dto);
//	}
	
	@PostMapping(value = "/user")
	public ResponseEntity<UserDTO> addUser(@Valid @RequestBody UserDTO dto){
		userService.save(dto);
		
		return ResponseEntity.ok(dto);
	}
	
	
	
	
	
	

}
