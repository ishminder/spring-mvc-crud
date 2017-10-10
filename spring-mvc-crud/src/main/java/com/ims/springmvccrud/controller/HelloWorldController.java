package com.ims.springmvccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView printHello() 
	{
		String msg="Hello, Your First Spring MVC Project";
		return new ModelAndView("helloPage","msg",msg);
		
	} 
}
