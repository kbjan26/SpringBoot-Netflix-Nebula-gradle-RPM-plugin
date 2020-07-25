package com.nebula.rpm.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NebulaRpmSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NebulaRpmSpringBootDemoApplication.class, args);
	}

	@GetMapping("/helloworld")
	public String helloWorld(){
		return "Hello World from Spring Boot RPM Demo";
	}

}
