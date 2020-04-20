package com.services.api.examples;

public class Student {

 private String stdCode;
 private String stdName;

 
 public String getStdCode() {
	return stdCode;
}

public void setStdCode(String stdCode) {
	this.stdCode = stdCode;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
 
 
 
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((stdCode == null) ? 0 : stdCode.hashCode());
	result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (stdCode == null) {
		if (other.stdCode != null)
			return false;
	} else if (!stdCode.equals(other.stdCode))
		return false;
	if (stdName == null) {
		if (other.stdName != null)
			return false;
	} else if (!stdName.equals(other.stdName))
		return false;
	return true;
} 
	
	
}
