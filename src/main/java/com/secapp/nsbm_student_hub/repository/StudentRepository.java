package com.secapp.nsbm_student_hub.repository;


import com.secapp.nsbm_student_hub.model.Student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);

    boolean existsByEmail(String email);
}
