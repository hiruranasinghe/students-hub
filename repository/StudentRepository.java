package com.secapp.nsbm_student_hub.repository;


import com.secapp.nsbm_student_hub.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
