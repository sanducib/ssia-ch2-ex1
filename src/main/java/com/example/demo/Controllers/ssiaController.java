package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ssiaController {
	
	@GetMapping(path = "/hello")
	
	public String hello() {
		return "hello ssia-ch2-ex1";
	}

}
