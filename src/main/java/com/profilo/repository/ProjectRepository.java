package com.profilo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.profilo.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
	Project findFirstByOrderByIdDesc();

	List<Project> findAll();
}
