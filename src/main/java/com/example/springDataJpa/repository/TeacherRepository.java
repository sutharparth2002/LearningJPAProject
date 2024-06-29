package com.example.springDataJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springDataJpa.entity.Teacher;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long>  {

}
