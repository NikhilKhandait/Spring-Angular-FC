package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.dto.UserDTO;

@RestController
@RequestMapping(value = "Test")
public class TestCtl {
	
	@GetMapping
	public UserDTO display() {
		UserDTO dto = new UserDTO();
		
		
		dto.setFirstName("nikhil");
		dto.setLastName("khandait");
		dto.setLoginId("khandaitnikhil@gmail.com");
		dto.setPassword("nikhil@123");
		
    	return dto;
	}

} 
