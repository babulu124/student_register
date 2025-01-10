package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String register(@ModelAttribute StudentEntity entity, Model model) {
		model.addAttribute("model", entity);
		repo.save(entity);
		return "save";
	}
	@GetMapping("/records")
	public String records(Model model) {
		
		List<StudentEntity> entity=repo.findAll();
		model.addAttribute("list",entity);
		return "record";
	}
	
	

}
