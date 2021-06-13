package com.services.feedback.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.services.feedback.model.dto.OneToOneDTO;
import com.services.spring.service.OneToOneService;

@RestController

public class StudentController {

	@Autowired
	private OneToOneService service;

	@RequestMapping(path = "/oneToOne", method = RequestMethod.POST)
	public ResponseEntity addOneToOne(@RequestBody OneToOneDTO dto) {
        
		service.saveOneToOneData(dto);

		return  new ResponseEntity(dto,HttpStatus.CREATED);

	}

}
