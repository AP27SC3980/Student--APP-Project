package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repo.StudentRepository;

import jakarta.persistence.Id;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStud() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void deleteByID(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		
		if(studentRepository.findById(id)!=null)
		{
			Student s=new Student();
			s.setId(student.getId());
			s.setFirstName(student.getFirstName());
			s.setLastName(student.getLastName());
			s.setAddress(student.getAddress());
			s.setAge(student.getAge());
			s.setDateOfBirth(student.getDateOfBirth());
			s.setEmail(student.getEmail());
			studentRepository.save(s);
		}
		return null;
	}

	
	
}
