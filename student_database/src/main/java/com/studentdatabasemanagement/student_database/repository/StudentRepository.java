package com.studentdatabasemanagement.student_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentdatabasemanagement.student_database.entity.Student;

//this will control all crud operations or u can say controls
public interface StudentRepository extends JpaRepository<Student, Long>{

}
