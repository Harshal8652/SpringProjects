package org.jpa.spring_boot_student.service;

import org.jpa.spring_boot_student.dao.Student_Dao;
import org.jpa.spring_boot_student.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service {
	@Autowired
	private Student_Dao dao;
	
	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}
	
	public Student findById(int id) {
		return dao.findById(id);
	}
	
	public Student updateById(Student student, int id) {		
		return dao.updateById(student, id);
	}
	
	public void deleteById(int id) {
		 dao.deleteById(id);
	}
	

}
