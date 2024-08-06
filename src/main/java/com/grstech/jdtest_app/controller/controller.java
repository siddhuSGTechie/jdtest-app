package com.grstech.jdtest_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	@GetMapping("/getinfo/{name}/{place}")
	public String getMessage(@PathVariable(name = "name") String name,String place) {
		return "Hi " + name + " Welcome to "+place+"...!" ;
	}
}
