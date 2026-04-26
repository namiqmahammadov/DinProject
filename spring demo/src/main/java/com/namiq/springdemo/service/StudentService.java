package com.namiq.springdemo.service;

import com.namiq.springdemo.dao.entity.Student;
import com.namiq.springdemo.dao.reposiotry.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> findOlderThan20(EntityManager entityManager) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);
        Root<Student> studentRoot =query.from(Student.class);
        query.select(studentRoot)
                .where(criteriaBuilder.greaterThan(studentRoot.get("age"),20));
        return  entityManager.createQuery(query).getResultList();
    }
}
