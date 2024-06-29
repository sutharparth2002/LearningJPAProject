package com.example.springDataJpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springDataJpa.entity.Course;
import com.example.springDataJpa.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {
    @Autowired
    TeacherRepository teacher;

    // @Test
    // public void saveTeacher(){
    //     Course course= Course.builder().courseTitle("DBA").credit(5).build();
    //     Teacher t=Teacher.builder().firstName("Parth").lastName("Suthar").courses(List.of(course)).build();
    //     teacher.save(t);
    // }

}
