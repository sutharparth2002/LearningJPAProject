package com.example.springDataJpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(
        name = "course_sequence",
        sequenceName = "course_sequence",
        allocationSize =1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "course_sequence"

    )
    private long courseId;
    private String courseTitle;
    private Integer credit;

    @ManyToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
        name = "teacher_id",
        referencedColumnName = "teacherId"
    )
    private Teacher teacher;

    @ManyToMany(
        cascade = CascadeType.ALL
    )
    @JoinTable(
        name = "student_course_map",
        joinColumns = @JoinColumn(
            name="course_id",
            referencedColumnName = "courseId"
        ),
        inverseJoinColumns=@JoinColumn(
            name="student_id",
            referencedColumnName = "id"
        )
    )
    private List<Student> students;

    public void addStudent(Student student){
        if(students==null)students=new ArrayList<>();
        students.add(student);
    }
    
}

