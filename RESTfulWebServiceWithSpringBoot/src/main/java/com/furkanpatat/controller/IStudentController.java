package com.furkanpatat.controller;

import com.furkanpatat.dto.DtoStudent;
import com.furkanpatat.dto.DtoStudentIU;
import com.furkanpatat.entities.Student;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface IStudentController {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentByID(Integer id);
    public void deleteStudent(Integer id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
