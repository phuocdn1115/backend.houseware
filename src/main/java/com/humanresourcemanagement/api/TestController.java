package com.humanresourcemanagement.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "HEllO WORLD";
	}
	
}

