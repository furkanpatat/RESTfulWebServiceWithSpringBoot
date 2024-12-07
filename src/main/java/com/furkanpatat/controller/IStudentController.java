package com.furkanpatat.controller;

import com.furkanpatat.entities.Student;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface IStudentController {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentByID(Integer id);
    public void deleteStudent(Integer id);
    public Student updateStudent(Integer id,Student updatedStudent);
}
