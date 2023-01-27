package com.example.MultiStage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@RequestMapping("/home")
	public String home() {
		return "Welcome !!!";
	}
}
