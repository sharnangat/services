package com.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.services.model.Subject;

@Repository
public interface SubjectRepository<subjectid> extends CrudRepository<Subject, subjectid> {

	@Query(nativeQuery = true, value = "select * from subject_tbl where class_name like %?1")
	List<Subject> findByCourse(String courseName);

}
