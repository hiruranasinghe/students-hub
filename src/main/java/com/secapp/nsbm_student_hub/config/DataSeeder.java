package com.secapp.nsbm_student_hub.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.secapp.nsbm_student_hub.model.Role;
import com.secapp.nsbm_student_hub.model.User;
import com.secapp.nsbm_student_hub.repository.RoleRepository;
import com.secapp.nsbm_student_hub.repository.UserRepository;

public class DataSeeder implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        Role adminRole = roleRepository.findByRole("ROLE_ADMIN")
                .orElseGet(() -> roleRepository.save(new Role(null, "ROLE_ADMIN")));

        Role userRole = roleRepository.findByRole("ROLE_USER")
                .orElseGet(() -> roleRepository.save(new Role(null, "ROLE_USER")));

        if (userRepository.findByUsername("admin").isEmpty()) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("admin123"));
            admin.setRole(adminRole);
            userRepository.save(admin);
        }

        if (userRepository.findByUsername("user").isEmpty()) {
            User user = new User();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("user123"));
            user.setRole(userRole);
            userRepository.save(user);
        }
    }
}
