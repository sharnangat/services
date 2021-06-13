package com.services.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.feedback.model.dto.OneToOneDTO;
import com.services.model.Address;
import com.services.model.Student;
import com.services.repository.AddressRepository;
import com.services.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private AddressRepository addressRepo;

	public void saveOneToOneData(OneToOneDTO dto) {

		Student student = new Student(dto.getFirstName(), dto.getLastName(), dto.getSection());
		Address address = new Address(dto.getStreet(), dto.getStreet(), dto.getCountry());

		addressRepo.save(address);
		student.setAddress(address);
		studentRepo.save(student);

	}

}
