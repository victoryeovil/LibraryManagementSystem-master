package com.librarymanagementsystem.library.services.student;

import com.librarymanagementsystem.library.models.Student;

import java.util.List;


public interface IStudentsService {
    List<Student> list();
    Student  get(Long id);
    Student create(Student student);
    void delete(Long id);
    Student update(Student student);
}
