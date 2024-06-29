package com.example.springDataJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springDataJpa.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("select s from Student s where s.email=?1")
    public Student getStudentByEmailAddress(String email);

    @Modifying
    @Transactional
    @Query(
        value= "update student_table set first_name=?1 where email_address=?2",
        nativeQuery=true
    )
    public void updateStudentByEmail(String name,String email);
}
