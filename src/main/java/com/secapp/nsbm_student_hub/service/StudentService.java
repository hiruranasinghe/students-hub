package com.secapp.nsbm_student_hub.service;

import com.secapp.nsbm_student_hub.model.Student;
import org.springframework.data.domain.Page;

public interface StudentService {

    Student saveStudent(Student student);

    Page<Student> getAllStudents(int page, int size, String sortBy);

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

}
