package com.example.springDataJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springDataJpa.entity.CourseMaterial;


@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {

}
