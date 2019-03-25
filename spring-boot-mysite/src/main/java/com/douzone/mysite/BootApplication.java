package com.douzone.mysite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 위 어노테이션을 대체
@SpringBootApplication
public class BootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
