package com.example.CrudRapido.Service;

import com.example.CrudRapido.Entity.Student;
import com.example.CrudRapido.Repository.StudentRepository;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public void SaveOrUpdate(Student student){
        studentRepository.save(student);
    }
    public void Delete(Long id){
        studentRepository.deleteById(id);
    }

}
