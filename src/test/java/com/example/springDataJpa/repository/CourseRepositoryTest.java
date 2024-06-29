package com.example.springDataJpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springDataJpa.entity.Course;
import com.example.springDataJpa.entity.Student;
import com.example.springDataJpa.entity.Teacher;

@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository repo;

    @Test
    public void saveCourseWithTeacherAndStudent(){
        Student student1=Student.builder().email("parths@fdfs").firstName("p").lastName("s").build();
        Student student2=Student.builder().email("parths@ffs").firstName("p").lastName("s").build();
        Teacher teacher=Teacher.builder().firstName("Liza").lastName("pandey").build();
        Course course=Course.builder().courseTitle("AI").credit(8).teacher(teacher).build();
        course.addStudent(student1);
        course.addStudent(student2);
        repo.save(course);
    }
    

}
