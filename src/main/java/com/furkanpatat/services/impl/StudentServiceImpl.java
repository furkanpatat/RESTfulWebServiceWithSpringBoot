package com.furkanpatat.services.impl;

import com.furkanpatat.entities.Student;
import com.furkanpatat.repository.StudentRepository;
import com.furkanpatat.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList =studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student getStudentByID(Integer id) {
       Optional<Student> optional = studentRepository.findById(id);
       if (optional.isPresent()) return optional.get();
       else return null;
    }
}
