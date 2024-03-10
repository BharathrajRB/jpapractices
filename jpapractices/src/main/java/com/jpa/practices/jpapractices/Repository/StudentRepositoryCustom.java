package com.jpa.practices.jpapractices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.practices.jpapractices.modal.Student;

import java.util.List;

public interface StudentRepositoryCustom {
  List<Student> findStudentsByGpaAbove(Double gpa);
}
