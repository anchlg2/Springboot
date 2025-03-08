package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // controller is the endpoint of project through which client can interact with java code
public class MainController {
	@RequestMapping("/home")  // when you hit /home url home.jsp view dikhega
public String home()  //handler method
{
	System.out.println("This is home page");
	return "home"; //view name
}

	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("This is contact page");
		return "contact";
	}
}
