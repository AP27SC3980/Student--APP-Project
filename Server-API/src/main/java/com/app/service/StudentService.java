package com.app.service;

import java.util.List;

import com.app.model.Student;

import jakarta.persistence.Id;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> getStud();

	void deleteByID(Long id);

	Student updateStudent(Long id, Student student);

	

}
