package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomepage() {
		return "home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome() {
		return "home";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String getStart() {
		return "start";
	}
	
	@RequestMapping(value = "/plans", method = RequestMethod.GET)
	public String getPlans() {
		return "plans";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getSignUp() {
		return "signup";
	}

}