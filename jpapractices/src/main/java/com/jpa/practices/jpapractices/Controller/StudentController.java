package com.jpa.practices.jpapractices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.practices.jpapractices.Service.StudentService;
import com.jpa.practices.jpapractices.modal.Student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gpa")
  public List<Student> findStudentsByGpaAbove(@RequestParam Double gpa) {
    return studentService.findStudentsByGpaAbove(gpa);
  }
}
