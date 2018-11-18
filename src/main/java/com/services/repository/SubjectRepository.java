package com.services.repository;

import org.springframework.data.repository.CrudRepository;

import com.services.model.Subject;

public interface SubjectRepository<subjectid> extends CrudRepository<Subject, subjectid> {

}
