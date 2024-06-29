package com.example.springDataJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springDataJpa.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
