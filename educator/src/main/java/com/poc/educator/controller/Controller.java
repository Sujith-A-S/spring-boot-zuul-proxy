package com.poc.educator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.educator.dto.Educator;

@RestController
public class Controller {
	
	
	@GetMapping("/getDetails")
	public Educator getDetails() {
		Educator educator=new Educator("Padma","XI");
		
		return educator;
	}

}
