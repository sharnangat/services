package com.services.my.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int studentId;
	private int firstName;
	private String lastName;
	public Student(int studentId, int firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getFirstName() {
		return firstName;
	}
	
	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
