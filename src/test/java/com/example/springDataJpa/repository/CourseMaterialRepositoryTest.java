package com.example.springDataJpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springDataJpa.entity.Course;
import com.example.springDataJpa.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {
    
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;


    @Test
    public void saveCourseMaterial(){
        Course c=Course.builder().courseTitle("DSA").credit(10).build();
        CourseMaterial cm= CourseMaterial.builder().url("sdffw").course(c).build();
        courseMaterialRepository.save(cm);
        
    }
}
