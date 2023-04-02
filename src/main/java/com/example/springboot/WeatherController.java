package com.example.springboot;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	@Timed(value = "weathercontroller.time", description = "Time taken to return weather")
	@GetMapping("/weather")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
