package com.example.springboot;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Timed(value = "hellocontroller.time", description = "Time taken to return hello")
	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
