package com.camoleze.gradecurricular.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materia")
public class MateriaController {

	@GetMapping("/online")
	public ResponseEntity<String> isOnLine(){
		return ResponseEntity.status(HttpStatus.OK).body("API On!");
	}
	
}
