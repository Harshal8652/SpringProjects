package org.jpa.spring_boot_student.dao;

import org.jpa.spring_boot_student.dto.Student;
import org.jpa.spring_boot_student.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Student_Dao {
	@Autowired
	private Student_Repository repository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public Student findById(int id) {
		return repository.findById(id);
	}
	
	public Student updateById(Student student, int id) {
		student.setId(id);
		return repository.save(student);
	}
	
	public void deleteById(int id) {
		 repository.deleteById(id);
	}

}
