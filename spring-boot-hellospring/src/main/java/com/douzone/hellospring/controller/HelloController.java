package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	// 만드는 클래스들은 POJO이다
	
	// @RequestMapping   -   특정 URL을 매핑한다.
	// @ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello"; // 내부적으로 forwarding 기능 실행
	}
}
