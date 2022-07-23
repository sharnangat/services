package com.services.my.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.services.api.examples.Student;
import com.services.my.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	
	@Override
	public Student addStudent(Student student) {
		
		return studentDao.addStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentDao.getAllStudent();
	}

}