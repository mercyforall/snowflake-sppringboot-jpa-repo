package com.snowflakes.demo.service;

import com.snowflakes.demo.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudent();
    Student updateStudent(int id ,Student student);
    void deleteStudent(int id);

}
