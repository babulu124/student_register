package com.example.demo.loginController;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Controller
public class Login {

	@Autowired
	private StudentRepo repo;

	@GetMapping("/")
	public String home() {

		return "home";
	}

	@PostMapping("/login")
	public String login(@RequestParam("userid") String userid, @RequestParam("password") String password,Model model){
		
		
		
		if((userid).equals("1213") && (password).equals("1415"))
		return "form";
		
		else {
			model.addAttribute("message","UserId or Password is wrong");
			return "home";
			
		}
	}
		@GetMapping("/search")
		public String stu() {
			
			
			return "search";
		}
		
		@PostMapping("/findstu")
		public String findStu(@RequestParam("id") int id, Model model) {
			
			Optional<StudentEntity> list=repo.findById(id);
			
			try {
			
			if(list!=null) {
				StudentEntity stu=list.get();
				model.addAttribute("id", stu);
				
				return "student";
			}
			else
				model.addAttribute("call","Your ID is Wrong");
				return "search";
			
			}
			catch(NoSuchElementException e) {
				
				model.addAttribute("call","Your ID is Wrong");
				return "search";
			
				
			}
			
			
			
			
			
			
			
		
		
	}

}
