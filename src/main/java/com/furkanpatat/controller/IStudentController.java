package com.furkanpatat.controller;

import com.furkanpatat.entities.Student;

import java.util.List;

public interface IStudentController {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentByID(Integer id);
}
