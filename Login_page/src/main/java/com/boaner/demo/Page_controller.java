package com.boaner.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Page_controller {
	
	@RequestMapping(value ="Login_Home", method = RequestMethod.GET)
	public String home () {
		
		return "Login_Home";
	}

}
