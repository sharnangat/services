package com.services.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.services.model.Address;
import com.services.model.Student;
import com.services.model.UserOneTable;

@Repository
public interface StudentRepository<id> extends CrudRepository< Student,id>{

}
