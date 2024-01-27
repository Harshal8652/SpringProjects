package org.jpa.spring_boot_student.repository;

import org.jpa.spring_boot_student.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Student_Repository extends JpaRepository<Student, Integer>{
	Student save (Student student);
	
	Student findById (int id);
	
}
