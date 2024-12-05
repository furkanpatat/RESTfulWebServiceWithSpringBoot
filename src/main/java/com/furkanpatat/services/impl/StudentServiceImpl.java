package com.furkanpatat.services.impl;

import com.furkanpatat.entities.Student;
import com.furkanpatat.repository.StudentRepository;
import com.furkanpatat.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
