package com.example.springDataJpa.repository;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springDataJpa.entity.Guardian;
import com.example.springDataJpa.entity.Student;
import com.example.springDataJpa.repository.StudentRepository;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository student_repository;

    @Test
    public void saveStudent(){
        Student student=  Student.builder().firstName("parth").lastName("Suthar").email("parthsuthar@gmail.com").build();
        student_repository.save(student);
    }

    @Test
    public void saveWIthGuardianDetails(){
        Guardian guardian= Guardian.builder().name("parth").email("1@gmail.com").mobile("1234556").build();
        Student student=Student.builder().firstName("parth").lastName("Suthar").email("parthsuthar12@gmail.com").guardian(guardian).build();
        student_repository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> students= student_repository.findAll();
        System.out.println("student:"+students);
    }

    @Test
    public void printStudentByMail(){
        Student s=student_repository.getStudentByEmailAddress("Parth@gmail.com");
        System.out.println(s);
    }
    @Test
    public void updateStudentByEmail(){
        student_repository.updateStudentByEmail("parthSuthar","Parth@gmail.com");
        // System.out.println(s);
    }
    
}
