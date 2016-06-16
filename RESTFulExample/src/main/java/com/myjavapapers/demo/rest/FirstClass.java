package com.myjavapapers.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class FirstClass {

	@RequestMapping(value = "/print")
	public String printDetails(ModelMap model){
		model.addAttribute("msg", "JCG Hello World!");
		return "print";
	}
	
	@RequestMapping(value = "/details/{msg}")
	public String getDetails(@PathVariable String msg, ModelMap model){
		model.addAttribute("msg", msg);
		System.out.println("Testing me");
		return "print";
	}
	
}
