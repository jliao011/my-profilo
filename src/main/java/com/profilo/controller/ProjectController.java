package com.profilo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.profilo.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {

	private ProjectService projectService;

	@Autowired
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@RequestMapping
	public String projectPage(Model model) {
		model.addAttribute("project", projectService.findAll());
		return "views/project";
	}
}
