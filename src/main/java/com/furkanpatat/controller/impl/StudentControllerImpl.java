package com.furkanpatat.controller.impl;
import com.furkanpatat.controller.IStudentController;
import com.furkanpatat.dto.DtoStudent;
import com.furkanpatat.dto.DtoStudentIU;
import com.furkanpatat.entities.Student;
import com.furkanpatat.services.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api/student")
public class StudentControllerImpl implements IStudentController {
    @Autowired
    private IStudentService studentService;

    @Override
    @PostMapping("/save")
    public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
        return studentService.saveStudent(dtoStudentIU);
    }

    @Override
    @GetMapping(path = "/list")
    public List<DtoStudent> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoStudent getStudentByID(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentByID(id);
    }

    @DeleteMapping(path = "delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "update/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id") Integer id,@RequestBody DtoStudentIU dtoStudentIU) {
        return studentService.updateStudent(id,dtoStudentIU);
    }
}
