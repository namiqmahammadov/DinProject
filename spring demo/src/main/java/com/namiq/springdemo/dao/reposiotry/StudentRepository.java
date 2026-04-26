package com.namiq.springdemo.dao.reposiotry;

import com.namiq.springdemo.dao.entity.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("SELECT st FROM Student  st  where  st.name=:name")
    List<Student> findByName(String name);
    @EntityGraph(attributePaths = "courses")
    List<Student> findAll();
}
