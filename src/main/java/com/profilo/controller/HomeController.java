package com.profilo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Value("${msg}")
	String msg;
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("msg", msg);
		return "/index";
	}
}
