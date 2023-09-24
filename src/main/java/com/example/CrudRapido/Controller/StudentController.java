package com.example.CrudRapido.Controller;

import com.example.CrudRapido.Entity.Student;
import com.example.CrudRapido.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }
    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("{studentId}") Long studentId){
        return studentService.getStudent(studentId);
    }
    @DeleteMapping ("/{studentId}")
    public void  saveUpdate (@PathVariable("studentId") Long studentId){
         studentService.Delete(studentId);
    }
    @PostMapping
    public Student saveUpdate (@RequestBody Student student){
        studentService.SaveOrUpdate(student);
        return student;
    }
}
