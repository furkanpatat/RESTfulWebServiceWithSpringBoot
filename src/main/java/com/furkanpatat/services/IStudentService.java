package com.furkanpatat.services;

import com.furkanpatat.entities.Student;

import java.util.List;

public interface IStudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentByID(Integer id);
    public void deleteStudent(Integer id);
    public Student updateStudent(Integer id,Student updatedStudent);
}
