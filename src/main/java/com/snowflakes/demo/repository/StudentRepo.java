package com.snowflakes.demo.repository;

import com.snowflakes.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository <Student,Integer> {
//    static void deleteById(Long id) {
//    }

//    @Autowired
//    public Studentclass studentclass;
}
