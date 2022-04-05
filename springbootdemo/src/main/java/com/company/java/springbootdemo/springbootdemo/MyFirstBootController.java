package com.company.java.springbootdemo.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstBootController {
	
	@GetMapping("/hello")
	public String helloReturn() {
		return "hello from boot"; 
	}

}
