package com.librarymanagementsystem.library.controllers;


import com.librarymanagementsystem.library.models.Student;
import com.librarymanagementsystem.library.services.student.IStudentsService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentsController {

    IStudentsService iStudentsService;
    public StudentsController(IStudentsService iStudentsService) {
        this.iStudentsService = iStudentsService;
    }

    @GetMapping
    public List<Student> list() {
        return iStudentsService.list();
    }

    @PostMapping
    public Student create(@RequestBody final Student student){
        return iStudentsService.create(student);
    }


    @GetMapping(value = "{id}")
    public Student get(@PathVariable Long id){
        return iStudentsService.get(id);

    }

    @RequestMapping(value = "{id}", method =RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        iStudentsService.delete(id);
    }


    @RequestMapping(value="{id}", method = RequestMethod.PUT)
    public Student update(@PathVariable Long id, @RequestBody Student student){
        Student existingStudent =iStudentsService.update(student);
        BeanUtils.copyProperties(student, existingStudent, "id");
        return iStudentsService.update(existingStudent);
    }


}
