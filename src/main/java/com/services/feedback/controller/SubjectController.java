package com.services.feedback.controller;

import org.springframework.http.ResponseEntity;

import com.services.feedback.model.dto.SubjectDTO;

public class SubjectController extends AbstractSubjectController {

	@Override
	public String addSubject() {
		// TODO Auto-generated method stub
		return "Success";
	}

	@Override
	public ResponseEntity updateSubject(SubjectDTO subjectDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
