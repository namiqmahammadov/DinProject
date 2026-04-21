package com.namiq.libraryproject.dao.repository;

import com.namiq.libraryproject.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByEmail(String email);
}
