package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/form")
	public String form() {
		
		
		return "form";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute StudentEntity entity) {
		
		
		repo.save(entity);
		return "save";
	}
	
	
	

}
