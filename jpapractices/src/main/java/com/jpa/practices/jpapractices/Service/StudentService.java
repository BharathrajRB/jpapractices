package com.jpa.practices.jpapractices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.practices.jpapractices.Repository.StudentRepository;
import com.jpa.practices.jpapractices.modal.Student;

@Service
public class StudentService {

  private final StudentRepository studentRepository;

  @Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> findStudentsByGpaAbove(Double gpa) {
    return studentRepository.findStudentsByGpaAbove(gpa);
  }
}
