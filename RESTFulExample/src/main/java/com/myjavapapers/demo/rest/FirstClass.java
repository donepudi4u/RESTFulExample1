package com.myjavapapers.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class FirstClass {

	@RequestMapping(value = "/print")
	public void printDetails(){
		System.out.println("You are printing me");
	}
	
	@RequestMapping(value = "/details")
	public String getDetails(){
		System.out.println("Testing me");
		return "You are getting me";
	}
	
}
