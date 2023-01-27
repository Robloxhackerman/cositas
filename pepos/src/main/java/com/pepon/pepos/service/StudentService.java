package com.pepon.pepos.service;

import com.pepon.pepos.models.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}