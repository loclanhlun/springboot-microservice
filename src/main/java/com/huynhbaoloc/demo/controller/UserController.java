package com.huynhbaoloc.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.huynhbaoloc.demo.dto.UserDTO;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@PostMapping("/user")
//	public UserDTO addUser(@Valid @RequestBody UserDTO dto) throws URISyntaxException {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		URI uri = new URI("http://subscriber-service/api/user");
//		
//		HttpEntity<UserDTO> httpEntity = new HttpEntity<UserDTO>(dto,headers);
//		
//		UserDTO userDTO = restTemplate.postForObject(uri, httpEntity, UserDTO.class);
//		
//		return userDTO;
//	}
	
	@PostMapping("/user")
	public ResponseEntity<UserDTO> addUser(@Valid @RequestBody UserDTO dto) throws URISyntaxException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		URI uri = new URI("http://subscriber-service/api/user");
		
		HttpEntity<UserDTO> httpEntity = new HttpEntity<UserDTO>(dto,headers);
		
		UserDTO userDTO = restTemplate.postForObject(uri, httpEntity, UserDTO.class);
		
		return ResponseEntity.ok(userDTO);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();

		ex.getBindingResult().getFieldErrors().forEach(error -> 
			errors.put(error.getField(), error.getDefaultMessage()));
		
		return errors;
	}
	
}
