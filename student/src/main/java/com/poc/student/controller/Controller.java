package com.poc.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.student.dto.Student;

@RestController
public class Controller {
	
	
	@GetMapping("/getDetails")
	public Student getDetails() {
		
		
		Student student=new Student("Sujith", "XI");
		
		return student;
		
	}

}
