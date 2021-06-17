package com.devops.lab21.devopspractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class SampleController {
	
	@RequestMapping("/demo")
	public String testMethod() {
		
		return "welcome to spring boot";
	}
	
}