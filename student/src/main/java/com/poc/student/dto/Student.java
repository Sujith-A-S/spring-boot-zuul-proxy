package com.poc.student.dto;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

public class Student {
	
	private String studentName;
	private String studentClass;
	
	
	public Student(String studentName, String studentClass) {
		
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	

}
