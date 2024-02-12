package com.studentdatabasemanagement.student_database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//control Annotations class to handle the request n all
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentdatabasemanagement.student_database.entity.Student;
import com.studentdatabasemanagement.student_database.service.StudentService;


@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/student")
	public String listStudent(Model model)//Model interface and provide communication between controller and view in spring mvc applications
	{
		model.addAttribute("student",studentService.getAllStudents()); // key value pair like structure
		return "student"; //for same as html file name
		
	}
	@GetMapping("/student/new")
	public String CreateStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	@PostMapping("/student")
	public String saveStudent(@ModelAttribute("student")Student students)
	{
		studentService.saveStudent(students);
		return "redirect:/student";
	}
	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/student";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/student";
	}

}
