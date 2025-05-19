package com.example.HelloWorldDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("Message","This is a Custon Message");
		return "message";
	}
	
	
}



