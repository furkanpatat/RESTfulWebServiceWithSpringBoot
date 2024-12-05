package com.furkanpatat.controller.impl;
import com.furkanpatat.controller.IStudentController;
import com.furkanpatat.entities.Student;
import com.furkanpatat.services.IStudentService;
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
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @Override
    @GetMapping(path = "/list")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public Student getStudentByID(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentByID(id);
    }
}
