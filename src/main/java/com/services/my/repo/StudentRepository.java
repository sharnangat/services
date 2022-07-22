package com.services.my.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.api.examples.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
