package com.namiq.springdemo.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.naming.Name;

@Entity
@Table(name="courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
}
