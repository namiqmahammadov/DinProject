package com.namiq.libraryproject.dao.repository;

import com.namiq.libraryproject.dao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    boolean existsByIsbn(String isbn);
}
