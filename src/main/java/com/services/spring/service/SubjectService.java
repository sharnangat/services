package com.services.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.feedback.model.dto.SubjectDTO;
import com.services.model.Subject;
import com.services.repository.SubjectRepository;

@Service
public class SubjectService {

	
	@Autowired
	private SubjectRepository subjectRepository;

	public void addSubject(SubjectDTO dto) {
		

		Subject subject =new Subject();

		subject.setClass_name(dto.getClass_name());
		subject.setSubjectName(dto.getSubjectName());

		subjectRepository.save(subject);

	}
	
   public List<Subject> fetchList(){
	   
	   return (List<Subject>) subjectRepository.findAll();
	   
   }	

}
