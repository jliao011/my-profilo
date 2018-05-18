package com.profilo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.profilo.domain.Project;
import com.profilo.repository.ProjectRepository;
import com.profilo.service.DataLoader;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan
public class MyProfiloApplication {

	private static final Logger logger = LoggerFactory.getLogger(MyProfiloApplication.class);

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(MyProfiloApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(MyProfiloApplication.class, args);
//		WebConfig config = (WebConfig) context.getBean("webConfig");
//		System.out.println(config.toString());

	}

	@PostConstruct
	void seeProject() {
		logger.info("see projects");
		for (Project project : projectRepository.findAll())
			logger.info(project.toString());
	}
}
