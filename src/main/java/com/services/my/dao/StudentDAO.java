package com.services.my.dao;

import java.util.List;

import com.services.api.examples.Student;

public interface StudentDAO  {
	
	public Student addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	

}
