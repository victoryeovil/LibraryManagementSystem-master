package com.librarymanagementsystem.library.services.student;

import com.librarymanagementsystem.library.models.Student;
import com.librarymanagementsystem.library.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class StudentServiceImpl  implements IStudentsService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> list() {
       return studentRepository.findAll();
    }

    @Override
    public Student get(Long id) {
        return  studentRepository.getById(id);
    }

    @Override
    public Student create(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }
}
