package com.services.feedback.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.services.feedback.model.dto.OneToOneDTO;
import com.services.spring.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	private StudentService service;

	@RequestMapping(path = "/oneToOne", method = RequestMethod.POST)
	public ResponseEntity addOneToOne(@RequestBody OneToOneDTO dto) {
        
		service.saveOneToOneData(dto);

		return  new ResponseEntity(dto,HttpStatus.CREATED);

	}
	
	
	@RequestMapping(path="/fetch",method=RequestMethod.GET)

	public void fetchStudentDetails() {
		
		
		
	}
	
}
