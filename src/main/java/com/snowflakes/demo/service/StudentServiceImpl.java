package com.snowflakes.demo.service;

import com.snowflakes.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.snowflakes.demo.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student createStudent(Student student)
    {
      return studentRepo.save(student);
    }

    @Override
   public Student getStudentById(int id)
    {
        return studentRepo.findById(id).orElseThrow(() -> new RuntimeException("mentioned id is not available" + id));
    }

    @Override
    public List<Student> getAllStudent()
    {
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudent(int id ,Student studentDetails)
    {
        Student student = getStudentById(id);
        student.setName(studentDetails.getName());
        student.setId(studentDetails.getId());
        student.setAddress(studentDetails.getAddress());
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(int id) {

    }

//    @Override
//    public void deleteStudent( Long id )
//    {
//        StudentRepo.deleteById(id);
//    }

}
