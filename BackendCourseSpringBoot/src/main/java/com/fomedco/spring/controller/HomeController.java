package com.fomedco.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/log")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/logout")
	public String loggedOut() {
		return "logout";
	}
	

}
