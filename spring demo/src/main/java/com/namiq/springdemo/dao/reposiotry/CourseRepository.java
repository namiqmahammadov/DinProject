package com.namiq.springdemo.dao.reposiotry;

import com.namiq.springdemo.dao.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
