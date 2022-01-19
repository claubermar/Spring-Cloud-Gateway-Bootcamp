package com.nttdata.bootcamp.micro2.micro2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test2 {

	@GetMapping(path="/micro2")
	public String hello() {
		return "Hello micro2";
	}
}
