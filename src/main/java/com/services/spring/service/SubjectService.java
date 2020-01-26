package com.services.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.model.Subject;
import com.services.repository.SubjectRepository;

public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	public void addSubject(Subject subject) {

		subjectRepository.save(subject);

	}

}
