package com.example.classmanager.repositories;

import com.example.classmanager.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Additional query methods can be added here if needed
}

