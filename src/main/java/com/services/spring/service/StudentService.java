package com.services.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.feedback.model.dto.OneToOneDTO;
import com.services.model.Address;
import com.services.model.Student;
import com.services.repository.AddressRepository;
import com.services.repository.StudentRepository;

public interface StudentService {

	public void saveOneToOneData(OneToOneDTO dto);	

}
