package com.services.my.service;

import java.util.List;

import com.services.api.examples.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public List<Student> getAllStudent();

}
