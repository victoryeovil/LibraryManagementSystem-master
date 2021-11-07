package com.librarymanagementsystem.library.repositories;

import com.librarymanagementsystem.library.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
