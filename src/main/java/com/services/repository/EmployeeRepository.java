package com.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
