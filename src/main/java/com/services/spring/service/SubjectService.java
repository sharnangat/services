package com.services.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.model.Subject;
import com.services.repository.SubjectRepository;

@Service
public class SubjectService {

	
	@Autowired
	private SubjectRepository subjectRepository;

	public void addSubject(Subject subject) {
		
		
		System.out.println(subject.getClass_name() +   "   "+ subject.getSubjectName());

		subjectRepository.save(subject);

	}

}
