package com.jpa.practices.jpapractices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.practices.jpapractices.modal.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Predicate;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepositoryCustom {

  @PersistenceContext
  EntityManager em;

  @Override
  public List<Student> findStudentsByGpaAbove(Double gpa) {
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Student> cq = cb.createQuery(Student.class);

    Root<Student> student = cq.from(Student.class);
    Predicate gpaPredicate = cb.greaterThan(student.get("gpa"), gpa);
    cq.where(gpaPredicate);

    TypedQuery<Student> query = em.createQuery(cq);
    return query.getResultList();
  }
}