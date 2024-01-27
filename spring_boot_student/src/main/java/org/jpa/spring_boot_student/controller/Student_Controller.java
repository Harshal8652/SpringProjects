package org.jpa.spring_boot_student.controller;

import org.jpa.spring_boot_student.dto.Student;
import org.jpa.spring_boot_student.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	@Autowired
	private Student_Service service;
	
	@PostMapping("/save/student")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("/find/student/{id}")
	public Student findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PutMapping("/update/student/{id}")
	public Student updateById(@RequestBody Student student,@PathVariable int id) {		
		return service.updateById(student, id);
	}
	
	@DeleteMapping("/delete/student/{id}")
	public void deleteById(@PathVariable int id) {
		 service.deleteById(id);
	}
	

}
