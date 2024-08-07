package com.example.helloWorld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/demo-student")
public class DemoController {
	@GetMapping("/api/demo-student")
	@PreAuthorize("hasAnyRole('STUDENT', 'ADMIN')")
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hello Student");
	}
	
	@GetMapping("/api/demo-admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> sayAdminHello(){
		return ResponseEntity.ok("Hello Admin!!");
	}
}
