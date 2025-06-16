package com.snowflakes.demo.testcontroller;

import com.snowflakes.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.snowflakes.demo.service.StudentService;
import  org.springframework.http.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class Controller {

    @Autowired
    private StudentService studentservice;

    @GetMapping
    public List<Student> getAllStudent()
    {
        return studentservice.getAllStudent();
    }

    @GetMapping("/{id}")
        public ResponseEntity<Student> getStudentById(@PathVariable int id )
        {
            return new ResponseEntity<>(studentservice.getStudentById(id),HttpStatus.OK);
        }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentservice.createStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id,@RequestBody Student student)
    {
        return new ResponseEntity<>(studentservice.updateStudent(id,student),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteStudent(@PathVariable int id )
    {
        studentservice.deleteStudent(id);
        return ResponseEntity.noContent().build(); //provide 204 response that no content is being returned
    }


}
