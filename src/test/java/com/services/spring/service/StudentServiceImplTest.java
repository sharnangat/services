package com.services.spring.service;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import com.services.api.examples.Student;
import com.services.repository.StudentRepository;

public class StudentServiceImplTest {
	
	@Autowired
	@Mock
	private StudentRepository studentRepo;
	
	private StudentService studentService;
	

	@Test
	public void testFetchStudents() {
		
		List<Student> std= new ArrayList<>();
	//	std.add(new Student("sayali", "patil", "c"));
		
		Student std1 = new Student();
		std1.setStdCode("abc");
		std1.setStdName("sayali");
		std.add(std1);
		when(studentRepo.findAll())
		.thenReturn(std);
	assertEquals(std, 1);
		
		
	}
	
//	public void testFeatchStudentNull()
//	{
//		when(studentRepo.findAll()).thenReturn(emptyList());
//		assertThat(studentService.fetchStudents()).isZero();
//		
//	}
//	
//	public void testFeatchStudentonetoone() {
//		
//		when(studentRepo.findAll()).thenReturn(asList(new Student("aa", "dfg" )));
//		assertThat(studentService.fetchStudents()).isEqualTo(1);
//		
//		
//	}

}
