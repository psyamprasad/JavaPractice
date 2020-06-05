package com.example.springBootMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	//@RequestMapping("/")
	@GetMapping("/")
	public String index()
	{
		System.out.println("------------------->-----------");
		return "index";
		
	}
	
	   @PostMapping("/hello")
	   public String sayHello(@RequestParam("name") String name, Model model) 
	   {
		System.out.println("<----before--->");
	      model.addAttribute("name",name);
	      System.out.println("<----after--->");
	      return "hello";
	   }
	
}
