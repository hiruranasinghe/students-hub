package com.secapp.nsbm_student_hub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secapp.nsbm_student_hub.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRole(String role);

}
