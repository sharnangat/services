package com.services.feedback.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.services.feedback.model.dto.SubjectDTO;

@RestController
@RequestMapping(value="/feedback/subject")
public interface SubjectInterface {

	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addSubject();

	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity updateSubject(@RequestBody SubjectDTO subjectDto);

	
}
