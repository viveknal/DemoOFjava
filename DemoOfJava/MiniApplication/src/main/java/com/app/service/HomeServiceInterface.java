package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface HomeServiceInterface {

	public void saveStudent(Student stu);
	
	public List<Student> getAllData();

}
