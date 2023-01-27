package com.pepon.pepos.controller;

import com.pepon.pepos.models.Student;
import com.pepon.pepos.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentsController {

    @Autowired
    private StudentService studentServices;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentServices.saveStudent(student);
        return "se agrego el pepe";
    }

    @GetMapping("/getAll")
    public List<Student> list(){
        return studentServices.getAllStudents();
    }
}
