package com.secapp.nsbm_student_hub.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "students",
        uniqueConstraints = @UniqueConstraint(columnNames = "email")
)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String batch;

    private double gpa;
}
