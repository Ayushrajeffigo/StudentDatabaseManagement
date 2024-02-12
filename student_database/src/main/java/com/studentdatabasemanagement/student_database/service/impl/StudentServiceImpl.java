package com.studentdatabasemanagement.student_database.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdatabasemanagement.student_database.entity.Student;
//import com.studentdatabasemanagement.student_database.entity.Sudent;
import com.studentdatabasemanagement.student_database.repository.StudentRepository;
import com.studentdatabasemanagement.student_database.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
//	studentRepository Constructor
//	we r not using Autowired here because there's only one constructor
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
//	
	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
