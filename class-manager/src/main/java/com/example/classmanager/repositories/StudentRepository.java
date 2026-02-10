package com.example.classmanager.repositories;

import com.example.classmanager.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional query methods can be added here if needed
}

