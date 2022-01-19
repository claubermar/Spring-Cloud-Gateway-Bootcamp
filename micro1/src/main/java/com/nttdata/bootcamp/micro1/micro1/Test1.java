package com.nttdata.bootcamp.micro1.micro1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {
 
	@GetMapping(path="/micro1")
	public String hello() {
		return "Hello micro1";
	}
}
