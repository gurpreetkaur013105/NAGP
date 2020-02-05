package com.nagarro.service;

import com.nagarro.model.Student;
import com.nagarro.model.Teacher;

public interface UserService {

	
	Student addStudent(Student student);
	
	String removeStudent(String id);
	
	Teacher addTeacher(Teacher teacher);
}
