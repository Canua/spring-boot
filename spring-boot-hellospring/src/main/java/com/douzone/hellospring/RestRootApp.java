package com.douzone.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestRootApp {

	// inner class
	@RestController
	public class MyController {
		@Autowired
		MyService myService;

		@GetMapping("/hello")
		public String hello() {
			// return "Hello World"
			return myService.hello();
		}
	}

	// Component Scanning
	@ComponentScan
	public class MyService {
		public String hello() {
			return "Hello World";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
