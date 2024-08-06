package com.grstech.jdtest_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	@GetMapping("/getinfo/{name}")
	public String getMessage(@PathVariable(name = "name") String name) {
		return "Hi " + name + " Welcome to singapore...!" ;
	}
}
