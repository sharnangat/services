package com.services.feedback.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.services.feedback.model.dto.OneToOneDTO;
import com.services.model.Student;
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
	public ResponseEntity fetchStudentDetails() {
		
		
		List<Student> stdList = service.fetchStudents();
		
		return new ResponseEntity(stdList,HttpStatus.OK);
		
	}
	
	@RequestMapping(path="/id",method=RequestMethod.GET)
	
	public ResponseEntity fetchByName(@RequestParam int id) {
		
		try
		{
		Student student=service.fetchById(id);
		return new ResponseEntity(student,HttpStatus.OK);
		} catch(Exception e) {
			
			return new ResponseEntity(null,HttpStatus.NO_CONTENT);
		}
		
	}
	
	
	
}
