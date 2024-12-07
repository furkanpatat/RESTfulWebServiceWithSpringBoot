package com.furkanpatat.services;

import com.furkanpatat.dto.DtoStudent;
import com.furkanpatat.dto.DtoStudentIU;
import com.furkanpatat.entities.Student;

import java.util.List;

public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU student);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentByID(Integer id);
    public void deleteStudent(Integer id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
