package com.services.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.services.model.Subject;


@Repository
public interface SubjectRepository<subjectid> extends CrudRepository<Subject, subjectid> {

}
