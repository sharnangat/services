package com.services.my.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.api.examples.Student;
import com.services.my.service.StudentService;

@RestController
public class StudentController {
	
	private StudentService studentService;

	@PostMapping("/addcustomer")
	
	public ResponseEntity<Student> addStudent(Student student)
	{
		Student newStudent = studentService.addStudent(student);
		return new ResponseEntity<Student> (newStudent, HttpStatus.CREATED);
		
	}
	
	public List<Student> getAllStudent()
	{
		List<Student> allstd = studentService.getAllStudent();
		return allstd;
		
	}
}
