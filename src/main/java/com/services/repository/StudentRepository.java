package com.services.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.services.model.Student;

@Repository
public interface StudentRepository<id> extends CrudRepository<Student, id> {

	
	@Query(nativeQuery=true,value="Select * from Student where student_id=?1")
	public Optional<Student> getStudent(int id);

}
