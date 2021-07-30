package com.mediumstory.springbootfieldvalidation.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediumstory.springbootfieldvalidation.dto.LoginRequestDTO;
import com.mediumstory.springbootfieldvalidation.dto.LoginResponseDTO;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

	@PostMapping
	public ResponseEntity<LoginResponseDTO> performLogin(@Valid @RequestBody LoginRequestDTO loginRequestDTO){
		return ResponseEntity.ok(new LoginResponseDTO("Success !"));
	}
}