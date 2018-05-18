package com.profilo.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profilo.domain.Project;
import com.profilo.repository.ProjectRepository;

@Service
public class DataLoader {

	private ProjectRepository projectRepository;

	@Autowired
	public DataLoader(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	@PostConstruct
	private void loadData() {
		this.projectRepository.deleteAll();
		for (int i = 0; i < 5; i++) {
			Project project = new Project("Project " + i);
			project.setTime(new Date());
			project.setDescription("Description for project " + i);
			project.setSkills("Skills for project " + i);
			this.projectRepository.save(project);
		}
	}

}
