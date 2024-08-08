package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
    @PostMapping("/addStudent")
	public Student createNewStudent(@Valid @RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents()
    {
    	return studentService.getStud();
    }
    @DeleteMapping("/deleteByID/{id}")
    public void deleteByID(@PathVariable Long id)
    {
    	studentService.deleteByID(id);
    }

    
    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student)
    {
    	return studentService.updateStudent(id,student);
    }
    
    
    
}
