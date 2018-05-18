package com.profilo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profilo.domain.Project;
import com.profilo.repository.ProjectRepository;

@Service
public class ProjectService {

	private ProjectRepository projectRepository;

	@Autowired
	public ProjectService(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	public Project findFirst() {
		return projectRepository.findFirstByOrderByIdDesc();
	}

	public List<Project> findAll() {
		return projectRepository.findAll();
	}
}
