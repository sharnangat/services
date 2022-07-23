package com.services.my.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.services.api.examples.Student;
import com.services.my.repo.StudentRepository;

@Component
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		Student saveStudent = studentRepository.save(student);
		return saveStudent;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> std = studentRepository.findAll();
		return std;
	}

}
